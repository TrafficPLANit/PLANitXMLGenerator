package org.goplanit.xml.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v2.D;
import org.goplanit.xml.generated.v2.O;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-11T12:32:08+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Amazon.com Inc.)"
)
public class OdCellByCellMatrixNestedElementsMapperImpl implements OdCellByCellMatrixNestedElementsMapper {

    @Override
    public O mapOrigin(org.goplanit.xml.generated.v1.O source) {
        if ( source == null ) {
            return null;
        }

        O o = createO();

        o.setRef( source.getRef() );
        if ( o.getDS() != null ) {
            List<D> list = dListToDList( source.getDS() );
            if ( list != null ) {
                o.getDS().addAll( list );
            }
        }

        return o;
    }

    @Override
    public D mapDestination(org.goplanit.xml.generated.v1.D source) {
        if ( source == null ) {
            return null;
        }

        D d = createD();

        d.setValue( source.getValue() );
        d.setRef( source.getRef() );

        return d;
    }

    protected List<D> dListToDList(List<org.goplanit.xml.generated.v1.D> list) {
        if ( list == null ) {
            return null;
        }

        List<D> list1 = new ArrayList<D>( list.size() );
        for ( org.goplanit.xml.generated.v1.D d : list ) {
            list1.add( mapDestination( d ) );
        }

        return list1;
    }
}
