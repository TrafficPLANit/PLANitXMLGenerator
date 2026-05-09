package org.goplanit.xml.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v1.XMLElementOdCellByCellMatrix;
import org.goplanit.xml.generated.v2.O;
import org.goplanit.xml.generated.v2.Odrow;
import org.goplanit.xml.generated.v2.XMLElementOdRawMatrix;
import org.goplanit.xml.generated.v2.XMLElementOdRowMatrix;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-09T21:03:26+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class OdMatrixMapperImpl implements OdMatrixMapper {

    private final OdCellByCellMatrixNestedElementsMapper odCellByCellMatrixNestedElementsMapper = Mappers.getMapper( OdCellByCellMatrixNestedElementsMapper.class );
    private final OdRawMatrixNestedElementsMapper odRawMatrixNestedElementsMapper = Mappers.getMapper( OdRawMatrixNestedElementsMapper.class );
    private final OdRowMatrixNestedElementsMapper odRowMatrixNestedElementsMapper = Mappers.getMapper( OdRowMatrixNestedElementsMapper.class );

    @Override
    public org.goplanit.xml.generated.v2.XMLElementOdCellByCellMatrix map(XMLElementOdCellByCellMatrix source) {
        if ( source == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementOdCellByCellMatrix xMLElementOdCellByCellMatrix = new org.goplanit.xml.generated.v2.XMLElementOdCellByCellMatrix();

        xMLElementOdCellByCellMatrix.setTimeperiodref( source.getTimeperiodref() );
        xMLElementOdCellByCellMatrix.setUserclassref( source.getUserclassref() );
        if ( xMLElementOdCellByCellMatrix.getOS() != null ) {
            List<O> list = oListToOList( source.getOS() );
            if ( list != null ) {
                xMLElementOdCellByCellMatrix.getOS().addAll( list );
            }
        }

        return xMLElementOdCellByCellMatrix;
    }

    @Override
    public XMLElementOdRawMatrix map(org.goplanit.xml.generated.v1.XMLElementOdRawMatrix source) {
        if ( source == null ) {
            return null;
        }

        XMLElementOdRawMatrix xMLElementOdRawMatrix = new XMLElementOdRawMatrix();

        xMLElementOdRawMatrix.setTimeperiodref( source.getTimeperiodref() );
        xMLElementOdRawMatrix.setUserclassref( source.getUserclassref() );
        xMLElementOdRawMatrix.setValues( odRawMatrixNestedElementsMapper.mapValues( source.getValues() ) );

        return xMLElementOdRawMatrix;
    }

    @Override
    public XMLElementOdRowMatrix map(org.goplanit.xml.generated.v1.XMLElementOdRowMatrix source) {
        if ( source == null ) {
            return null;
        }

        XMLElementOdRowMatrix xMLElementOdRowMatrix = new XMLElementOdRowMatrix();

        xMLElementOdRowMatrix.setTimeperiodref( source.getTimeperiodref() );
        xMLElementOdRowMatrix.setUserclassref( source.getUserclassref() );
        xMLElementOdRowMatrix.setDs( source.getDs() );
        if ( xMLElementOdRowMatrix.getOdrows() != null ) {
            List<Odrow> list = odrowListToOdrowList( source.getOdrows() );
            if ( list != null ) {
                xMLElementOdRowMatrix.getOdrows().addAll( list );
            }
        }

        return xMLElementOdRowMatrix;
    }

    protected List<O> oListToOList(List<org.goplanit.xml.generated.v1.O> list) {
        if ( list == null ) {
            return null;
        }

        List<O> list1 = new ArrayList<O>( list.size() );
        for ( org.goplanit.xml.generated.v1.O o : list ) {
            list1.add( odCellByCellMatrixNestedElementsMapper.mapOrigin( o ) );
        }

        return list1;
    }

    protected List<Odrow> odrowListToOdrowList(List<org.goplanit.xml.generated.v1.Odrow> list) {
        if ( list == null ) {
            return null;
        }

        List<Odrow> list1 = new ArrayList<Odrow>( list.size() );
        for ( org.goplanit.xml.generated.v1.Odrow odrow : list ) {
            list1.add( odRowMatrixNestedElementsMapper.mapRow( odrow ) );
        }

        return list1;
    }
}
