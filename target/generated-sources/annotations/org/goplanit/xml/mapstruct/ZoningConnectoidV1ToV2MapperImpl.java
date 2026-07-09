package org.goplanit.xml.mapstruct;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v2.Accesszone;
import org.goplanit.xml.generated.v2.XMLElementConnectoid;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-09T14:26:58+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Amazon.com Inc.)"
)
public class ZoningConnectoidV1ToV2MapperImpl implements ZoningConnectoidV1ToV2Mapper {

    @Override
    public XMLElementConnectoid toV2(org.goplanit.xml.generated.v1.XMLElementConnectoid source) {
        if ( source == null ) {
            return null;
        }

        XMLElementConnectoid xMLElementConnectoid = new XMLElementConnectoid();

        xMLElementConnectoid.setId( source.getId() );
        xMLElementConnectoid.setExternalid( source.getExternalid() );
        xMLElementConnectoid.setName( source.getName() );
        xMLElementConnectoid.setNoderef( source.getNoderef() );
        xMLElementConnectoid.setModes( source.getModes() );
        if ( source.getLength() != null ) {
            xMLElementConnectoid.setLength( BigDecimal.valueOf( source.getLength() ) );
        }

        xMLElementConnectoid.setType( org.goplanit.xml.mapstruct.ConnectoidEnumMapper.map(source.getType()) );
        if ( xMLElementConnectoid.getAccesszones() != null ) {
            List<Accesszone> list = java.util.Collections.emptyList();
            if ( list != null ) {
                xMLElementConnectoid.getAccesszones().addAll( list );
            }
        }

        return xMLElementConnectoid;
    }
}
