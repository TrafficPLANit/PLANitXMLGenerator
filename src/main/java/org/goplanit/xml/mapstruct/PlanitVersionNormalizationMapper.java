package org.goplanit.xml.mapstruct;

import org.goplanit.xml.generated.v2.ObjectFactory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Uses MapStruct library to expose functionality to map all legacy versions to the most recent version which then will
 * be used in PLANitIO for actual parsing. This way the business logic will never rely on legacy version for the
 * conversion for the memory model while still being able to parse older versions
 */
@Mapper(uses = {ObjectFactory.class, PolymorphicResolver.class, TransferConnectoidV1ToV2Mapper.class,
    ConnectoidEnumMapper.class})
public interface PlanitVersionNormalizationMapper {
    PlanitVersionNormalizationMapper INSTANCE = Mappers.getMapper(PlanitVersionNormalizationMapper.class);

    // --- Entry Points for V2 ---

    // The Full Root
    org.goplanit.xml.generated.v2.XMLElementPLANit toModel(org.goplanit.xml.generated.v2.XMLElementPLANit source);

    // Standalone Sub-roots
    default org.goplanit.xml.generated.v2.XMLElementMacroscopicNetwork toModel(
            org.goplanit.xml.generated.v2.XMLElementMacroscopicNetwork source){
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementMacroscopicDemand toModel(
            org.goplanit.xml.generated.v2.XMLElementMacroscopicDemand source){
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementDiscreteDemand toModel(
        org.goplanit.xml.generated.v2.XMLElementDiscreteDemand source){
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning toModel(
            org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning source)
    {
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementServiceNetwork toModel(
            org.goplanit.xml.generated.v2.XMLElementServiceNetwork source)
    {
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementRoutedServices toModel(
            org.goplanit.xml.generated.v2.XMLElementRoutedServices source)
    {
        return source;
    }
    default org.goplanit.xml.generated.v2.Macroscopicintermodal toModel(
            org.goplanit.xml.generated.v2.Macroscopicintermodal source)
    {
        return source;
    }
    default org.goplanit.xml.generated.v2.XMLElementMetadata toModel(
        org.goplanit.xml.generated.v2.XMLElementMetadata source)
    {
        return source;
    }

    // --- Entry Points for V1 ---
    // Repeat for V1 package...
    org.goplanit.xml.generated.v2.XMLElementPLANit toModel(
            org.goplanit.xml.generated.v1.XMLElementPLANit source);
    org.goplanit.xml.generated.v2.XMLElementMacroscopicNetwork toModel(
            org.goplanit.xml.generated.v1.XMLElementMacroscopicNetwork source);
    org.goplanit.xml.generated.v2.XMLElementMacroscopicDemand toModel(
            org.goplanit.xml.generated.v1.XMLElementMacroscopicDemand source);
    org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning toModel(
            org.goplanit.xml.generated.v1.XMLElementMacroscopicZoning source);
    org.goplanit.xml.generated.v2.XMLElementServiceNetwork toModel(
            org.goplanit.xml.generated.v1.XMLElementServiceNetwork source);
    org.goplanit.xml.generated.v2.XMLElementRoutedServices toModel(
            org.goplanit.xml.generated.v1.XMLElementRoutedServices source);
    org.goplanit.xml.generated.v2.Macroscopicintermodal toModel(
            org.goplanit.xml.generated.v1.Macroscopicintermodal source);
    org.goplanit.xml.generated.v2.XMLElementMetadata toModel(
        org.goplanit.xml.generated.v1.XMLElementMetadata source);
}
