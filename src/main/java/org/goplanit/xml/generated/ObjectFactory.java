
package org.goplanit.xml.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalTime;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.goplanit.xml.bindings.TimeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.goplanit.xml.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Starttime_QNAME = new QName("", "starttime");
    private final static QName _Maxdensitylane_QNAME = new QName("", "maxdensitylane");
    private final static QName _Pcu_QNAME = new QName("", "pcu");
    private final static QName _Capacitylane_QNAME = new QName("", "capacitylane");
    private final static QName _Maxspeed_QNAME = new QName("", "maxspeed");
    private final static QName _Critspeed_QNAME = new QName("", "critspeed");
    private final static QName _Numberoflanes_QNAME = new QName("", "numberoflanes");
    private final static QName _Assignment_QNAME = new QName("", "assignment");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Nr_QNAME = new QName("", "nr");
    private final static QName _Physicalcost_QNAME = new QName("", "physicalcost");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Timestamp_QNAME = new QName("", "timestamp");
    private final static QName _Units_QNAME = new QName("", "units");
    private final static QName _Version_QNAME = new QName("", "version");
    private final static QName _Virtualcost_QNAME = new QName("", "virtualcost");
    private final static QName _Price_QNAME = new QName("", "price");
    private final static QName _Smoothing_QNAME = new QName("", "smoothing");
    private final static QName _Gapfunction_QNAME = new QName("", "gapfunction");
    private final static QName _Stopcriterion_QNAME = new QName("", "stopcriterion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.goplanit.xml.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XMLElementRoutedServices }
     * 
     */
    public XMLElementRoutedServices createXMLElementRoutedServices() {
        return new XMLElementRoutedServices();
    }

    /**
     * Create an instance of {@link XMLElementRelativeTimings }
     * 
     */
    public XMLElementRelativeTimings createXMLElementRelativeTimings() {
        return new XMLElementRelativeTimings();
    }

    /**
     * Create an instance of {@link XMLElementDepartures }
     * 
     */
    public XMLElementDepartures createXMLElementDepartures() {
        return new XMLElementDepartures();
    }

    /**
     * Create an instance of {@link XMLElementRoutedTrip }
     * 
     */
    public XMLElementRoutedTrip createXMLElementRoutedTrip() {
        return new XMLElementRoutedTrip();
    }

    /**
     * Create an instance of {@link XMLElementServiceNodes }
     * 
     */
    public XMLElementServiceNodes createXMLElementServiceNodes() {
        return new XMLElementServiceNodes();
    }

    /**
     * Create an instance of {@link XMLElementServiceLeg }
     * 
     */
    public XMLElementServiceLeg createXMLElementServiceLeg() {
        return new XMLElementServiceLeg();
    }

    /**
     * Create an instance of {@link XMLElementZones }
     * 
     */
    public XMLElementZones createXMLElementZones() {
        return new XMLElementZones();
    }

    /**
     * Create an instance of {@link XMLElementTransferZoneAccess }
     * 
     */
    public XMLElementTransferZoneAccess createXMLElementTransferZoneAccess() {
        return new XMLElementTransferZoneAccess();
    }

    /**
     * Create an instance of {@link XMLElementTransferZones }
     * 
     */
    public XMLElementTransferZones createXMLElementTransferZones() {
        return new XMLElementTransferZones();
    }

    /**
     * Create an instance of {@link XMLElementNodes }
     * 
     */
    public XMLElementNodes createXMLElementNodes() {
        return new XMLElementNodes();
    }

    /**
     * Create an instance of {@link XMLElementModes }
     * 
     */
    public XMLElementModes createXMLElementModes() {
        return new XMLElementModes();
    }

    /**
     * Create an instance of {@link XMLElementLinks }
     * 
     */
    public XMLElementLinks createXMLElementLinks() {
        return new XMLElementLinks();
    }

    /**
     * Create an instance of {@link XMLElementLinkSegmentType }
     * 
     */
    public XMLElementLinkSegmentType createXMLElementLinkSegmentType() {
        return new XMLElementLinkSegmentType();
    }

    /**
     * Create an instance of {@link XMLElementUserClasses }
     * 
     */
    public XMLElementUserClasses createXMLElementUserClasses() {
        return new XMLElementUserClasses();
    }

    /**
     * Create an instance of {@link XMLElementTravellerTypes }
     * 
     */
    public XMLElementTravellerTypes createXMLElementTravellerTypes() {
        return new XMLElementTravellerTypes();
    }

    /**
     * Create an instance of {@link XMLElementTimePeriods }
     * 
     */
    public XMLElementTimePeriods createXMLElementTimePeriods() {
        return new XMLElementTimePeriods();
    }

    /**
     * Create an instance of {@link XMLElementOdRowMatrix }
     * 
     */
    public XMLElementOdRowMatrix createXMLElementOdRowMatrix() {
        return new XMLElementOdRowMatrix();
    }

    /**
     * Create an instance of {@link XMLElementOdRawMatrix }
     * 
     */
    public XMLElementOdRawMatrix createXMLElementOdRawMatrix() {
        return new XMLElementOdRawMatrix();
    }

    /**
     * Create an instance of {@link XMLElementOdCellByCellMatrix }
     * 
     */
    public XMLElementOdCellByCellMatrix createXMLElementOdCellByCellMatrix() {
        return new XMLElementOdCellByCellMatrix();
    }

    /**
     * Create an instance of {@link XMLElementOdCellByCellMatrix.O }
     * 
     */
    public XMLElementOdCellByCellMatrix.O createXMLElementOdCellByCellMatrixO() {
        return new XMLElementOdCellByCellMatrix.O();
    }

    /**
     * Create an instance of {@link XMLElementCentroid }
     * 
     */
    public XMLElementCentroid createXMLElementCentroid() {
        return new XMLElementCentroid();
    }

    /**
     * Create an instance of {@link XMLElementMacroscopicDemand }
     * 
     */
    public XMLElementMacroscopicDemand createXMLElementMacroscopicDemand() {
        return new XMLElementMacroscopicDemand();
    }

    /**
     * Create an instance of {@link XMLElementDemandConfiguration }
     * 
     */
    public XMLElementDemandConfiguration createXMLElementDemandConfiguration() {
        return new XMLElementDemandConfiguration();
    }

    /**
     * Create an instance of {@link XMLElementDuration }
     * 
     */
    public XMLElementDuration createXMLElementDuration() {
        return new XMLElementDuration();
    }

    /**
     * Create an instance of {@link XMLElementOdDemands }
     * 
     */
    public XMLElementOdDemands createXMLElementOdDemands() {
        return new XMLElementOdDemands();
    }

    /**
     * Create an instance of {@link XMLElementAccessGroup }
     * 
     */
    public XMLElementAccessGroup createXMLElementAccessGroup() {
        return new XMLElementAccessGroup();
    }

    /**
     * Create an instance of {@link XMLElementConfiguration }
     * 
     */
    public XMLElementConfiguration createXMLElementConfiguration() {
        return new XMLElementConfiguration();
    }

    /**
     * Create an instance of {@link XMLElementLayerConfiguration }
     * 
     */
    public XMLElementLayerConfiguration createXMLElementLayerConfiguration() {
        return new XMLElementLayerConfiguration();
    }

    /**
     * Create an instance of {@link XMLElementInfrastructureLayer }
     * 
     */
    public XMLElementInfrastructureLayer createXMLElementInfrastructureLayer() {
        return new XMLElementInfrastructureLayer();
    }

    /**
     * Create an instance of {@link XMLElementInfrastructureLayers }
     * 
     */
    public XMLElementInfrastructureLayers createXMLElementInfrastructureLayers() {
        return new XMLElementInfrastructureLayers();
    }

    /**
     * Create an instance of {@link XMLElementLinkSegmentTypes }
     * 
     */
    public XMLElementLinkSegmentTypes createXMLElementLinkSegmentTypes() {
        return new XMLElementLinkSegmentTypes();
    }

    /**
     * Create an instance of {@link XMLElementLinkSegment }
     * 
     */
    public XMLElementLinkSegment createXMLElementLinkSegment() {
        return new XMLElementLinkSegment();
    }

    /**
     * Create an instance of {@link XMLElementPhysicalFeatures }
     * 
     */
    public XMLElementPhysicalFeatures createXMLElementPhysicalFeatures() {
        return new XMLElementPhysicalFeatures();
    }

    /**
     * Create an instance of {@link XMLElementUsabilityFeatures }
     * 
     */
    public XMLElementUsabilityFeatures createXMLElementUsabilityFeatures() {
        return new XMLElementUsabilityFeatures();
    }

    /**
     * Create an instance of {@link XMLElementMacroscopicNetwork }
     * 
     */
    public XMLElementMacroscopicNetwork createXMLElementMacroscopicNetwork() {
        return new XMLElementMacroscopicNetwork();
    }

    /**
     * Create an instance of {@link XMLElementTransferZoneGroups }
     * 
     */
    public XMLElementTransferZoneGroups createXMLElementTransferZoneGroups() {
        return new XMLElementTransferZoneGroups();
    }

    /**
     * Create an instance of {@link XMLElementTransferGroup }
     * 
     */
    public XMLElementTransferGroup createXMLElementTransferGroup() {
        return new XMLElementTransferGroup();
    }

    /**
     * Create an instance of {@link Intermodaltype }
     * 
     */
    public Intermodaltype createIntermodaltype() {
        return new Intermodaltype();
    }

    /**
     * Create an instance of {@link XMLElementConnectoids }
     * 
     */
    public XMLElementConnectoids createXMLElementConnectoids() {
        return new XMLElementConnectoids();
    }

    /**
     * Create an instance of {@link XMLElementConnectoid }
     * 
     */
    public XMLElementConnectoid createXMLElementConnectoid() {
        return new XMLElementConnectoid();
    }

    /**
     * Create an instance of {@link XMLElementMacroscopicZoning }
     * 
     */
    public XMLElementMacroscopicZoning createXMLElementMacroscopicZoning() {
        return new XMLElementMacroscopicZoning();
    }

    /**
     * Create an instance of {@link XMLElementServiceLegs }
     * 
     */
    public XMLElementServiceLegs createXMLElementServiceLegs() {
        return new XMLElementServiceLegs();
    }

    /**
     * Create an instance of {@link XMLElementServiceNetworkLayer }
     * 
     */
    public XMLElementServiceNetworkLayer createXMLElementServiceNetworkLayer() {
        return new XMLElementServiceNetworkLayer();
    }

    /**
     * Create an instance of {@link XMLElementServiceNetwork }
     * 
     */
    public XMLElementServiceNetwork createXMLElementServiceNetwork() {
        return new XMLElementServiceNetwork();
    }

    /**
     * Create an instance of {@link XMLElementServices }
     * 
     */
    public XMLElementServices createXMLElementServices() {
        return new XMLElementServices();
    }

    /**
     * Create an instance of {@link XMLElementService }
     * 
     */
    public XMLElementService createXMLElementService() {
        return new XMLElementService();
    }

    /**
     * Create an instance of {@link XMLElementRoutedTrips }
     * 
     */
    public XMLElementRoutedTrips createXMLElementRoutedTrips() {
        return new XMLElementRoutedTrips();
    }

    /**
     * Create an instance of {@link XMLElementRoutedServicesLayer }
     * 
     */
    public XMLElementRoutedServicesLayer createXMLElementRoutedServicesLayer() {
        return new XMLElementRoutedServicesLayer();
    }

    /**
     * Create an instance of {@link XMLElementPLANit }
     * 
     */
    public XMLElementPLANit createXMLElementPLANit() {
        return new XMLElementPLANit();
    }

    /**
     * Create an instance of {@link XMLElementMetadata }
     * 
     */
    public XMLElementMetadata createXMLElementMetadata() {
        return new XMLElementMetadata();
    }

    /**
     * Create an instance of {@link XMLElementOutputConfiguration }
     * 
     */
    public XMLElementOutputConfiguration createXMLElementOutputConfiguration() {
        return new XMLElementOutputConfiguration();
    }

    /**
     * Create an instance of {@link XMLElementOutputTimePeriod }
     * 
     */
    public XMLElementOutputTimePeriod createXMLElementOutputTimePeriod() {
        return new XMLElementOutputTimePeriod();
    }

    /**
     * Create an instance of {@link XMLElementSimulation }
     * 
     */
    public XMLElementSimulation createXMLElementSimulation() {
        return new XMLElementSimulation();
    }

    /**
     * Create an instance of {@link XMLElementCsvdata }
     * 
     */
    public XMLElementCsvdata createXMLElementCsvdata() {
        return new XMLElementCsvdata();
    }

    /**
     * Create an instance of {@link XMLElementIteration }
     * 
     */
    public XMLElementIteration createXMLElementIteration() {
        return new XMLElementIteration();
    }

    /**
     * Create an instance of {@link XMLElementColumns }
     * 
     */
    public XMLElementColumns createXMLElementColumns() {
        return new XMLElementColumns();
    }

    /**
     * Create an instance of {@link XMLElementColumn }
     * 
     */
    public XMLElementColumn createXMLElementColumn() {
        return new XMLElementColumn();
    }

    /**
     * Create an instance of {@link Connectoidtype }
     * 
     */
    public Connectoidtype createConnectoidtype() {
        return new Connectoidtype();
    }

    /**
     * Create an instance of {@link XMLElementUnrestrictedDuration }
     * 
     */
    public XMLElementUnrestrictedDuration createXMLElementUnrestrictedDuration() {
        return new XMLElementUnrestrictedDuration();
    }

    /**
     * Create an instance of {@link XMLElementOdMatrix }
     * 
     */
    public XMLElementOdMatrix createXMLElementOdMatrix() {
        return new XMLElementOdMatrix();
    }

    /**
     * Create an instance of {@link XMLElementLinkLengthType }
     * 
     */
    public XMLElementLinkLengthType createXMLElementLinkLengthType() {
        return new XMLElementLinkLengthType();
    }

    /**
     * Create an instance of {@link XMLElementRoutedServices.Servicelayers }
     * 
     */
    public XMLElementRoutedServices.Servicelayers createXMLElementRoutedServicesServicelayers() {
        return new XMLElementRoutedServices.Servicelayers();
    }

    /**
     * Create an instance of {@link XMLElementRelativeTimings.Leg }
     * 
     */
    public XMLElementRelativeTimings.Leg createXMLElementRelativeTimingsLeg() {
        return new XMLElementRelativeTimings.Leg();
    }

    /**
     * Create an instance of {@link XMLElementDepartures.Departure }
     * 
     */
    public XMLElementDepartures.Departure createXMLElementDeparturesDeparture() {
        return new XMLElementDepartures.Departure();
    }

    /**
     * Create an instance of {@link XMLElementRoutedTrip.Schedule }
     * 
     */
    public XMLElementRoutedTrip.Schedule createXMLElementRoutedTripSchedule() {
        return new XMLElementRoutedTrip.Schedule();
    }

    /**
     * Create an instance of {@link XMLElementRoutedTrip.Frequency }
     * 
     */
    public XMLElementRoutedTrip.Frequency createXMLElementRoutedTripFrequency() {
        return new XMLElementRoutedTrip.Frequency();
    }

    /**
     * Create an instance of {@link XMLElementServiceNodes.Servicenode }
     * 
     */
    public XMLElementServiceNodes.Servicenode createXMLElementServiceNodesServicenode() {
        return new XMLElementServiceNodes.Servicenode();
    }

    /**
     * Create an instance of {@link XMLElementServiceLeg.Legsegment }
     * 
     */
    public XMLElementServiceLeg.Legsegment createXMLElementServiceLegLegsegment() {
        return new XMLElementServiceLeg.Legsegment();
    }

    /**
     * Create an instance of {@link XMLElementZones.Zone }
     * 
     */
    public XMLElementZones.Zone createXMLElementZonesZone() {
        return new XMLElementZones.Zone();
    }

    /**
     * Create an instance of {@link XMLElementTransferZoneAccess.XMLElementTransferConnectoid }
     * 
     */
    public XMLElementTransferZoneAccess.XMLElementTransferConnectoid createXMLElementTransferZoneAccessXMLElementTransferConnectoid() {
        return new XMLElementTransferZoneAccess.XMLElementTransferConnectoid();
    }

    /**
     * Create an instance of {@link XMLElementTransferZones.XMLElementTransferZone }
     * 
     */
    public XMLElementTransferZones.XMLElementTransferZone createXMLElementTransferZonesXMLElementTransferZone() {
        return new XMLElementTransferZones.XMLElementTransferZone();
    }

    /**
     * Create an instance of {@link XMLElementNodes.Node }
     * 
     */
    public XMLElementNodes.Node createXMLElementNodesNode() {
        return new XMLElementNodes.Node();
    }

    /**
     * Create an instance of {@link XMLElementModes.Mode }
     * 
     */
    public XMLElementModes.Mode createXMLElementModesMode() {
        return new XMLElementModes.Mode();
    }

    /**
     * Create an instance of {@link XMLElementLinks.Link }
     * 
     */
    public XMLElementLinks.Link createXMLElementLinksLink() {
        return new XMLElementLinks.Link();
    }

    /**
     * Create an instance of {@link XMLElementLinkSegmentType.Access }
     * 
     */
    public XMLElementLinkSegmentType.Access createXMLElementLinkSegmentTypeAccess() {
        return new XMLElementLinkSegmentType.Access();
    }

    /**
     * Create an instance of {@link XMLElementUserClasses.Userclass }
     * 
     */
    public XMLElementUserClasses.Userclass createXMLElementUserClassesUserclass() {
        return new XMLElementUserClasses.Userclass();
    }

    /**
     * Create an instance of {@link XMLElementTravellerTypes.Travellertype }
     * 
     */
    public XMLElementTravellerTypes.Travellertype createXMLElementTravellerTypesTravellertype() {
        return new XMLElementTravellerTypes.Travellertype();
    }

    /**
     * Create an instance of {@link XMLElementTimePeriods.Timeperiod }
     * 
     */
    public XMLElementTimePeriods.Timeperiod createXMLElementTimePeriodsTimeperiod() {
        return new XMLElementTimePeriods.Timeperiod();
    }

    /**
     * Create an instance of {@link XMLElementOdRowMatrix.Odrow }
     * 
     */
    public XMLElementOdRowMatrix.Odrow createXMLElementOdRowMatrixOdrow() {
        return new XMLElementOdRowMatrix.Odrow();
    }

    /**
     * Create an instance of {@link XMLElementOdRawMatrix.Values }
     * 
     */
    public XMLElementOdRawMatrix.Values createXMLElementOdRawMatrixValues() {
        return new XMLElementOdRawMatrix.Values();
    }

    /**
     * Create an instance of {@link XMLElementOdCellByCellMatrix.O.D }
     * 
     */
    public XMLElementOdCellByCellMatrix.O.D createXMLElementOdCellByCellMatrixOD() {
        return new XMLElementOdCellByCellMatrix.O.D();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalTime }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "starttime", defaultValue = "00:00:00")
    @XmlJavaTypeAdapter(TimeAdapter.class)
    public JAXBElement<LocalTime> createStarttime(LocalTime value) {
        return new JAXBElement<LocalTime>(_Starttime_QNAME, LocalTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "maxdensitylane", defaultValue = "180.0")
    public JAXBElement<Double> createMaxdensitylane(Double value) {
        return new JAXBElement<Double>(_Maxdensitylane_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pcu", defaultValue = "1")
    public JAXBElement<Double> createPcu(Double value) {
        return new JAXBElement<Double>(_Pcu_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "capacitylane", defaultValue = "1800.0")
    public JAXBElement<Double> createCapacitylane(Double value) {
        return new JAXBElement<Double>(_Capacitylane_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "maxspeed", defaultValue = "80.0")
    public JAXBElement<Double> createMaxspeed(Double value) {
        return new JAXBElement<Double>(_Maxspeed_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "critspeed")
    public JAXBElement<Double> createCritspeed(Double value) {
        return new JAXBElement<Double>(_Critspeed_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numberoflanes", defaultValue = "1")
    public JAXBElement<BigInteger> createNumberoflanes(BigInteger value) {
        return new JAXBElement<BigInteger>(_Numberoflanes_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link XMLElementMacroscopicIntermodal }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link XMLElementMacroscopicIntermodal }
     */
    @XmlElementDecl(namespace = "", name = "macroscopicintermodal")
    public XMLElementMacroscopicIntermodal createXMLElementMacroscopicIntermodal(Intermodaltype value) {
        return new XMLElementMacroscopicIntermodal(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "assignment")
    public JAXBElement<String> createAssignment(String value) {
        return new JAXBElement<String>(_Assignment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nr")
    public JAXBElement<BigInteger> createNr(BigInteger value) {
        return new JAXBElement<BigInteger>(_Nr_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "physicalcost")
    public JAXBElement<String> createPhysicalcost(String value) {
        return new JAXBElement<String>(_Physicalcost_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Typevalues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Typevalues }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<Typevalues> createType(Typevalues value) {
        return new JAXBElement<Typevalues>(_Type_QNAME, Typevalues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "timestamp")
    public JAXBElement<XMLGregorianCalendar> createTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Timestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unitsvalues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Unitsvalues }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "units")
    public JAXBElement<Unitsvalues> createUnits(Unitsvalues value) {
        return new JAXBElement<Unitsvalues>(_Units_QNAME, Unitsvalues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "virtualcost")
    public JAXBElement<String> createVirtualcost(String value) {
        return new JAXBElement<String>(_Virtualcost_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "price")
    public JAXBElement<BigDecimal> createPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Price_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "smoothing")
    public JAXBElement<String> createSmoothing(String value) {
        return new JAXBElement<String>(_Smoothing_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "gapfunction")
    public JAXBElement<String> createGapfunction(String value) {
        return new JAXBElement<String>(_Gapfunction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "stopcriterion")
    public JAXBElement<String> createStopcriterion(String value) {
        return new JAXBElement<String>(_Stopcriterion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link XMLElementMacroscopicZoning.XMLElementIntermodal }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link XMLElementMacroscopicZoning.XMLElementIntermodal }
     */
    @XmlElementDecl(namespace = "", name = "intermodal", scope = XMLElementMacroscopicZoning.class)
    public XMLElementMacroscopicZoning.XMLElementIntermodal createXMLElementMacroscopicZoningXMLElementIntermodal(Intermodaltype value) {
        return new XMLElementMacroscopicZoning.XMLElementIntermodal(value);
    }

}
