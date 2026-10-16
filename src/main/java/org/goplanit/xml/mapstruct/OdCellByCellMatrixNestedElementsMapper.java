package org.goplanit.xml.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

@Mapper
public interface OdCellByCellMatrixNestedElementsMapper {

  org.goplanit.xml.generated.v2.ObjectFactory V2_FACTORY = new org.goplanit.xml.generated.v2.ObjectFactory();

  /**
   * 1. The Origin Bridge
   * Maps <o ref="..">.
   * Since V1.O and V2.O are identical, this wires the 'ref' attribute
   * and triggers the mapping of its internal 'd' elements.
   */
  org.goplanit.xml.generated.v2.O mapOrigin(org.goplanit.xml.generated.v1.O source);

  /**
   * 2. The Destination Bridge
   * Maps <d ref="..">3600</d>.
   * This wires the 'ref' and the float value (usually 'value' or 'content').
   */
  org.goplanit.xml.generated.v2.D mapDestination(org.goplanit.xml.generated.v1.D source);

  /**
   * 3. Factory methods
   * Essential because JAXB classes often need the ObjectFactory
   * to be recognized correctly by the Marshaller later.
   */
  @ObjectFactory
  default org.goplanit.xml.generated.v2.O createO() {
    return V2_FACTORY.createO();
  }

  @ObjectFactory
  default org.goplanit.xml.generated.v2.D createD() {
    return V2_FACTORY.createD();
  }
}
