package org.goplanit.xml.mapstruct;

import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v1.Values;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-09T20:21:58+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class OdRawMatrixNestedElementsMapperImpl implements OdRawMatrixNestedElementsMapper {

    @Override
    public org.goplanit.xml.generated.v2.Values mapValues(Values source) {
        if ( source == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Values values = createValues();

        values.setValue( source.getValue() );
        values.setOs( source.getOs() );
        values.setDs( source.getDs() );

        return values;
    }
}
