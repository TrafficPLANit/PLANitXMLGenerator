package org.goplanit.xml.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ObjectFactory;

@Mapper
public interface OdRowMatrixNestedElementsMapper {

  org.goplanit.xml.generated.v2.ObjectFactory V2_FACTORY = new org.goplanit.xml.generated.v2.ObjectFactory();

  /**
   * Maps the <odrow> element.
   * This copies the 'ref' attribute and the CSV string content.
   */
  org.goplanit.xml.generated.v2.Odrow mapRow(
      org.goplanit.xml.generated.v1.Odrow source);

  /**
   * Factory method for the Odrow object.
   */
  @ObjectFactory
  default org.goplanit.xml.generated.v2.Odrow createOdrow() {
    return V2_FACTORY.createOdrow();
  }
}