package org.goplanit.xml.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

@Mapper
public interface OdCellByCellMatrixNestedElementsMapper {

  org.goplanit.xml.generated.v2.ObjectFactory V2_FACTORY = new org.goplanit.xml.generated.v2.ObjectFactory();

  /**
   * Maps the origin element {@code <o ref="..">}. V1.O and V2.O are identical, so this copies the 'ref' attribute and
   * maps its nested 'd' elements.
   */
  org.goplanit.xml.generated.v2.O mapOrigin(org.goplanit.xml.generated.v1.O source);

  /**
   * Maps the destination element {@code <d ref="..">3600</d>}: its 'ref' and its float value (usually 'value' or
   * 'content').
   */
  org.goplanit.xml.generated.v2.D mapDestination(org.goplanit.xml.generated.v1.D source);

  /**
   * Factory methods, needed because JAXB classes often need the ObjectFactory to be recognised correctly by the
   * Marshaller later.
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
