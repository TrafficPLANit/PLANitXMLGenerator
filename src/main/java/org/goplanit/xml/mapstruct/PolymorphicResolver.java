package org.goplanit.xml.mapstruct;

import org.goplanit.xml.generated.v2.ObjectFactory;

/**
 * When XML elements are polymorphic we need to
 */
public class PolymorphicResolver {

    // We can't let MapStruct generate the sub-mappings here,
    // so we'll just handle the factory dispatching.
    private final ObjectFactory v2Factory = new ObjectFactory();

    public org.goplanit.xml.generated.v2.XMLElementOdMatrix resolveMatrix(
            org.goplanit.xml.generated.v1.XMLElementOdMatrix source) {

        if (source == null) return null;

        if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix) {
            return v2Factory.createXMLElementOdCellByCellMatrix();
        }
        if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRawMatrix) {
            return v2Factory.createXMLElementOdRawMatrix();
        }
        if (source instanceof org.goplanit.xml.generated.v1.XMLElementOdRowMatrix) {
            return v2Factory.createXMLElementOdRowMatrix();
        }

        return v2Factory.createXMLElementOdMatrix();
    }

}
