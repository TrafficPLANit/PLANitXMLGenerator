package org.goplanit.xml.mapstruct;

import org.mapstruct.factory.Mappers;

/**
 * When XML elements are polymorphic we need to deal with that explicitly
 */
public class PolymorphicResolver {

    public org.goplanit.xml.generated.v2.XMLElementOdMatrix resolveMatrix(
        org.goplanit.xml.generated.v1.XMLElementOdMatrix source) {

        // delegate to mapper
        return OdMatrixMapper.INSTANCE.toV2(source);
    }

}
