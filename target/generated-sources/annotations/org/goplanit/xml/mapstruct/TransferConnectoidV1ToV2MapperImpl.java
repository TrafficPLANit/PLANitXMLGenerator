package org.goplanit.xml.mapstruct;

import java.util.List;
import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v1.XMLElementTransferConnectoid;
import org.goplanit.xml.generated.v2.Accesszone;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-24T15:10:50+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class TransferConnectoidV1ToV2MapperImpl implements TransferConnectoidV1ToV2Mapper {

    @Override
    public org.goplanit.xml.generated.v2.XMLElementTransferConnectoid toV2(XMLElementTransferConnectoid source) {
        if ( source == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementTransferConnectoid xMLElementTransferConnectoid = new org.goplanit.xml.generated.v2.XMLElementTransferConnectoid();

        if ( xMLElementTransferConnectoid.getAccesszones() != null ) {
            List<Accesszone> list = mapV1Zones( source );
            if ( list != null ) {
                xMLElementTransferConnectoid.getAccesszones().addAll( list );
            }
        }
        xMLElementTransferConnectoid.setNoderef( mapNodeRefPlaceHolderLogic( source ) );
        xMLElementTransferConnectoid.setId( source.getId() );
        xMLElementTransferConnectoid.setExternalid( source.getExternalid() );
        xMLElementTransferConnectoid.setName( source.getName() );

        return xMLElementTransferConnectoid;
    }
}
