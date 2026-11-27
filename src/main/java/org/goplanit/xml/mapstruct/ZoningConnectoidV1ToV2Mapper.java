package org.goplanit.xml.mapstruct;

import org.goplanit.xml.generated.v2.Connectoidtypetype;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * Versioning logic to convert a V1 connectoid to V2. This actually changed in terms of data structure and therefore
 * requires manual wiring. This is where the magic happens to be able to parse V1 data and spit out V2 memory models
 */
@Mapper
public interface ZoningConnectoidV1ToV2Mapper {

  ZoningConnectoidV1ToV2Mapper INSTANCE = Mappers.getMapper(ZoningConnectoidV1ToV2Mapper.class);

  /**
   * Maps the V1 Zoning Connectoid to the V2 Zoning Connectoid.
   * Note: accesszones is explicitly ignored/set to empty as per "inverted" logic.
   */
  @Mapping(target = "id", source = "id")
  @Mapping(target = "externalid", source = "externalid")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "noderef", source = "noderef")
  @Mapping(target = "modes", source = "modes")
  @Mapping(target = "length", source = "length") // Extension attribute in V2
  @Mapping(target = "type", expression = "java(org.goplanit.xml.mapstruct.ConnectoidEnumMapper.map(source.getType()))")
  @Mapping(target = "accesszones", expression = "java(java.util.Collections.emptyList())")
  org.goplanit.xml.generated.v2.XMLElementConnectoid toV2(org.goplanit.xml.generated.v1.XMLElementConnectoid source);

}