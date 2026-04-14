package org.goplanit.xml.mapstruct;

import org.goplanit.xml.generated.v2.ObjectFactory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ObjectFactory.class, PolymorphicResolver.class})
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
    default org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning toModel(
            org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning source)
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
}
