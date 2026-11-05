package org.goplanit.xml.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;
import org.mapstruct.factory.Mappers;

/**
 * Base mapping for top level, nested elements are dealt with separately because they won't be populated here
 * properly.
 * <p>
 *   Painful manual mapping needed because we have a polymorphic base matrix xsd definitino and then derived
 *   extensions which are too hard for mapstruct to deal with out-of-the-box so we need to nudge it.
 * </p>
 */
@Mapper(uses = { OdCellByCellMatrixNestedElementsMapper.class,
    OdRawMatrixNestedElementsMapper.class, OdRowMatrixNestedElementsMapper.class })
public interface OdMatrixMapper {

  OdMatrixMapper INSTANCE = Mappers.getMapper(OdMatrixMapper.class);
  org.goplanit.xml.generated.v2.ObjectFactory V2_FACTORY = new org.goplanit.xml.generated.v2.ObjectFactory();

  /**
   * Manual delegation ensures we cast to the subclass so MapStruct
   * can see the subclass-specific fields (o, values, odrow).
   */
  default org.goplanit.xml.generated.v2.XMLElementOdMatrix toV2(
      org.goplanit.xml.generated.v1.XMLElementOdMatrix source) {

    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix) {
      return map((org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix) source);
    }
    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRawMatrix) {
      return map((org.goplanit.xml.generated.v1.XMLElementOdRawMatrix) source);
    }
    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRowMatrix) {
      return map((org.goplanit.xml.generated.v1.XMLElementOdRowMatrix) source);
    }
    return null;
  }

  /**
   * This replaces the logic in your PolymorphicResolver.
   * MapStruct calls this automatically to instantiate the target object.
   */
  @ObjectFactory
  default org.goplanit.xml.generated.v2.XMLElementOdMatrix create(org.goplanit.xml.generated.v1.XMLElementOdMatrix source) {
    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix) {
      return V2_FACTORY.createXMLElementOdCellByCellMatrix();
    }
    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRawMatrix) {
      return V2_FACTORY.createXMLElementOdRawMatrix();
    }
    if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRowMatrix) {
      return V2_FACTORY.createXMLElementOdRowMatrix();
    }

    return V2_FACTORY.createXMLElementOdMatrix();
  }

  // --- Explicit 1:1 Subclass Mappings ---
  // Since field names match (o -> o, d -> d, values -> values), no @Mapping is needed.
  // MapStruct uses the 'uses' mappers to convert the items within these fields.
  org.goplanit.xml.generated.v2.XMLElementOdCellByCellMatrix map(
      org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix source);

  org.goplanit.xml.generated.v2.XMLElementOdRawMatrix map(
      org.goplanit.xml.generated.v1.XMLElementOdRawMatrix source);

  org.goplanit.xml.generated.v2.XMLElementOdRowMatrix map(
      org.goplanit.xml.generated.v1.XMLElementOdRowMatrix source);

}