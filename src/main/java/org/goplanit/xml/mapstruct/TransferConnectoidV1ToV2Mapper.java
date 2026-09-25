package org.goplanit.xml.mapstruct;

import org.goplanit.xml.generated.v1.Connectoidnodelocationtype;
import org.goplanit.xml.generated.v1.XMLElementTransferConnectoid;
import org.goplanit.xml.generated.v2.Accesszone;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Versioning logic to convert a V1 connectoid to V2. This actually changed in terms of data structure and therefore
 * requires manual wiring. This is where the magic happens to be able to parse V1 data and spit out V2 memory models
 */
@Mapper
public interface TransferConnectoidV1ToV2Mapper {

  TransferConnectoidV1ToV2Mapper INSTANCE = Mappers.getMapper(TransferConnectoidV1ToV2Mapper.class);
  Logger LOGGER = Logger.getLogger(TransferConnectoidV1ToV2Mapper.class.getName());

  /** Placeholder to indicate that business logic must resolve the node from the link segment reference downstream node*/
  static final String TO_BE_POPULATED_FROM_LSREFS_DOWNSTREAM = "TO_BE_POPULATED_FROM_LSREFS_DOWNSTREAM";

  /** Placeholder to indicate that business logic must resolve the node from the link segment reference upstream node */
  static final String TO_BE_POPULATED_FROM_LSREFS_UPSTREAM = "TO_BE_POPULATED_FROM_LSREFS_UPSTREAM";

  @Mapping(target = "accesszones", source = "source", qualifiedByName = "mapV1ConnectoidToV2AccessZones")
  @Mapping(target = "noderef", source = "source", qualifiedByName = "mapNodeRefPlaceHolder")
  @Mapping(target = "id", source = "id")
  @Mapping(target = "externalid", source = "externalid")
  @Mapping(target = "name", source = "name")
  // We don't map 'type' to the target, but we tell MapStruct we handled the source 'type'
  @BeanMapping(ignoreUnmappedSourceProperties = {"type", "length", "tzrefs", "lsref", "loc"}) // mismatched between v1 and v2 and handled manually --> tell mapstruct to not worry
  org.goplanit.xml.generated.v2.XMLElementTransferConnectoid toV2(
      org.goplanit.xml.generated.v1.XMLElementTransferConnectoid source);

  /**
   * Depending on orientation we use a different placeholder string for parsing logic
   * @param v1 to use
   * @return result
   */
  @Named("mapNodeRefPlaceHolder")
  default String mapNodeRefPlaceHolderLogic(XMLElementTransferConnectoid v1) {
    return v1.getLoc().equals(Connectoidnodelocationtype.UPSTREAM) ? TO_BE_POPULATED_FROM_LSREFS_UPSTREAM :
        TO_BE_POPULATED_FROM_LSREFS_DOWNSTREAM;
  }

  @Named("mapV1ConnectoidToV2AccessZones")
  default List<Accesszone> mapV1Zones(XMLElementTransferConnectoid v1) {
    if (v1.getTzrefs() == null || v1.getTzrefs().isBlank()) {
      return Collections.emptyList();
    }

    return Arrays.stream(v1.getTzrefs().split(","))
        .map(ref -> {
          Accesszone az = new Accesszone();
          az.setRef(ref.trim());
          az.setModes(v1.getModes());

          // V1 lsref is now mapped to accesszone.lsrefs in V2 to assist business logic resolution
          az.setLsrefs(v1.getLsref());

          // --- Safe Length Conversion ---
          if (v1.getLength() != null) {
            double length = v1.getLength();
            if (Double.isNaN(length) || Double.isInfinite(length)) {
              LOGGER.warning(() -> String.format(
                  "Connectoid ID %s: Invalid length %f (NaN/Infinite) found in V1. Setting to 0.0.",
                  v1.getId(), length));
              az.setLengthkm(BigDecimal.ZERO);
            } else {
              az.setLengthkm(BigDecimal.valueOf(length));
            }
          }

          // --- Enum Type Conversion ---
          if (v1.getType() != null) {
            az.setType(ConnectoidEnumMapper.map(v1.getType()));
          }

          return az;
        })
        .collect(Collectors.toList());
  }
}