package org.goplanit.xml.mapstruct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.goplanit.xml.generated.v1.Departure;
import org.goplanit.xml.generated.v1.Durationunit;
import org.goplanit.xml.generated.v1.Leg;
import org.goplanit.xml.generated.v1.LengthUnit;
import org.goplanit.xml.generated.v1.Link;
import org.goplanit.xml.generated.v1.MotorisationType;
import org.goplanit.xml.generated.v1.Schedule;
import org.goplanit.xml.generated.v1.Servicelayers;
import org.goplanit.xml.generated.v1.Timeperiod;
import org.goplanit.xml.generated.v1.TrackType;
import org.goplanit.xml.generated.v1.Typevalues;
import org.goplanit.xml.generated.v1.Userclass;
import org.goplanit.xml.generated.v1.VehicularType;
import org.goplanit.xml.generated.v1.XMLElementCentroid;
import org.goplanit.xml.generated.v1.XMLElementColumns;
import org.goplanit.xml.generated.v1.XMLElementDepartures;
import org.goplanit.xml.generated.v1.XMLElementLinkSegmentTypes;
import org.goplanit.xml.generated.v1.XMLElementMacroscopicDemand;
import org.goplanit.xml.generated.v1.XMLElementModes;
import org.goplanit.xml.generated.v1.XMLElementNodes;
import org.goplanit.xml.generated.v1.XMLElementOutputConfiguration;
import org.goplanit.xml.generated.v1.XMLElementPhysicalFeatures;
import org.goplanit.xml.generated.v1.XMLElementRelativeTimings;
import org.goplanit.xml.generated.v1.XMLElementRoutedTrips;
import org.goplanit.xml.generated.v1.XMLElementService;
import org.goplanit.xml.generated.v1.XMLElementServiceLeg;
import org.goplanit.xml.generated.v1.XMLElementServiceLegs;
import org.goplanit.xml.generated.v1.XMLElementTimePeriods;
import org.goplanit.xml.generated.v1.XMLElementTransferZone;
import org.goplanit.xml.generated.v1.XMLElementTransferZoneAccess;
import org.goplanit.xml.generated.v1.XMLElementTransferZoneGroups;
import org.goplanit.xml.generated.v1.XMLElementUsabilityFeatures;
import org.goplanit.xml.generated.v1.Zone;
import org.goplanit.xml.generated.v2.Access;
import org.goplanit.xml.generated.v2.CustomPropertiesType;
import org.goplanit.xml.generated.v2.Direction;
import org.goplanit.xml.generated.v2.EntryElement;
import org.goplanit.xml.generated.v2.Frequency;
import org.goplanit.xml.generated.v2.Legsegment;
import org.goplanit.xml.generated.v2.Macroscopicintermodal;
import org.goplanit.xml.generated.v2.Mode;
import org.goplanit.xml.generated.v2.Node;
import org.goplanit.xml.generated.v2.ObjectFactory;
import org.goplanit.xml.generated.v2.Servicenode;
import org.goplanit.xml.generated.v2.TimePeriodType;
import org.goplanit.xml.generated.v2.TimePeriodsContainerType;
import org.goplanit.xml.generated.v2.TimeUnit;
import org.goplanit.xml.generated.v2.Transferzonetype;
import org.goplanit.xml.generated.v2.Travellertype;
import org.goplanit.xml.generated.v2.Unitsvalues;
import org.goplanit.xml.generated.v2.XMLElementAccessGroup;
import org.goplanit.xml.generated.v2.XMLElementColumn;
import org.goplanit.xml.generated.v2.XMLElementConfiguration;
import org.goplanit.xml.generated.v2.XMLElementConnectoid;
import org.goplanit.xml.generated.v2.XMLElementConnectoids;
import org.goplanit.xml.generated.v2.XMLElementCsvdata;
import org.goplanit.xml.generated.v2.XMLElementDemandConfiguration;
import org.goplanit.xml.generated.v2.XMLElementDuration;
import org.goplanit.xml.generated.v2.XMLElementInfrastructureLayer;
import org.goplanit.xml.generated.v2.XMLElementInfrastructureLayers;
import org.goplanit.xml.generated.v2.XMLElementIteration;
import org.goplanit.xml.generated.v2.XMLElementLayerConfiguration;
import org.goplanit.xml.generated.v2.XMLElementLinkLengthType;
import org.goplanit.xml.generated.v2.XMLElementLinkSegment;
import org.goplanit.xml.generated.v2.XMLElementLinkSegmentType;
import org.goplanit.xml.generated.v2.XMLElementLinks;
import org.goplanit.xml.generated.v2.XMLElementMacroscopicNetwork;
import org.goplanit.xml.generated.v2.XMLElementMacroscopicZoning;
import org.goplanit.xml.generated.v2.XMLElementMetadata;
import org.goplanit.xml.generated.v2.XMLElementOdDemands;
import org.goplanit.xml.generated.v2.XMLElementOdMatrix;
import org.goplanit.xml.generated.v2.XMLElementOutputTimePeriod;
import org.goplanit.xml.generated.v2.XMLElementPLANit;
import org.goplanit.xml.generated.v2.XMLElementRoutedServices;
import org.goplanit.xml.generated.v2.XMLElementRoutedServicesLayer;
import org.goplanit.xml.generated.v2.XMLElementRoutedTrip;
import org.goplanit.xml.generated.v2.XMLElementServiceNetwork;
import org.goplanit.xml.generated.v2.XMLElementServiceNetworkLayer;
import org.goplanit.xml.generated.v2.XMLElementServiceNodes;
import org.goplanit.xml.generated.v2.XMLElementServices;
import org.goplanit.xml.generated.v2.XMLElementSimulation;
import org.goplanit.xml.generated.v2.XMLElementTransferConnectoid;
import org.goplanit.xml.generated.v2.XMLElementTransferGroup;
import org.goplanit.xml.generated.v2.XMLElementTransferZones;
import org.goplanit.xml.generated.v2.XMLElementTravellerTypes;
import org.goplanit.xml.generated.v2.XMLElementUserClasses;
import org.goplanit.xml.generated.v2.XMLElementZones;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-17T14:19:43+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Amazon.com Inc.)"
)
public class PlanitVersionNormalizationMapperImpl implements PlanitVersionNormalizationMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final PolymorphicResolver polymorphicResolver = new PolymorphicResolver();
    private final TransferConnectoidV1ToV2Mapper transferConnectoidV1ToV2Mapper = TransferConnectoidV1ToV2Mapper.INSTANCE;

    @Override
    public XMLElementPLANit toModel(XMLElementPLANit source) {
        if ( source == null ) {
            return null;
        }

        XMLElementPLANit xMLElementPLANit = objectFactory.createXMLElementPLANit();

        xMLElementPLANit.setMacroscopicnetwork( toModel( source.getMacroscopicnetwork() ) );
        xMLElementPLANit.setMacroscopicdemand( toModel( source.getMacroscopicdemand() ) );
        xMLElementPLANit.setMacroscopiczoning( toModel( source.getMacroscopiczoning() ) );
        xMLElementPLANit.setServicenetwork( toModel( source.getServicenetwork() ) );
        xMLElementPLANit.setRoutedservices( toModel( source.getRoutedservices() ) );

        return xMLElementPLANit;
    }

    @Override
    public XMLElementPLANit toModel(org.goplanit.xml.generated.v1.XMLElementPLANit source) {
        if ( source == null ) {
            return null;
        }

        XMLElementPLANit xMLElementPLANit = objectFactory.createXMLElementPLANit();

        xMLElementPLANit.setMacroscopicnetwork( toModel( source.getMacroscopicnetwork() ) );
        xMLElementPLANit.setMacroscopicdemand( toModel( source.getMacroscopicdemand() ) );
        xMLElementPLANit.setMacroscopiczoning( toModel( source.getMacroscopiczoning() ) );
        xMLElementPLANit.setServicenetwork( toModel( source.getServicenetwork() ) );
        xMLElementPLANit.setRoutedservices( toModel( source.getRoutedservices() ) );

        return xMLElementPLANit;
    }

    @Override
    public XMLElementMacroscopicNetwork toModel(org.goplanit.xml.generated.v1.XMLElementMacroscopicNetwork source) {
        if ( source == null ) {
            return null;
        }

        XMLElementMacroscopicNetwork xMLElementMacroscopicNetwork = objectFactory.createXMLElementMacroscopicNetwork();

        xMLElementMacroscopicNetwork.setId( source.getId() );
        xMLElementMacroscopicNetwork.setConfiguration( xMLElementConfigurationToXMLElementConfiguration( source.getConfiguration() ) );
        xMLElementMacroscopicNetwork.setInfrastructurelayers( xMLElementInfrastructureLayersToXMLElementInfrastructureLayers( source.getInfrastructurelayers() ) );

        return xMLElementMacroscopicNetwork;
    }

    @Override
    public org.goplanit.xml.generated.v2.XMLElementMacroscopicDemand toModel(XMLElementMacroscopicDemand source) {
        if ( source == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementMacroscopicDemand xMLElementMacroscopicDemand = objectFactory.createXMLElementMacroscopicDemand();

        xMLElementMacroscopicDemand.setId( source.getId() );
        xMLElementMacroscopicDemand.setDemandconfiguration( xMLElementDemandConfigurationToXMLElementDemandConfiguration( source.getDemandconfiguration() ) );
        xMLElementMacroscopicDemand.setOddemands( xMLElementOdDemandsToXMLElementOdDemands( source.getOddemands() ) );

        return xMLElementMacroscopicDemand;
    }

    @Override
    public XMLElementMacroscopicZoning toModel(org.goplanit.xml.generated.v1.XMLElementMacroscopicZoning source) {
        if ( source == null ) {
            return null;
        }

        XMLElementMacroscopicZoning xMLElementMacroscopicZoning = objectFactory.createXMLElementMacroscopicZoning();

        xMLElementMacroscopicZoning.setId( source.getId() );
        xMLElementMacroscopicZoning.setZones( xMLElementZonesToXMLElementZones( source.getZones() ) );
        xMLElementMacroscopicZoning.setIntermodal( toModel( source.getIntermodal() ) );
        xMLElementMacroscopicZoning.setSrsname( source.getSrsname() );

        return xMLElementMacroscopicZoning;
    }

    @Override
    public XMLElementServiceNetwork toModel(org.goplanit.xml.generated.v1.XMLElementServiceNetwork source) {
        if ( source == null ) {
            return null;
        }

        XMLElementServiceNetwork xMLElementServiceNetwork = objectFactory.createXMLElementServiceNetwork();

        xMLElementServiceNetwork.setId( source.getId() );
        xMLElementServiceNetwork.setParentnetwork( source.getParentnetwork() );
        if ( xMLElementServiceNetwork.getServicenetworklayers() != null ) {
            List<XMLElementServiceNetworkLayer> list = xMLElementServiceNetworkLayerListToXMLElementServiceNetworkLayerList( source.getServicenetworklayers() );
            if ( list != null ) {
                xMLElementServiceNetwork.getServicenetworklayers().addAll( list );
            }
        }

        return xMLElementServiceNetwork;
    }

    @Override
    public XMLElementRoutedServices toModel(org.goplanit.xml.generated.v1.XMLElementRoutedServices source) {
        if ( source == null ) {
            return null;
        }

        XMLElementRoutedServices xMLElementRoutedServices = objectFactory.createXMLElementRoutedServices();

        xMLElementRoutedServices.setId( source.getId() );
        xMLElementRoutedServices.setExternalid( source.getExternalid() );
        xMLElementRoutedServices.setServicelayers( servicelayersToServicelayers( source.getServicelayers() ) );

        return xMLElementRoutedServices;
    }

    @Override
    public Macroscopicintermodal toModel(org.goplanit.xml.generated.v1.Macroscopicintermodal source) {
        if ( source == null ) {
            return null;
        }

        Macroscopicintermodal macroscopicintermodal = objectFactory.createMacroscopicintermodal();

        macroscopicintermodal.setTransferzones( xMLElementTransferZonesToXMLElementTransferZones( source.getTransferzones() ) );
        macroscopicintermodal.setTransferzoneaccess( xMLElementTransferZoneAccessToXMLElementTransferZoneAccess( source.getTransferzoneaccess() ) );
        macroscopicintermodal.setTransferzonegroups( xMLElementTransferZoneGroupsToXMLElementTransferZoneGroups( source.getTransferzonegroups() ) );

        return macroscopicintermodal;
    }

    @Override
    public XMLElementMetadata toModel(org.goplanit.xml.generated.v1.XMLElementMetadata source) {
        if ( source == null ) {
            return null;
        }

        XMLElementMetadata xMLElementMetadata = objectFactory.createXMLElementMetadata();

        xMLElementMetadata.setTimestamp( source.getTimestamp() );
        xMLElementMetadata.setVersion( source.getVersion() );
        xMLElementMetadata.setDescription( source.getDescription() );
        xMLElementMetadata.setOutputconfiguration( xMLElementOutputConfigurationToXMLElementOutputConfiguration( source.getOutputconfiguration() ) );
        xMLElementMetadata.setSimulation( xMLElementSimulationToXMLElementSimulation( source.getSimulation() ) );
        xMLElementMetadata.setColumns( xMLElementColumnsToXMLElementColumns( source.getColumns() ) );

        return xMLElementMetadata;
    }

    protected org.goplanit.xml.generated.v2.VehicularType vehicularTypeToVehicularType(VehicularType vehicularType) {
        if ( vehicularType == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.VehicularType vehicularType1;

        switch ( vehicularType ) {
            case VEHICLE: vehicularType1 = org.goplanit.xml.generated.v2.VehicularType.VEHICLE;
            break;
            case NO_VEHICLE: vehicularType1 = org.goplanit.xml.generated.v2.VehicularType.NO_VEHICLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + vehicularType );
        }

        return vehicularType1;
    }

    protected org.goplanit.xml.generated.v2.MotorisationType motorisationTypeToMotorisationType(MotorisationType motorisationType) {
        if ( motorisationType == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.MotorisationType motorisationType1;

        switch ( motorisationType ) {
            case MOTORISED: motorisationType1 = org.goplanit.xml.generated.v2.MotorisationType.MOTORISED;
            break;
            case NON_MOTORISED: motorisationType1 = org.goplanit.xml.generated.v2.MotorisationType.NON_MOTORISED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + motorisationType );
        }

        return motorisationType1;
    }

    protected org.goplanit.xml.generated.v2.TrackType trackTypeToTrackType(TrackType trackType) {
        if ( trackType == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.TrackType trackType1;

        switch ( trackType ) {
            case ROAD: trackType1 = org.goplanit.xml.generated.v2.TrackType.ROAD;
            break;
            case RAIL: trackType1 = org.goplanit.xml.generated.v2.TrackType.RAIL;
            break;
            case WATER: trackType1 = org.goplanit.xml.generated.v2.TrackType.WATER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + trackType );
        }

        return trackType1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementPhysicalFeatures xMLElementPhysicalFeaturesToXMLElementPhysicalFeatures(XMLElementPhysicalFeatures xMLElementPhysicalFeatures) {
        if ( xMLElementPhysicalFeatures == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementPhysicalFeatures xMLElementPhysicalFeatures1 = objectFactory.createXMLElementPhysicalFeatures();

        xMLElementPhysicalFeatures1.setVehicletype( vehicularTypeToVehicularType( xMLElementPhysicalFeatures.getVehicletype() ) );
        xMLElementPhysicalFeatures1.setMotorisationtype( motorisationTypeToMotorisationType( xMLElementPhysicalFeatures.getMotorisationtype() ) );
        xMLElementPhysicalFeatures1.setTracktype( trackTypeToTrackType( xMLElementPhysicalFeatures.getTracktype() ) );

        return xMLElementPhysicalFeatures1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementUsabilityFeatures xMLElementUsabilityFeaturesToXMLElementUsabilityFeatures(XMLElementUsabilityFeatures xMLElementUsabilityFeatures) {
        if ( xMLElementUsabilityFeatures == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementUsabilityFeatures xMLElementUsabilityFeatures1 = objectFactory.createXMLElementUsabilityFeatures();

        xMLElementUsabilityFeatures1.setUsedtotype( UseOfModeEnumMapper.map( xMLElementUsabilityFeatures.getUsedtotype() ) );

        return xMLElementUsabilityFeatures1;
    }

    protected Mode modeToMode(org.goplanit.xml.generated.v1.Mode mode) {
        if ( mode == null ) {
            return null;
        }

        Mode mode1 = objectFactory.createMode();

        mode1.setName( mode.getName() );
        mode1.setMaxspeed( mode.getMaxspeed() );
        mode1.setPcu( mode.getPcu() );
        mode1.setPhysicalfeatures( xMLElementPhysicalFeaturesToXMLElementPhysicalFeatures( mode.getPhysicalfeatures() ) );
        mode1.setUsabilityfeatures( xMLElementUsabilityFeaturesToXMLElementUsabilityFeatures( mode.getUsabilityfeatures() ) );
        mode1.setId( mode.getId() );
        mode1.setExternalid( mode.getExternalid() );
        mode1.setPredefined( mode.isPredefined() );

        return mode1;
    }

    protected List<Mode> modeListToModeList(List<org.goplanit.xml.generated.v1.Mode> list) {
        if ( list == null ) {
            return null;
        }

        List<Mode> list1 = new ArrayList<Mode>( list.size() );
        for ( org.goplanit.xml.generated.v1.Mode mode : list ) {
            list1.add( modeToMode( mode ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementModes xMLElementModesToXMLElementModes(XMLElementModes xMLElementModes) {
        if ( xMLElementModes == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementModes xMLElementModes1 = objectFactory.createXMLElementModes();

        if ( xMLElementModes1.getModes() != null ) {
            List<Mode> list = modeListToModeList( xMLElementModes.getModes() );
            if ( list != null ) {
                xMLElementModes1.getModes().addAll( list );
            }
        }

        return xMLElementModes1;
    }

    protected XMLElementConfiguration xMLElementConfigurationToXMLElementConfiguration(org.goplanit.xml.generated.v1.XMLElementConfiguration xMLElementConfiguration) {
        if ( xMLElementConfiguration == null ) {
            return null;
        }

        XMLElementConfiguration xMLElementConfiguration1 = objectFactory.createXMLElementConfiguration();

        xMLElementConfiguration1.setModes( xMLElementModesToXMLElementModes( xMLElementConfiguration.getModes() ) );

        return xMLElementConfiguration1;
    }

    protected XMLElementAccessGroup xMLElementAccessGroupToXMLElementAccessGroup(org.goplanit.xml.generated.v1.XMLElementAccessGroup xMLElementAccessGroup) {
        if ( xMLElementAccessGroup == null ) {
            return null;
        }

        XMLElementAccessGroup xMLElementAccessGroup1 = objectFactory.createXMLElementAccessGroup();

        xMLElementAccessGroup1.setMaxspeed( xMLElementAccessGroup.getMaxspeed() );
        xMLElementAccessGroup1.setCritspeed( xMLElementAccessGroup.getCritspeed() );
        xMLElementAccessGroup1.setModerefs( xMLElementAccessGroup.getModerefs() );

        return xMLElementAccessGroup1;
    }

    protected List<XMLElementAccessGroup> xMLElementAccessGroupListToXMLElementAccessGroupList(List<org.goplanit.xml.generated.v1.XMLElementAccessGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementAccessGroup> list1 = new ArrayList<XMLElementAccessGroup>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementAccessGroup xMLElementAccessGroup : list ) {
            list1.add( xMLElementAccessGroupToXMLElementAccessGroup( xMLElementAccessGroup ) );
        }

        return list1;
    }

    protected Access accessToAccess(org.goplanit.xml.generated.v1.Access access) {
        if ( access == null ) {
            return null;
        }

        Access access1 = objectFactory.createAccess();

        if ( access1.getAccessgroups() != null ) {
            List<XMLElementAccessGroup> list = xMLElementAccessGroupListToXMLElementAccessGroupList( access.getAccessgroups() );
            if ( list != null ) {
                access1.getAccessgroups().addAll( list );
            }
        }

        return access1;
    }

    protected XMLElementLinkSegmentType xMLElementLinkSegmentTypeToXMLElementLinkSegmentType(org.goplanit.xml.generated.v1.XMLElementLinkSegmentType xMLElementLinkSegmentType) {
        if ( xMLElementLinkSegmentType == null ) {
            return null;
        }

        XMLElementLinkSegmentType xMLElementLinkSegmentType1 = objectFactory.createXMLElementLinkSegmentType();

        xMLElementLinkSegmentType1.setName( xMLElementLinkSegmentType.getName() );
        xMLElementLinkSegmentType1.setMaxdensitylane( xMLElementLinkSegmentType.getMaxdensitylane() );
        xMLElementLinkSegmentType1.setCapacitylane( xMLElementLinkSegmentType.getCapacitylane() );
        xMLElementLinkSegmentType1.setAccess( accessToAccess( xMLElementLinkSegmentType.getAccess() ) );
        xMLElementLinkSegmentType1.setId( xMLElementLinkSegmentType.getId() );
        xMLElementLinkSegmentType1.setExternalid( xMLElementLinkSegmentType.getExternalid() );

        return xMLElementLinkSegmentType1;
    }

    protected List<XMLElementLinkSegmentType> xMLElementLinkSegmentTypeListToXMLElementLinkSegmentTypeList(List<org.goplanit.xml.generated.v1.XMLElementLinkSegmentType> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementLinkSegmentType> list1 = new ArrayList<XMLElementLinkSegmentType>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementLinkSegmentType xMLElementLinkSegmentType : list ) {
            list1.add( xMLElementLinkSegmentTypeToXMLElementLinkSegmentType( xMLElementLinkSegmentType ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementLinkSegmentTypes xMLElementLinkSegmentTypesToXMLElementLinkSegmentTypes(XMLElementLinkSegmentTypes xMLElementLinkSegmentTypes) {
        if ( xMLElementLinkSegmentTypes == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementLinkSegmentTypes xMLElementLinkSegmentTypes1 = objectFactory.createXMLElementLinkSegmentTypes();

        if ( xMLElementLinkSegmentTypes1.getLinksegmenttypes() != null ) {
            List<XMLElementLinkSegmentType> list = xMLElementLinkSegmentTypeListToXMLElementLinkSegmentTypeList( xMLElementLinkSegmentTypes.getLinksegmenttypes() );
            if ( list != null ) {
                xMLElementLinkSegmentTypes1.getLinksegmenttypes().addAll( list );
            }
        }

        return xMLElementLinkSegmentTypes1;
    }

    protected XMLElementLayerConfiguration xMLElementLayerConfigurationToXMLElementLayerConfiguration(org.goplanit.xml.generated.v1.XMLElementLayerConfiguration xMLElementLayerConfiguration) {
        if ( xMLElementLayerConfiguration == null ) {
            return null;
        }

        XMLElementLayerConfiguration xMLElementLayerConfiguration1 = objectFactory.createXMLElementLayerConfiguration();

        xMLElementLayerConfiguration1.setLinksegmenttypes( xMLElementLinkSegmentTypesToXMLElementLinkSegmentTypes( xMLElementLayerConfiguration.getLinksegmenttypes() ) );

        return xMLElementLayerConfiguration1;
    }

    protected EntryElement entryElementToEntryElement(org.goplanit.xml.generated.v1.EntryElement entryElement) {
        if ( entryElement == null ) {
            return null;
        }

        EntryElement entryElement1 = objectFactory.createEntryElement();

        entryElement1.setValue( entryElement.getValue() );
        entryElement1.setKeyAttribute( entryElement.getKeyAttribute() );

        return entryElement1;
    }

    protected List<EntryElement> entryElementListToEntryElementList(List<org.goplanit.xml.generated.v1.EntryElement> list) {
        if ( list == null ) {
            return null;
        }

        List<EntryElement> list1 = new ArrayList<EntryElement>( list.size() );
        for ( org.goplanit.xml.generated.v1.EntryElement entryElement : list ) {
            list1.add( entryElementToEntryElement( entryElement ) );
        }

        return list1;
    }

    protected CustomPropertiesType customPropertiesTypeToCustomPropertiesType(org.goplanit.xml.generated.v1.CustomPropertiesType customPropertiesType) {
        if ( customPropertiesType == null ) {
            return null;
        }

        CustomPropertiesType customPropertiesType1 = objectFactory.createCustomPropertiesType();

        if ( customPropertiesType1.getEntryElements() != null ) {
            List<EntryElement> list = entryElementListToEntryElementList( customPropertiesType.getEntryElements() );
            if ( list != null ) {
                customPropertiesType1.getEntryElements().addAll( list );
            }
        }

        return customPropertiesType1;
    }

    protected Node nodeToNode(org.goplanit.xml.generated.v1.Node node) {
        if ( node == null ) {
            return null;
        }

        Node node1 = objectFactory.createNode();

        node1.setName( node.getName() );
        node1.setPoint( node.getPoint() );
        node1.setCustom( customPropertiesTypeToCustomPropertiesType( node.getCustom() ) );
        node1.setId( node.getId() );
        node1.setExternalid( node.getExternalid() );

        return node1;
    }

    protected List<Node> nodeListToNodeList(List<org.goplanit.xml.generated.v1.Node> list) {
        if ( list == null ) {
            return null;
        }

        List<Node> list1 = new ArrayList<Node>( list.size() );
        for ( org.goplanit.xml.generated.v1.Node node : list ) {
            list1.add( nodeToNode( node ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementNodes xMLElementNodesToXMLElementNodes(XMLElementNodes xMLElementNodes) {
        if ( xMLElementNodes == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementNodes xMLElementNodes1 = objectFactory.createXMLElementNodes();

        if ( xMLElementNodes1.getNodes() != null ) {
            List<Node> list = nodeListToNodeList( xMLElementNodes.getNodes() );
            if ( list != null ) {
                xMLElementNodes1.getNodes().addAll( list );
            }
        }

        return xMLElementNodes1;
    }

    protected org.goplanit.xml.generated.v2.LengthUnit lengthUnitToLengthUnit(LengthUnit lengthUnit) {
        if ( lengthUnit == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.LengthUnit lengthUnit1;

        switch ( lengthUnit ) {
            case KM: lengthUnit1 = org.goplanit.xml.generated.v2.LengthUnit.KM;
            break;
            case M: lengthUnit1 = org.goplanit.xml.generated.v2.LengthUnit.M;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + lengthUnit );
        }

        return lengthUnit1;
    }

    protected XMLElementLinkLengthType xMLElementLinkLengthTypeToXMLElementLinkLengthType(org.goplanit.xml.generated.v1.XMLElementLinkLengthType xMLElementLinkLengthType) {
        if ( xMLElementLinkLengthType == null ) {
            return null;
        }

        XMLElementLinkLengthType xMLElementLinkLengthType1 = objectFactory.createXMLElementLinkLengthType();

        xMLElementLinkLengthType1.setValue( xMLElementLinkLengthType.getValue() );
        xMLElementLinkLengthType1.setUnit( lengthUnitToLengthUnit( xMLElementLinkLengthType.getUnit() ) );

        return xMLElementLinkLengthType1;
    }

    protected Direction directionToDirection(org.goplanit.xml.generated.v1.Direction direction) {
        if ( direction == null ) {
            return null;
        }

        Direction direction1;

        switch ( direction ) {
            case A_B: direction1 = Direction.A_B;
            break;
            case B_A: direction1 = Direction.B_A;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + direction );
        }

        return direction1;
    }

    protected XMLElementLinkSegment xMLElementLinkSegmentToXMLElementLinkSegment(org.goplanit.xml.generated.v1.XMLElementLinkSegment xMLElementLinkSegment) {
        if ( xMLElementLinkSegment == null ) {
            return null;
        }

        XMLElementLinkSegment xMLElementLinkSegment1 = objectFactory.createXMLElementLinkSegment();

        xMLElementLinkSegment1.setNumberoflanes( xMLElementLinkSegment.getNumberoflanes() );
        xMLElementLinkSegment1.setMaxspeed( xMLElementLinkSegment.getMaxspeed() );
        xMLElementLinkSegment1.setId( xMLElementLinkSegment.getId() );
        xMLElementLinkSegment1.setExternalid( xMLElementLinkSegment.getExternalid() );
        xMLElementLinkSegment1.setDir( directionToDirection( xMLElementLinkSegment.getDir() ) );
        xMLElementLinkSegment1.setTyperef( xMLElementLinkSegment.getTyperef() );

        return xMLElementLinkSegment1;
    }

    protected List<XMLElementLinkSegment> xMLElementLinkSegmentListToXMLElementLinkSegmentList(List<org.goplanit.xml.generated.v1.XMLElementLinkSegment> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementLinkSegment> list1 = new ArrayList<XMLElementLinkSegment>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementLinkSegment xMLElementLinkSegment : list ) {
            list1.add( xMLElementLinkSegmentToXMLElementLinkSegment( xMLElementLinkSegment ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.Link linkToLink(Link link) {
        if ( link == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Link link1 = objectFactory.createLink();

        link1.setName( link.getName() );
        link1.setLineString( link.getLineString() );
        link1.setCustom( customPropertiesTypeToCustomPropertiesType( link.getCustom() ) );
        link1.setLength( xMLElementLinkLengthTypeToXMLElementLinkLengthType( link.getLength() ) );
        link1.setId( link.getId() );
        link1.setExternalid( link.getExternalid() );
        link1.setNodearef( link.getNodearef() );
        link1.setNodebref( link.getNodebref() );
        if ( link1.getLinksegments() != null ) {
            List<XMLElementLinkSegment> list = xMLElementLinkSegmentListToXMLElementLinkSegmentList( link.getLinksegments() );
            if ( list != null ) {
                link1.getLinksegments().addAll( list );
            }
        }

        return link1;
    }

    protected List<org.goplanit.xml.generated.v2.Link> linkListToLinkList(List<Link> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.Link> list1 = new ArrayList<org.goplanit.xml.generated.v2.Link>( list.size() );
        for ( Link link : list ) {
            list1.add( linkToLink( link ) );
        }

        return list1;
    }

    protected XMLElementLinks xMLElementLinksToXMLElementLinks(org.goplanit.xml.generated.v1.XMLElementLinks xMLElementLinks) {
        if ( xMLElementLinks == null ) {
            return null;
        }

        XMLElementLinks xMLElementLinks1 = objectFactory.createXMLElementLinks();

        if ( xMLElementLinks1.getLinks() != null ) {
            List<org.goplanit.xml.generated.v2.Link> list = linkListToLinkList( xMLElementLinks.getLinks() );
            if ( list != null ) {
                xMLElementLinks1.getLinks().addAll( list );
            }
        }

        return xMLElementLinks1;
    }

    protected XMLElementInfrastructureLayer xMLElementInfrastructureLayerToXMLElementInfrastructureLayer(org.goplanit.xml.generated.v1.XMLElementInfrastructureLayer xMLElementInfrastructureLayer) {
        if ( xMLElementInfrastructureLayer == null ) {
            return null;
        }

        XMLElementInfrastructureLayer xMLElementInfrastructureLayer1 = objectFactory.createXMLElementInfrastructureLayer();

        xMLElementInfrastructureLayer1.setLayerconfiguration( xMLElementLayerConfigurationToXMLElementLayerConfiguration( xMLElementInfrastructureLayer.getLayerconfiguration() ) );
        xMLElementInfrastructureLayer1.setNodes( xMLElementNodesToXMLElementNodes( xMLElementInfrastructureLayer.getNodes() ) );
        xMLElementInfrastructureLayer1.setLinks( xMLElementLinksToXMLElementLinks( xMLElementInfrastructureLayer.getLinks() ) );
        xMLElementInfrastructureLayer1.setId( xMLElementInfrastructureLayer.getId() );
        xMLElementInfrastructureLayer1.setExternalid( xMLElementInfrastructureLayer.getExternalid() );
        xMLElementInfrastructureLayer1.setSrsname( xMLElementInfrastructureLayer.getSrsname() );
        xMLElementInfrastructureLayer1.setModes( xMLElementInfrastructureLayer.getModes() );

        return xMLElementInfrastructureLayer1;
    }

    protected List<XMLElementInfrastructureLayer> xMLElementInfrastructureLayerListToXMLElementInfrastructureLayerList(List<org.goplanit.xml.generated.v1.XMLElementInfrastructureLayer> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementInfrastructureLayer> list1 = new ArrayList<XMLElementInfrastructureLayer>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementInfrastructureLayer xMLElementInfrastructureLayer : list ) {
            list1.add( xMLElementInfrastructureLayerToXMLElementInfrastructureLayer( xMLElementInfrastructureLayer ) );
        }

        return list1;
    }

    protected XMLElementInfrastructureLayers xMLElementInfrastructureLayersToXMLElementInfrastructureLayers(org.goplanit.xml.generated.v1.XMLElementInfrastructureLayers xMLElementInfrastructureLayers) {
        if ( xMLElementInfrastructureLayers == null ) {
            return null;
        }

        XMLElementInfrastructureLayers xMLElementInfrastructureLayers1 = objectFactory.createXMLElementInfrastructureLayers();

        xMLElementInfrastructureLayers1.setSrsname( xMLElementInfrastructureLayers.getSrsname() );
        if ( xMLElementInfrastructureLayers1.getLayers() != null ) {
            List<XMLElementInfrastructureLayer> list = xMLElementInfrastructureLayerListToXMLElementInfrastructureLayerList( xMLElementInfrastructureLayers.getLayers() );
            if ( list != null ) {
                xMLElementInfrastructureLayers1.getLayers().addAll( list );
            }
        }

        return xMLElementInfrastructureLayers1;
    }

    protected Travellertype travellertypeToTravellertype(org.goplanit.xml.generated.v1.Travellertype travellertype) {
        if ( travellertype == null ) {
            return null;
        }

        Travellertype travellertype1 = objectFactory.createTravellertype();

        travellertype1.setName( travellertype.getName() );
        travellertype1.setId( travellertype.getId() );
        travellertype1.setExternalid( travellertype.getExternalid() );

        return travellertype1;
    }

    protected List<Travellertype> travellertypeListToTravellertypeList(List<org.goplanit.xml.generated.v1.Travellertype> list) {
        if ( list == null ) {
            return null;
        }

        List<Travellertype> list1 = new ArrayList<Travellertype>( list.size() );
        for ( org.goplanit.xml.generated.v1.Travellertype travellertype : list ) {
            list1.add( travellertypeToTravellertype( travellertype ) );
        }

        return list1;
    }

    protected XMLElementTravellerTypes xMLElementTravellerTypesToXMLElementTravellerTypes(org.goplanit.xml.generated.v1.XMLElementTravellerTypes xMLElementTravellerTypes) {
        if ( xMLElementTravellerTypes == null ) {
            return null;
        }

        XMLElementTravellerTypes xMLElementTravellerTypes1 = objectFactory.createXMLElementTravellerTypes();

        if ( xMLElementTravellerTypes1.getTravellertypes() != null ) {
            List<Travellertype> list = travellertypeListToTravellertypeList( xMLElementTravellerTypes.getTravellertypes() );
            if ( list != null ) {
                xMLElementTravellerTypes1.getTravellertypes().addAll( list );
            }
        }

        return xMLElementTravellerTypes1;
    }

    protected org.goplanit.xml.generated.v2.Userclass userclassToUserclass(Userclass userclass) {
        if ( userclass == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Userclass userclass1 = objectFactory.createUserclass();

        userclass1.setName( userclass.getName() );
        userclass1.setId( userclass.getId() );
        userclass1.setExternalid( userclass.getExternalid() );
        userclass1.setModeref( userclass.getModeref() );
        userclass1.setTravellertyperef( userclass.getTravellertyperef() );

        return userclass1;
    }

    protected List<org.goplanit.xml.generated.v2.Userclass> userclassListToUserclassList(List<Userclass> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.Userclass> list1 = new ArrayList<org.goplanit.xml.generated.v2.Userclass>( list.size() );
        for ( Userclass userclass : list ) {
            list1.add( userclassToUserclass( userclass ) );
        }

        return list1;
    }

    protected XMLElementUserClasses xMLElementUserClassesToXMLElementUserClasses(org.goplanit.xml.generated.v1.XMLElementUserClasses xMLElementUserClasses) {
        if ( xMLElementUserClasses == null ) {
            return null;
        }

        XMLElementUserClasses xMLElementUserClasses1 = objectFactory.createXMLElementUserClasses();

        if ( xMLElementUserClasses1.getUserclasses() != null ) {
            List<org.goplanit.xml.generated.v2.Userclass> list = userclassListToUserclassList( xMLElementUserClasses.getUserclasses() );
            if ( list != null ) {
                xMLElementUserClasses1.getUserclasses().addAll( list );
            }
        }

        return xMLElementUserClasses1;
    }

    protected org.goplanit.xml.generated.v2.Durationunit durationunitToDurationunit(Durationunit durationunit) {
        if ( durationunit == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Durationunit durationunit1;

        switch ( durationunit ) {
            case H: durationunit1 = org.goplanit.xml.generated.v2.Durationunit.H;
            break;
            case M: durationunit1 = org.goplanit.xml.generated.v2.Durationunit.M;
            break;
            case S: durationunit1 = org.goplanit.xml.generated.v2.Durationunit.S;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + durationunit );
        }

        return durationunit1;
    }

    protected XMLElementDuration xMLElementDurationToXMLElementDuration(org.goplanit.xml.generated.v1.XMLElementDuration xMLElementDuration) {
        if ( xMLElementDuration == null ) {
            return null;
        }

        XMLElementDuration xMLElementDuration1 = objectFactory.createXMLElementDuration();

        xMLElementDuration1.setValue( xMLElementDuration.getValue() );
        xMLElementDuration1.setUnit( durationunitToDurationunit( xMLElementDuration.getUnit() ) );

        return xMLElementDuration1;
    }

    protected TimePeriodType timeperiodToTimePeriodType(Timeperiod timeperiod) {
        if ( timeperiod == null ) {
            return null;
        }

        TimePeriodType timePeriodType = objectFactory.createTimePeriodType();

        timePeriodType.setName( timeperiod.getName() );
        timePeriodType.setStarttime( timeperiod.getStarttime() );
        timePeriodType.setDuration( xMLElementDurationToXMLElementDuration( timeperiod.getDuration() ) );
        timePeriodType.setId( timeperiod.getId() );
        timePeriodType.setExternalid( timeperiod.getExternalid() );

        return timePeriodType;
    }

    protected List<TimePeriodType> timeperiodListToTimePeriodTypeList(List<Timeperiod> list) {
        if ( list == null ) {
            return null;
        }

        List<TimePeriodType> list1 = new ArrayList<TimePeriodType>( list.size() );
        for ( Timeperiod timeperiod : list ) {
            list1.add( timeperiodToTimePeriodType( timeperiod ) );
        }

        return list1;
    }

    protected TimePeriodsContainerType xMLElementTimePeriodsToTimePeriodsContainerType(XMLElementTimePeriods xMLElementTimePeriods) {
        if ( xMLElementTimePeriods == null ) {
            return null;
        }

        TimePeriodsContainerType timePeriodsContainerType = objectFactory.createTimePeriodsContainerType();

        if ( timePeriodsContainerType.getTimeperiods() != null ) {
            List<TimePeriodType> list = timeperiodListToTimePeriodTypeList( xMLElementTimePeriods.getTimeperiods() );
            if ( list != null ) {
                timePeriodsContainerType.getTimeperiods().addAll( list );
            }
        }

        return timePeriodsContainerType;
    }

    protected XMLElementDemandConfiguration xMLElementDemandConfigurationToXMLElementDemandConfiguration(org.goplanit.xml.generated.v1.XMLElementDemandConfiguration xMLElementDemandConfiguration) {
        if ( xMLElementDemandConfiguration == null ) {
            return null;
        }

        XMLElementDemandConfiguration xMLElementDemandConfiguration1 = objectFactory.createXMLElementDemandConfiguration();

        xMLElementDemandConfiguration1.setTravellertypes( xMLElementTravellerTypesToXMLElementTravellerTypes( xMLElementDemandConfiguration.getTravellertypes() ) );
        xMLElementDemandConfiguration1.setUserclasses( xMLElementUserClassesToXMLElementUserClasses( xMLElementDemandConfiguration.getUserclasses() ) );
        xMLElementDemandConfiguration1.setTimeperiods( xMLElementTimePeriodsToTimePeriodsContainerType( xMLElementDemandConfiguration.getTimeperiods() ) );

        return xMLElementDemandConfiguration1;
    }

    protected List<XMLElementOdMatrix> xMLElementOdMatrixListToXMLElementOdMatrixList(List<org.goplanit.xml.generated.v1.XMLElementOdMatrix> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementOdMatrix> list1 = new ArrayList<XMLElementOdMatrix>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementOdMatrix xMLElementOdMatrix : list ) {
            list1.add( polymorphicResolver.resolveMatrix( xMLElementOdMatrix ) );
        }

        return list1;
    }

    protected XMLElementOdDemands xMLElementOdDemandsToXMLElementOdDemands(org.goplanit.xml.generated.v1.XMLElementOdDemands xMLElementOdDemands) {
        if ( xMLElementOdDemands == null ) {
            return null;
        }

        XMLElementOdDemands xMLElementOdDemands1 = objectFactory.createXMLElementOdDemands();

        if ( xMLElementOdDemands1.getOdcellbycellmatrixesAndOdrowmatrixesAndOdrawmatrixes() != null ) {
            List<XMLElementOdMatrix> list = xMLElementOdMatrixListToXMLElementOdMatrixList( xMLElementOdDemands.getOdcellbycellmatrixesAndOdrowmatrixesAndOdrawmatrixes() );
            if ( list != null ) {
                xMLElementOdDemands1.getOdcellbycellmatrixesAndOdrowmatrixesAndOdrawmatrixes().addAll( list );
            }
        }

        return xMLElementOdDemands1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementCentroid xMLElementCentroidToXMLElementCentroid(XMLElementCentroid xMLElementCentroid) {
        if ( xMLElementCentroid == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementCentroid xMLElementCentroid1 = objectFactory.createXMLElementCentroid();

        xMLElementCentroid1.setName( xMLElementCentroid.getName() );
        xMLElementCentroid1.setPoint( xMLElementCentroid.getPoint() );

        return xMLElementCentroid1;
    }

    protected XMLElementConnectoid xMLElementConnectoidToXMLElementConnectoid(org.goplanit.xml.generated.v1.XMLElementConnectoid xMLElementConnectoid) {
        if ( xMLElementConnectoid == null ) {
            return null;
        }

        XMLElementConnectoid xMLElementConnectoid1 = objectFactory.createXMLElementConnectoid();

        xMLElementConnectoid1.setId( xMLElementConnectoid.getId() );
        xMLElementConnectoid1.setExternalid( xMLElementConnectoid.getExternalid() );
        xMLElementConnectoid1.setName( xMLElementConnectoid.getName() );
        xMLElementConnectoid1.setNoderef( xMLElementConnectoid.getNoderef() );
        if ( xMLElementConnectoid.getLength() != null ) {
            xMLElementConnectoid1.setLength( BigDecimal.valueOf( xMLElementConnectoid.getLength() ) );
        }
        xMLElementConnectoid1.setModes( xMLElementConnectoid.getModes() );
        xMLElementConnectoid1.setType( ConnectoidEnumMapper.map( xMLElementConnectoid.getType() ) );

        return xMLElementConnectoid1;
    }

    protected List<XMLElementConnectoid> xMLElementConnectoidListToXMLElementConnectoidList(List<org.goplanit.xml.generated.v1.XMLElementConnectoid> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementConnectoid> list1 = new ArrayList<XMLElementConnectoid>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementConnectoid xMLElementConnectoid : list ) {
            list1.add( xMLElementConnectoidToXMLElementConnectoid( xMLElementConnectoid ) );
        }

        return list1;
    }

    protected XMLElementConnectoids xMLElementConnectoidsToXMLElementConnectoids(org.goplanit.xml.generated.v1.XMLElementConnectoids xMLElementConnectoids) {
        if ( xMLElementConnectoids == null ) {
            return null;
        }

        XMLElementConnectoids xMLElementConnectoids1 = objectFactory.createXMLElementConnectoids();

        if ( xMLElementConnectoids1.getConnectoids() != null ) {
            List<XMLElementConnectoid> list = xMLElementConnectoidListToXMLElementConnectoidList( xMLElementConnectoids.getConnectoids() );
            if ( list != null ) {
                xMLElementConnectoids1.getConnectoids().addAll( list );
            }
        }

        return xMLElementConnectoids1;
    }

    protected org.goplanit.xml.generated.v2.Zone zoneToZone(Zone zone) {
        if ( zone == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Zone zone1 = objectFactory.createZone();

        zone1.setName( zone.getName() );
        zone1.setCentroid( xMLElementCentroidToXMLElementCentroid( zone.getCentroid() ) );
        zone1.setConnectoids( xMLElementConnectoidsToXMLElementConnectoids( zone.getConnectoids() ) );
        zone1.setPolygon( zone.getPolygon() );
        zone1.setId( zone.getId() );
        zone1.setExternalid( zone.getExternalid() );

        return zone1;
    }

    protected List<org.goplanit.xml.generated.v2.Zone> zoneListToZoneList(List<Zone> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.Zone> list1 = new ArrayList<org.goplanit.xml.generated.v2.Zone>( list.size() );
        for ( Zone zone : list ) {
            list1.add( zoneToZone( zone ) );
        }

        return list1;
    }

    protected XMLElementZones xMLElementZonesToXMLElementZones(org.goplanit.xml.generated.v1.XMLElementZones xMLElementZones) {
        if ( xMLElementZones == null ) {
            return null;
        }

        XMLElementZones xMLElementZones1 = objectFactory.createXMLElementZones();

        if ( xMLElementZones1.getZones() != null ) {
            List<org.goplanit.xml.generated.v2.Zone> list = zoneListToZoneList( xMLElementZones.getZones() );
            if ( list != null ) {
                xMLElementZones1.getZones().addAll( list );
            }
        }

        return xMLElementZones1;
    }

    protected Servicenode servicenodeToServicenode(org.goplanit.xml.generated.v1.Servicenode servicenode) {
        if ( servicenode == null ) {
            return null;
        }

        Servicenode servicenode1 = objectFactory.createServicenode();

        servicenode1.setId( servicenode.getId() );
        servicenode1.setExternalid( servicenode.getExternalid() );

        return servicenode1;
    }

    protected List<Servicenode> servicenodeListToServicenodeList(List<org.goplanit.xml.generated.v1.Servicenode> list) {
        if ( list == null ) {
            return null;
        }

        List<Servicenode> list1 = new ArrayList<Servicenode>( list.size() );
        for ( org.goplanit.xml.generated.v1.Servicenode servicenode : list ) {
            list1.add( servicenodeToServicenode( servicenode ) );
        }

        return list1;
    }

    protected XMLElementServiceNodes xMLElementServiceNodesToXMLElementServiceNodes(org.goplanit.xml.generated.v1.XMLElementServiceNodes xMLElementServiceNodes) {
        if ( xMLElementServiceNodes == null ) {
            return null;
        }

        XMLElementServiceNodes xMLElementServiceNodes1 = objectFactory.createXMLElementServiceNodes();

        if ( xMLElementServiceNodes1.getServicenodes() != null ) {
            List<Servicenode> list = servicenodeListToServicenodeList( xMLElementServiceNodes.getServicenodes() );
            if ( list != null ) {
                xMLElementServiceNodes1.getServicenodes().addAll( list );
            }
        }

        return xMLElementServiceNodes1;
    }

    protected Legsegment legsegmentToLegsegment(org.goplanit.xml.generated.v1.Legsegment legsegment) {
        if ( legsegment == null ) {
            return null;
        }

        Legsegment legsegment1 = objectFactory.createLegsegment();

        legsegment1.setId( legsegment.getId() );
        legsegment1.setExternalid( legsegment.getExternalid() );
        legsegment1.setDir( directionToDirection( legsegment.getDir() ) );
        legsegment1.setLsrefs( legsegment.getLsrefs() );

        return legsegment1;
    }

    protected List<Legsegment> legsegmentListToLegsegmentList(List<org.goplanit.xml.generated.v1.Legsegment> list) {
        if ( list == null ) {
            return null;
        }

        List<Legsegment> list1 = new ArrayList<Legsegment>( list.size() );
        for ( org.goplanit.xml.generated.v1.Legsegment legsegment : list ) {
            list1.add( legsegmentToLegsegment( legsegment ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementServiceLeg xMLElementServiceLegToXMLElementServiceLeg(XMLElementServiceLeg xMLElementServiceLeg) {
        if ( xMLElementServiceLeg == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementServiceLeg xMLElementServiceLeg1 = objectFactory.createXMLElementServiceLeg();

        xMLElementServiceLeg1.setId( xMLElementServiceLeg.getId() );
        xMLElementServiceLeg1.setExternalid( xMLElementServiceLeg.getExternalid() );
        xMLElementServiceLeg1.setNodearef( xMLElementServiceLeg.getNodearef() );
        xMLElementServiceLeg1.setNodebref( xMLElementServiceLeg.getNodebref() );
        if ( xMLElementServiceLeg1.getLegsegments() != null ) {
            List<Legsegment> list = legsegmentListToLegsegmentList( xMLElementServiceLeg.getLegsegments() );
            if ( list != null ) {
                xMLElementServiceLeg1.getLegsegments().addAll( list );
            }
        }

        return xMLElementServiceLeg1;
    }

    protected List<org.goplanit.xml.generated.v2.XMLElementServiceLeg> xMLElementServiceLegListToXMLElementServiceLegList(List<XMLElementServiceLeg> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.XMLElementServiceLeg> list1 = new ArrayList<org.goplanit.xml.generated.v2.XMLElementServiceLeg>( list.size() );
        for ( XMLElementServiceLeg xMLElementServiceLeg : list ) {
            list1.add( xMLElementServiceLegToXMLElementServiceLeg( xMLElementServiceLeg ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementServiceLegs xMLElementServiceLegsToXMLElementServiceLegs(XMLElementServiceLegs xMLElementServiceLegs) {
        if ( xMLElementServiceLegs == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementServiceLegs xMLElementServiceLegs1 = objectFactory.createXMLElementServiceLegs();

        if ( xMLElementServiceLegs1.getLegs() != null ) {
            List<org.goplanit.xml.generated.v2.XMLElementServiceLeg> list = xMLElementServiceLegListToXMLElementServiceLegList( xMLElementServiceLegs.getLegs() );
            if ( list != null ) {
                xMLElementServiceLegs1.getLegs().addAll( list );
            }
        }

        return xMLElementServiceLegs1;
    }

    protected XMLElementServiceNetworkLayer xMLElementServiceNetworkLayerToXMLElementServiceNetworkLayer(org.goplanit.xml.generated.v1.XMLElementServiceNetworkLayer xMLElementServiceNetworkLayer) {
        if ( xMLElementServiceNetworkLayer == null ) {
            return null;
        }

        XMLElementServiceNetworkLayer xMLElementServiceNetworkLayer1 = objectFactory.createXMLElementServiceNetworkLayer();

        xMLElementServiceNetworkLayer1.setServicenodes( xMLElementServiceNodesToXMLElementServiceNodes( xMLElementServiceNetworkLayer.getServicenodes() ) );
        xMLElementServiceNetworkLayer1.setServicelegs( xMLElementServiceLegsToXMLElementServiceLegs( xMLElementServiceNetworkLayer.getServicelegs() ) );
        xMLElementServiceNetworkLayer1.setId( xMLElementServiceNetworkLayer.getId() );
        xMLElementServiceNetworkLayer1.setExternalid( xMLElementServiceNetworkLayer.getExternalid() );
        xMLElementServiceNetworkLayer1.setParentlayerref( xMLElementServiceNetworkLayer.getParentlayerref() );

        return xMLElementServiceNetworkLayer1;
    }

    protected List<XMLElementServiceNetworkLayer> xMLElementServiceNetworkLayerListToXMLElementServiceNetworkLayerList(List<org.goplanit.xml.generated.v1.XMLElementServiceNetworkLayer> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementServiceNetworkLayer> list1 = new ArrayList<XMLElementServiceNetworkLayer>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementServiceNetworkLayer xMLElementServiceNetworkLayer : list ) {
            list1.add( xMLElementServiceNetworkLayerToXMLElementServiceNetworkLayer( xMLElementServiceNetworkLayer ) );
        }

        return list1;
    }

    protected TimeUnit timeUnitToTimeUnit(org.goplanit.xml.generated.v1.TimeUnit timeUnit) {
        if ( timeUnit == null ) {
            return null;
        }

        TimeUnit timeUnit1;

        switch ( timeUnit ) {
            case H: timeUnit1 = TimeUnit.H;
            break;
            case MIN: timeUnit1 = TimeUnit.MIN;
            break;
            case S: timeUnit1 = TimeUnit.S;
            break;
            case MS: timeUnit1 = TimeUnit.MS;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + timeUnit );
        }

        return timeUnit1;
    }

    protected Frequency frequencyToFrequency(org.goplanit.xml.generated.v1.Frequency frequency) {
        if ( frequency == null ) {
            return null;
        }

        Frequency frequency1 = objectFactory.createFrequency();

        frequency1.setValue( frequency.getValue() );
        frequency1.setUnit( timeUnitToTimeUnit( frequency.getUnit() ) );
        frequency1.setLsrefs( frequency.getLsrefs() );

        return frequency1;
    }

    protected org.goplanit.xml.generated.v2.Departure departureToDeparture(Departure departure) {
        if ( departure == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Departure departure1 = objectFactory.createDeparture();

        departure1.setId( departure.getId() );
        departure1.setExternalid( departure.getExternalid() );
        departure1.setTime( departure.getTime() );

        return departure1;
    }

    protected List<org.goplanit.xml.generated.v2.Departure> departureListToDepartureList(List<Departure> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.Departure> list1 = new ArrayList<org.goplanit.xml.generated.v2.Departure>( list.size() );
        for ( Departure departure : list ) {
            list1.add( departureToDeparture( departure ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementDepartures xMLElementDeparturesToXMLElementDepartures(XMLElementDepartures xMLElementDepartures) {
        if ( xMLElementDepartures == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementDepartures xMLElementDepartures1 = objectFactory.createXMLElementDepartures();

        if ( xMLElementDepartures1.getDepartures() != null ) {
            List<org.goplanit.xml.generated.v2.Departure> list = departureListToDepartureList( xMLElementDepartures.getDepartures() );
            if ( list != null ) {
                xMLElementDepartures1.getDepartures().addAll( list );
            }
        }

        return xMLElementDepartures1;
    }

    protected org.goplanit.xml.generated.v2.Leg legToLeg(Leg leg) {
        if ( leg == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Leg leg1 = objectFactory.createLeg();

        leg1.setLsref( leg.getLsref() );
        leg1.setDuration( leg.getDuration() );
        leg1.setDwelltime( leg.getDwelltime() );

        return leg1;
    }

    protected List<org.goplanit.xml.generated.v2.Leg> legListToLegList(List<Leg> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.Leg> list1 = new ArrayList<org.goplanit.xml.generated.v2.Leg>( list.size() );
        for ( Leg leg : list ) {
            list1.add( legToLeg( leg ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementRelativeTimings xMLElementRelativeTimingsToXMLElementRelativeTimings(XMLElementRelativeTimings xMLElementRelativeTimings) {
        if ( xMLElementRelativeTimings == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementRelativeTimings xMLElementRelativeTimings1 = objectFactory.createXMLElementRelativeTimings();

        xMLElementRelativeTimings1.setDwelltime( xMLElementRelativeTimings.getDwelltime() );
        if ( xMLElementRelativeTimings1.getLegs() != null ) {
            List<org.goplanit.xml.generated.v2.Leg> list = legListToLegList( xMLElementRelativeTimings.getLegs() );
            if ( list != null ) {
                xMLElementRelativeTimings1.getLegs().addAll( list );
            }
        }

        return xMLElementRelativeTimings1;
    }

    protected org.goplanit.xml.generated.v2.Schedule scheduleToSchedule(Schedule schedule) {
        if ( schedule == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Schedule schedule1 = objectFactory.createSchedule();

        schedule1.setDepartures( xMLElementDeparturesToXMLElementDepartures( schedule.getDepartures() ) );
        schedule1.setReltimings( xMLElementRelativeTimingsToXMLElementRelativeTimings( schedule.getReltimings() ) );

        return schedule1;
    }

    protected XMLElementRoutedTrip xMLElementRoutedTripToXMLElementRoutedTrip(org.goplanit.xml.generated.v1.XMLElementRoutedTrip xMLElementRoutedTrip) {
        if ( xMLElementRoutedTrip == null ) {
            return null;
        }

        XMLElementRoutedTrip xMLElementRoutedTrip1 = objectFactory.createXMLElementRoutedTrip();

        xMLElementRoutedTrip1.setFrequency( frequencyToFrequency( xMLElementRoutedTrip.getFrequency() ) );
        xMLElementRoutedTrip1.setSchedule( scheduleToSchedule( xMLElementRoutedTrip.getSchedule() ) );
        xMLElementRoutedTrip1.setId( xMLElementRoutedTrip.getId() );
        xMLElementRoutedTrip1.setExternalid( xMLElementRoutedTrip.getExternalid() );

        return xMLElementRoutedTrip1;
    }

    protected List<XMLElementRoutedTrip> xMLElementRoutedTripListToXMLElementRoutedTripList(List<org.goplanit.xml.generated.v1.XMLElementRoutedTrip> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementRoutedTrip> list1 = new ArrayList<XMLElementRoutedTrip>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementRoutedTrip xMLElementRoutedTrip : list ) {
            list1.add( xMLElementRoutedTripToXMLElementRoutedTrip( xMLElementRoutedTrip ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementRoutedTrips xMLElementRoutedTripsToXMLElementRoutedTrips(XMLElementRoutedTrips xMLElementRoutedTrips) {
        if ( xMLElementRoutedTrips == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementRoutedTrips xMLElementRoutedTrips1 = objectFactory.createXMLElementRoutedTrips();

        if ( xMLElementRoutedTrips1.getTrips() != null ) {
            List<XMLElementRoutedTrip> list = xMLElementRoutedTripListToXMLElementRoutedTripList( xMLElementRoutedTrips.getTrips() );
            if ( list != null ) {
                xMLElementRoutedTrips1.getTrips().addAll( list );
            }
        }

        return xMLElementRoutedTrips1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementService xMLElementServiceToXMLElementService(XMLElementService xMLElementService) {
        if ( xMLElementService == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementService xMLElementService1 = objectFactory.createXMLElementService();

        xMLElementService1.setName( xMLElementService.getName() );
        xMLElementService1.setNamedescription( xMLElementService.getNamedescription() );
        xMLElementService1.setServicedescription( xMLElementService.getServicedescription() );
        xMLElementService1.setCircular( xMLElementService.isCircular() );
        xMLElementService1.setTrips( xMLElementRoutedTripsToXMLElementRoutedTrips( xMLElementService.getTrips() ) );
        xMLElementService1.setId( xMLElementService.getId() );
        xMLElementService1.setExternalid( xMLElementService.getExternalid() );

        return xMLElementService1;
    }

    protected List<org.goplanit.xml.generated.v2.XMLElementService> xMLElementServiceListToXMLElementServiceList(List<XMLElementService> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.XMLElementService> list1 = new ArrayList<org.goplanit.xml.generated.v2.XMLElementService>( list.size() );
        for ( XMLElementService xMLElementService : list ) {
            list1.add( xMLElementServiceToXMLElementService( xMLElementService ) );
        }

        return list1;
    }

    protected XMLElementServices xMLElementServicesToXMLElementServices(org.goplanit.xml.generated.v1.XMLElementServices xMLElementServices) {
        if ( xMLElementServices == null ) {
            return null;
        }

        XMLElementServices xMLElementServices1 = objectFactory.createXMLElementServices();

        xMLElementServices1.setModeref( xMLElementServices.getModeref() );
        if ( xMLElementServices1.getServices() != null ) {
            List<org.goplanit.xml.generated.v2.XMLElementService> list = xMLElementServiceListToXMLElementServiceList( xMLElementServices.getServices() );
            if ( list != null ) {
                xMLElementServices1.getServices().addAll( list );
            }
        }

        return xMLElementServices1;
    }

    protected List<XMLElementServices> xMLElementServicesListToXMLElementServicesList(List<org.goplanit.xml.generated.v1.XMLElementServices> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementServices> list1 = new ArrayList<XMLElementServices>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementServices xMLElementServices : list ) {
            list1.add( xMLElementServicesToXMLElementServices( xMLElementServices ) );
        }

        return list1;
    }

    protected XMLElementRoutedServicesLayer xMLElementRoutedServicesLayerToXMLElementRoutedServicesLayer(org.goplanit.xml.generated.v1.XMLElementRoutedServicesLayer xMLElementRoutedServicesLayer) {
        if ( xMLElementRoutedServicesLayer == null ) {
            return null;
        }

        XMLElementRoutedServicesLayer xMLElementRoutedServicesLayer1 = objectFactory.createXMLElementRoutedServicesLayer();

        xMLElementRoutedServicesLayer1.setId( xMLElementRoutedServicesLayer.getId() );
        xMLElementRoutedServicesLayer1.setExternalid( xMLElementRoutedServicesLayer.getExternalid() );
        xMLElementRoutedServicesLayer1.setServicelayerref( xMLElementRoutedServicesLayer.getServicelayerref() );
        if ( xMLElementRoutedServicesLayer1.getServices() != null ) {
            List<XMLElementServices> list = xMLElementServicesListToXMLElementServicesList( xMLElementRoutedServicesLayer.getServices() );
            if ( list != null ) {
                xMLElementRoutedServicesLayer1.getServices().addAll( list );
            }
        }

        return xMLElementRoutedServicesLayer1;
    }

    protected List<XMLElementRoutedServicesLayer> xMLElementRoutedServicesLayerListToXMLElementRoutedServicesLayerList(List<org.goplanit.xml.generated.v1.XMLElementRoutedServicesLayer> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementRoutedServicesLayer> list1 = new ArrayList<XMLElementRoutedServicesLayer>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementRoutedServicesLayer xMLElementRoutedServicesLayer : list ) {
            list1.add( xMLElementRoutedServicesLayerToXMLElementRoutedServicesLayer( xMLElementRoutedServicesLayer ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.Servicelayers servicelayersToServicelayers(Servicelayers servicelayers) {
        if ( servicelayers == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Servicelayers servicelayers1 = objectFactory.createServicelayers();

        servicelayers1.setServicenetworkref( servicelayers.getServicenetworkref() );
        if ( servicelayers1.getServicelayers() != null ) {
            List<XMLElementRoutedServicesLayer> list = xMLElementRoutedServicesLayerListToXMLElementRoutedServicesLayerList( servicelayers.getServicelayers() );
            if ( list != null ) {
                servicelayers1.getServicelayers().addAll( list );
            }
        }

        return servicelayers1;
    }

    protected Transferzonetype transferzonetypeToTransferzonetype(org.goplanit.xml.generated.v1.Transferzonetype transferzonetype) {
        if ( transferzonetype == null ) {
            return null;
        }

        Transferzonetype transferzonetype1;

        switch ( transferzonetype ) {
            case PLATFORM: transferzonetype1 = Transferzonetype.PLATFORM;
            break;
            case STOP_POLE: transferzonetype1 = Transferzonetype.STOP_POLE;
            break;
            case SMALL_STATION: transferzonetype1 = Transferzonetype.SMALL_STATION;
            break;
            case STATION: transferzonetype1 = Transferzonetype.STATION;
            break;
            case UNKNOWN: transferzonetype1 = Transferzonetype.UNKNOWN;
            break;
            case NONE: transferzonetype1 = Transferzonetype.NONE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + transferzonetype );
        }

        return transferzonetype1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementTransferZone xMLElementTransferZoneToXMLElementTransferZone(XMLElementTransferZone xMLElementTransferZone) {
        if ( xMLElementTransferZone == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementTransferZone xMLElementTransferZone1 = objectFactory.createXMLElementTransferZone();

        xMLElementTransferZone1.setName( xMLElementTransferZone.getName() );
        xMLElementTransferZone1.setPlatforms( xMLElementTransferZone.getPlatforms() );
        xMLElementTransferZone1.setCentroid( xMLElementCentroidToXMLElementCentroid( xMLElementTransferZone.getCentroid() ) );
        xMLElementTransferZone1.setPolygon( xMLElementTransferZone.getPolygon() );
        xMLElementTransferZone1.setLineString( xMLElementTransferZone.getLineString() );
        xMLElementTransferZone1.setId( xMLElementTransferZone.getId() );
        xMLElementTransferZone1.setExternalid( xMLElementTransferZone.getExternalid() );
        xMLElementTransferZone1.setType( transferzonetypeToTransferzonetype( xMLElementTransferZone.getType() ) );

        return xMLElementTransferZone1;
    }

    protected List<org.goplanit.xml.generated.v2.XMLElementTransferZone> xMLElementTransferZoneListToXMLElementTransferZoneList(List<XMLElementTransferZone> list) {
        if ( list == null ) {
            return null;
        }

        List<org.goplanit.xml.generated.v2.XMLElementTransferZone> list1 = new ArrayList<org.goplanit.xml.generated.v2.XMLElementTransferZone>( list.size() );
        for ( XMLElementTransferZone xMLElementTransferZone : list ) {
            list1.add( xMLElementTransferZoneToXMLElementTransferZone( xMLElementTransferZone ) );
        }

        return list1;
    }

    protected XMLElementTransferZones xMLElementTransferZonesToXMLElementTransferZones(org.goplanit.xml.generated.v1.XMLElementTransferZones xMLElementTransferZones) {
        if ( xMLElementTransferZones == null ) {
            return null;
        }

        XMLElementTransferZones xMLElementTransferZones1 = objectFactory.createXMLElementTransferZones();

        if ( xMLElementTransferZones1.getZones() != null ) {
            List<org.goplanit.xml.generated.v2.XMLElementTransferZone> list = xMLElementTransferZoneListToXMLElementTransferZoneList( xMLElementTransferZones.getZones() );
            if ( list != null ) {
                xMLElementTransferZones1.getZones().addAll( list );
            }
        }

        return xMLElementTransferZones1;
    }

    protected List<XMLElementTransferConnectoid> xMLElementTransferConnectoidListToXMLElementTransferConnectoidList(List<org.goplanit.xml.generated.v1.XMLElementTransferConnectoid> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementTransferConnectoid> list1 = new ArrayList<XMLElementTransferConnectoid>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementTransferConnectoid xMLElementTransferConnectoid : list ) {
            list1.add( transferConnectoidV1ToV2Mapper.toV2( xMLElementTransferConnectoid ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementTransferZoneAccess xMLElementTransferZoneAccessToXMLElementTransferZoneAccess(XMLElementTransferZoneAccess xMLElementTransferZoneAccess) {
        if ( xMLElementTransferZoneAccess == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementTransferZoneAccess xMLElementTransferZoneAccess1 = objectFactory.createXMLElementTransferZoneAccess();

        xMLElementTransferZoneAccess1.setNetworkRef( xMLElementTransferZoneAccess.getNetworkRef() );
        xMLElementTransferZoneAccess1.setNetworkLayerRef( xMLElementTransferZoneAccess.getNetworkLayerRef() );
        if ( xMLElementTransferZoneAccess1.getConnectoids() != null ) {
            List<XMLElementTransferConnectoid> list = xMLElementTransferConnectoidListToXMLElementTransferConnectoidList( xMLElementTransferZoneAccess.getConnectoids() );
            if ( list != null ) {
                xMLElementTransferZoneAccess1.getConnectoids().addAll( list );
            }
        }

        return xMLElementTransferZoneAccess1;
    }

    protected XMLElementTransferGroup xMLElementTransferGroupToXMLElementTransferGroup(org.goplanit.xml.generated.v1.XMLElementTransferGroup xMLElementTransferGroup) {
        if ( xMLElementTransferGroup == null ) {
            return null;
        }

        XMLElementTransferGroup xMLElementTransferGroup1 = objectFactory.createXMLElementTransferGroup();

        xMLElementTransferGroup1.setName( xMLElementTransferGroup.getName() );
        xMLElementTransferGroup1.setId( xMLElementTransferGroup.getId() );
        xMLElementTransferGroup1.setExternalid( xMLElementTransferGroup.getExternalid() );
        xMLElementTransferGroup1.setTzrefs( xMLElementTransferGroup.getTzrefs() );

        return xMLElementTransferGroup1;
    }

    protected List<XMLElementTransferGroup> xMLElementTransferGroupListToXMLElementTransferGroupList(List<org.goplanit.xml.generated.v1.XMLElementTransferGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementTransferGroup> list1 = new ArrayList<XMLElementTransferGroup>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementTransferGroup xMLElementTransferGroup : list ) {
            list1.add( xMLElementTransferGroupToXMLElementTransferGroup( xMLElementTransferGroup ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementTransferZoneGroups xMLElementTransferZoneGroupsToXMLElementTransferZoneGroups(XMLElementTransferZoneGroups xMLElementTransferZoneGroups) {
        if ( xMLElementTransferZoneGroups == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementTransferZoneGroups xMLElementTransferZoneGroups1 = objectFactory.createXMLElementTransferZoneGroups();

        if ( xMLElementTransferZoneGroups1.getTransfergroups() != null ) {
            List<XMLElementTransferGroup> list = xMLElementTransferGroupListToXMLElementTransferGroupList( xMLElementTransferZoneGroups.getTransfergroups() );
            if ( list != null ) {
                xMLElementTransferZoneGroups1.getTransfergroups().addAll( list );
            }
        }

        return xMLElementTransferZoneGroups1;
    }

    protected XMLElementOutputTimePeriod xMLElementOutputTimePeriodToXMLElementOutputTimePeriod(org.goplanit.xml.generated.v1.XMLElementOutputTimePeriod xMLElementOutputTimePeriod) {
        if ( xMLElementOutputTimePeriod == null ) {
            return null;
        }

        XMLElementOutputTimePeriod xMLElementOutputTimePeriod1 = objectFactory.createXMLElementOutputTimePeriod();

        xMLElementOutputTimePeriod1.setId( xMLElementOutputTimePeriod.getId() );
        xMLElementOutputTimePeriod1.setName( xMLElementOutputTimePeriod.getName() );

        return xMLElementOutputTimePeriod1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementOutputConfiguration xMLElementOutputConfigurationToXMLElementOutputConfiguration(XMLElementOutputConfiguration xMLElementOutputConfiguration) {
        if ( xMLElementOutputConfiguration == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementOutputConfiguration xMLElementOutputConfiguration1 = objectFactory.createXMLElementOutputConfiguration();

        xMLElementOutputConfiguration1.setAssignment( xMLElementOutputConfiguration.getAssignment() );
        xMLElementOutputConfiguration1.setPhysicalcost( xMLElementOutputConfiguration.getPhysicalcost() );
        xMLElementOutputConfiguration1.setVirtualcost( xMLElementOutputConfiguration.getVirtualcost() );
        xMLElementOutputConfiguration1.setSmoothing( xMLElementOutputConfiguration.getSmoothing() );
        xMLElementOutputConfiguration1.setGapfunction( xMLElementOutputConfiguration.getGapfunction() );
        xMLElementOutputConfiguration1.setStopcriterion( xMLElementOutputConfiguration.getStopcriterion() );
        xMLElementOutputConfiguration1.setTimeperiod( xMLElementOutputTimePeriodToXMLElementOutputTimePeriod( xMLElementOutputConfiguration.getTimeperiod() ) );

        return xMLElementOutputConfiguration1;
    }

    protected XMLElementCsvdata xMLElementCsvdataToXMLElementCsvdata(org.goplanit.xml.generated.v1.XMLElementCsvdata xMLElementCsvdata) {
        if ( xMLElementCsvdata == null ) {
            return null;
        }

        XMLElementCsvdata xMLElementCsvdata1 = objectFactory.createXMLElementCsvdata();

        xMLElementCsvdata1.setValue( xMLElementCsvdata.getValue() );
        xMLElementCsvdata1.setType( xMLElementCsvdata.getType() );

        return xMLElementCsvdata1;
    }

    protected List<XMLElementCsvdata> xMLElementCsvdataListToXMLElementCsvdataList(List<org.goplanit.xml.generated.v1.XMLElementCsvdata> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementCsvdata> list1 = new ArrayList<XMLElementCsvdata>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementCsvdata xMLElementCsvdata : list ) {
            list1.add( xMLElementCsvdataToXMLElementCsvdata( xMLElementCsvdata ) );
        }

        return list1;
    }

    protected XMLElementIteration xMLElementIterationToXMLElementIteration(org.goplanit.xml.generated.v1.XMLElementIteration xMLElementIteration) {
        if ( xMLElementIteration == null ) {
            return null;
        }

        XMLElementIteration xMLElementIteration1 = objectFactory.createXMLElementIteration();

        xMLElementIteration1.setNr( xMLElementIteration.getNr() );
        if ( xMLElementIteration1.getCsvdatas() != null ) {
            List<XMLElementCsvdata> list = xMLElementCsvdataListToXMLElementCsvdataList( xMLElementIteration.getCsvdatas() );
            if ( list != null ) {
                xMLElementIteration1.getCsvdatas().addAll( list );
            }
        }

        return xMLElementIteration1;
    }

    protected List<XMLElementIteration> xMLElementIterationListToXMLElementIterationList(List<org.goplanit.xml.generated.v1.XMLElementIteration> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementIteration> list1 = new ArrayList<XMLElementIteration>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementIteration xMLElementIteration : list ) {
            list1.add( xMLElementIterationToXMLElementIteration( xMLElementIteration ) );
        }

        return list1;
    }

    protected XMLElementSimulation xMLElementSimulationToXMLElementSimulation(org.goplanit.xml.generated.v1.XMLElementSimulation xMLElementSimulation) {
        if ( xMLElementSimulation == null ) {
            return null;
        }

        XMLElementSimulation xMLElementSimulation1 = objectFactory.createXMLElementSimulation();

        if ( xMLElementSimulation1.getIterations() != null ) {
            List<XMLElementIteration> list = xMLElementIterationListToXMLElementIterationList( xMLElementSimulation.getIterations() );
            if ( list != null ) {
                xMLElementSimulation1.getIterations().addAll( list );
            }
        }

        return xMLElementSimulation1;
    }

    protected Unitsvalues unitsvaluesToUnitsvalues(org.goplanit.xml.generated.v1.Unitsvalues unitsvalues) {
        if ( unitsvalues == null ) {
            return null;
        }

        Unitsvalues unitsvalues1;

        switch ( unitsvalues ) {
            case VEH_KM: unitsvalues1 = Unitsvalues.VEH_KM;
            break;
            case PCU_KM: unitsvalues1 = Unitsvalues.PCU_KM;
            break;
            case NONE: unitsvalues1 = Unitsvalues.NONE;
            break;
            case VEH_H: unitsvalues1 = Unitsvalues.VEH_H;
            break;
            case PCU_H: unitsvalues1 = Unitsvalues.PCU_H;
            break;
            case KM_H: unitsvalues1 = Unitsvalues.KM_H;
            break;
            case H: unitsvalues1 = Unitsvalues.H;
            break;
            case KM: unitsvalues1 = Unitsvalues.KM;
            break;
            case SRS: unitsvalues1 = Unitsvalues.SRS;
            break;
            case S: unitsvalues1 = Unitsvalues.S;
            break;
            case MS: unitsvalues1 = Unitsvalues.MS;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + unitsvalues );
        }

        return unitsvalues1;
    }

    protected org.goplanit.xml.generated.v2.Typevalues typevaluesToTypevalues(Typevalues typevalues) {
        if ( typevalues == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.Typevalues typevalues1;

        switch ( typevalues ) {
            case DOUBLE: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.DOUBLE;
            break;
            case FLOAT: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.FLOAT;
            break;
            case INTEGER: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.INTEGER;
            break;
            case BOOLEAN: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.BOOLEAN;
            break;
            case SRSNAME: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.SRSNAME;
            break;
            case STRING: typevalues1 = org.goplanit.xml.generated.v2.Typevalues.STRING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + typevalues );
        }

        return typevalues1;
    }

    protected XMLElementColumn xMLElementColumnToXMLElementColumn(org.goplanit.xml.generated.v1.XMLElementColumn xMLElementColumn) {
        if ( xMLElementColumn == null ) {
            return null;
        }

        XMLElementColumn xMLElementColumn1 = objectFactory.createXMLElementColumn();

        xMLElementColumn1.setName( xMLElementColumn.getName() );
        xMLElementColumn1.setUnits( unitsvaluesToUnitsvalues( xMLElementColumn.getUnits() ) );
        xMLElementColumn1.setType( typevaluesToTypevalues( xMLElementColumn.getType() ) );

        return xMLElementColumn1;
    }

    protected List<XMLElementColumn> xMLElementColumnListToXMLElementColumnList(List<org.goplanit.xml.generated.v1.XMLElementColumn> list) {
        if ( list == null ) {
            return null;
        }

        List<XMLElementColumn> list1 = new ArrayList<XMLElementColumn>( list.size() );
        for ( org.goplanit.xml.generated.v1.XMLElementColumn xMLElementColumn : list ) {
            list1.add( xMLElementColumnToXMLElementColumn( xMLElementColumn ) );
        }

        return list1;
    }

    protected org.goplanit.xml.generated.v2.XMLElementColumns xMLElementColumnsToXMLElementColumns(XMLElementColumns xMLElementColumns) {
        if ( xMLElementColumns == null ) {
            return null;
        }

        org.goplanit.xml.generated.v2.XMLElementColumns xMLElementColumns1 = objectFactory.createXMLElementColumns();

        if ( xMLElementColumns1.getColumns() != null ) {
            List<XMLElementColumn> list = xMLElementColumnListToXMLElementColumnList( xMLElementColumns.getColumns() );
            if ( list != null ) {
                xMLElementColumns1.getColumns().addAll( list );
            }
        }

        return xMLElementColumns1;
    }
}
