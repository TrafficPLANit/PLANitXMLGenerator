package org.goplanit.xml.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

@Mapper
public interface OdRawMatrixNestedElementsMapper {

  org.goplanit.xml.generated.v2.ObjectFactory V2_FACTORY = new org.goplanit.xml.generated.v2.ObjectFactory();

  /**
   * Maps the <values> element.
   * This will automatically map the String content (the CSV data)
   * and the attributes 'os' and 'ds' if they exist in both versions.
   */
  org.goplanit.xml.generated.v2.Values mapValues(org.goplanit.xml.generated.v1.Values source);

  /**
   * Factory method for the Values object.
   * JAXB usually names this specifically in the ObjectFactory.
   */
  @ObjectFactory
  default org.goplanit.xml.generated.v2.Values createValues() {
    return V2_FACTORY.createValues();
  }
}
