package org.goplanit.xml.mapstruct;

import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v1.Odrow;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-16T17:44:01+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class OdRowMatrixNestedElementsMapperImpl implements OdRowMatrixNestedElementsMapper {

    @Override
    public org.goplanit.xml.generated.v2.Odrow mapRow(Odrow source) {
        if ( source == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Odrow odrow = createOdrow();

        odrow.setValue( source.getValue() );
        odrow.setRef( source.getRef() );

        return odrow;
    }
}
