
package com.soap.ws.client.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.client.generated package. 
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

    private final static QName _ArrayOfPlaces_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ArrayOfPlaces");
    private final static QName _Places_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Places");
    private final static QName _Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Address");
    private final static QName _Metadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Metadata");
    private final static QName _Engine_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Engine");
    private final static QName _Query_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Query");
    private final static QName _ArrayOfRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ArrayOfRoute");
    private final static QName _Route_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Route");
    private final static QName _ArrayOfSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ArrayOfSegment");
    private final static QName _Segment_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Segment");
    private final static QName _ArrayOfStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ArrayOfStep");
    private final static QName _Step_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Step");
    private final static QName _Summary_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "Summary");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    private final static QName _ArrayOfArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfdouble");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _GeoCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "GeoCoordinate");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Itinerary_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Itinerary");
    private final static QName _GetCorrectAdressInput_QNAME = new QName("http://tempuri.org/", "input");
    private final static QName _GetCorrectAdressResponseGetCorrectAdressResult_QNAME = new QName("http://tempuri.org/", "getCorrectAdressResult");
    private final static QName _GetCoordonateWithUniqueCorrectAdressCorrectAdrress_QNAME = new QName("http://tempuri.org/", "correctAdrress");
    private final static QName _GetCoordonateWithUniqueCorrectAdressResponseGetCoordonateWithUniqueCorrectAdressResult_QNAME = new QName("http://tempuri.org/", "getCoordonateWithUniqueCorrectAdressResult");
    private final static QName _ComputeItineraryWithAddressStart_QNAME = new QName("http://tempuri.org/", "start");
    private final static QName _ComputeItineraryWithAddressEnd_QNAME = new QName("http://tempuri.org/", "end");
    private final static QName _ComputeItineraryWithAddressTypeOfTransport_QNAME = new QName("http://tempuri.org/", "typeOfTransport");
    private final static QName _ComputeItineraryWithAddressMethod_QNAME = new QName("http://tempuri.org/", "method");
    private final static QName _GetCorrectAdressFromCooordinatesCoordinate_QNAME = new QName("http://tempuri.org/", "coordinate");
    private final static QName _GetCorrectAdressFromCooordinatesResponseGetCorrectAdressFromCooordinatesResult_QNAME = new QName("http://tempuri.org/", "getCorrectAdressFromCooordinatesResult");
    private final static QName _ComputeItineraryWithGeoCoordinatesTransport_QNAME = new QName("http://tempuri.org/", "transport");
    private final static QName _GetItineraryResponseGetItineraryResult_QNAME = new QName("http://tempuri.org/", "getItineraryResult");
    private final static QName _GetCoordonatesFromWaypointResponseGetCoordonatesFromWaypointResult_QNAME = new QName("http://tempuri.org/", "getCoordonatesFromWaypointResult");
    private final static QName _StepInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "instruction");
    private final static QName _StepName_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "name");
    private final static QName _StepWayPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "way_points");
    private final static QName _SegmentSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "steps");
    private final static QName _RouteBbox_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "bbox");
    private final static QName _RouteGeometry_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "geometry");
    private final static QName _RouteLegs_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "legs");
    private final static QName _RouteSegments_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "segments");
    private final static QName _RouteSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "summary");
    private final static QName _QueryCoordinates_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "coordinates");
    private final static QName _QueryFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "format");
    private final static QName _QueryProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "profile");
    private final static QName _EngineVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "version");
    private final static QName _MetadataAttribution_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "attribution");
    private final static QName _MetadataEngine_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "engine");
    private final static QName _MetadataQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "query");
    private final static QName _MetadataService_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "service");
    private final static QName _AddressISO31662Lvl4_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ISO31662lvl4");
    private final static QName _AddressISO31662Lvl6_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "ISO31662lvl6");
    private final static QName _AddressCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "country");
    private final static QName _AddressCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "country_code");
    private final static QName _AddressCounty_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "county");
    private final static QName _AddressMunicipality_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "municipality");
    private final static QName _AddressNeighbourhood_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "neighbourhood");
    private final static QName _AddressPostcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "postcode");
    private final static QName _AddressRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "region");
    private final static QName _AddressRoad_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "road");
    private final static QName _AddressState_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "state");
    private final static QName _AddressSuburb_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "suburb");
    private final static QName _AddressTown_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "town");
    private final static QName _ItineraryBbox_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "bbox");
    private final static QName _ItineraryFirstStationPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "firstStationPosition");
    private final static QName _ItineraryLastStationPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "lastStationPosition");
    private final static QName _ItineraryMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "metadata");
    private final static QName _ItineraryRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "routes");
    private final static QName _ItineraryTypeOfItinerary_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "typeOfItinerary");
    private final static QName _PlacesAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "address");
    private final static QName _PlacesAddresstype_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "addresstype");
    private final static QName _PlacesBoundingbox_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "boundingbox");
    private final static QName _PlacesCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "category");
    private final static QName _PlacesDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "display_name");
    private final static QName _PlacesFinalCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "finalCoordinate");
    private final static QName _PlacesLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "lat");
    private final static QName _PlacesLicence_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "licence");
    private final static QName _PlacesLon_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "lon");
    private final static QName _PlacesOsmType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "osm_type");
    private final static QName _PlacesType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", "type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCorrectAdress }
     * 
     */
    public GetCorrectAdress createGetCorrectAdress() {
        return new GetCorrectAdress();
    }

    /**
     * Create an instance of {@link GetCorrectAdressResponse }
     * 
     */
    public GetCorrectAdressResponse createGetCorrectAdressResponse() {
        return new GetCorrectAdressResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPlaces }
     * 
     */
    public ArrayOfPlaces createArrayOfPlaces() {
        return new ArrayOfPlaces();
    }

    /**
     * Create an instance of {@link GetCoordonateWithUniqueCorrectAdress }
     * 
     */
    public GetCoordonateWithUniqueCorrectAdress createGetCoordonateWithUniqueCorrectAdress() {
        return new GetCoordonateWithUniqueCorrectAdress();
    }

    /**
     * Create an instance of {@link GetCoordonateWithUniqueCorrectAdressResponse }
     * 
     */
    public GetCoordonateWithUniqueCorrectAdressResponse createGetCoordonateWithUniqueCorrectAdressResponse() {
        return new GetCoordonateWithUniqueCorrectAdressResponse();
    }

    /**
     * Create an instance of {@link GeoCoordinate }
     * 
     */
    public GeoCoordinate createGeoCoordinate() {
        return new GeoCoordinate();
    }

    /**
     * Create an instance of {@link ComputeItineraryWithAddress }
     * 
     */
    public ComputeItineraryWithAddress createComputeItineraryWithAddress() {
        return new ComputeItineraryWithAddress();
    }

    /**
     * Create an instance of {@link Places }
     * 
     */
    public Places createPlaces() {
        return new Places();
    }

    /**
     * Create an instance of {@link ComputeItineraryWithAddressResponse }
     * 
     */
    public ComputeItineraryWithAddressResponse createComputeItineraryWithAddressResponse() {
        return new ComputeItineraryWithAddressResponse();
    }

    /**
     * Create an instance of {@link GetCorrectAdressFromCooordinates }
     * 
     */
    public GetCorrectAdressFromCooordinates createGetCorrectAdressFromCooordinates() {
        return new GetCorrectAdressFromCooordinates();
    }

    /**
     * Create an instance of {@link GetCorrectAdressFromCooordinatesResponse }
     * 
     */
    public GetCorrectAdressFromCooordinatesResponse createGetCorrectAdressFromCooordinatesResponse() {
        return new GetCorrectAdressFromCooordinatesResponse();
    }

    /**
     * Create an instance of {@link ComputeItineraryWithGeoCoordinates }
     * 
     */
    public ComputeItineraryWithGeoCoordinates createComputeItineraryWithGeoCoordinates() {
        return new ComputeItineraryWithGeoCoordinates();
    }

    /**
     * Create an instance of {@link ComputeItineraryWithGeoCoordinatesResponse }
     * 
     */
    public ComputeItineraryWithGeoCoordinatesResponse createComputeItineraryWithGeoCoordinatesResponse() {
        return new ComputeItineraryWithGeoCoordinatesResponse();
    }

    /**
     * Create an instance of {@link ItineraryFinish }
     * 
     */
    public ItineraryFinish createItineraryFinish() {
        return new ItineraryFinish();
    }

    /**
     * Create an instance of {@link ItineraryFinishResponse }
     * 
     */
    public ItineraryFinishResponse createItineraryFinishResponse() {
        return new ItineraryFinishResponse();
    }

    /**
     * Create an instance of {@link GetItinerary }
     * 
     */
    public GetItinerary createGetItinerary() {
        return new GetItinerary();
    }

    /**
     * Create an instance of {@link GetItineraryResponse }
     * 
     */
    public GetItineraryResponse createGetItineraryResponse() {
        return new GetItineraryResponse();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link GetCoordonatesFromWaypoint }
     * 
     */
    public GetCoordonatesFromWaypoint createGetCoordonatesFromWaypoint() {
        return new GetCoordonatesFromWaypoint();
    }

    /**
     * Create an instance of {@link GetCoordonatesFromWaypointResponse }
     * 
     */
    public GetCoordonatesFromWaypointResponse createGetCoordonatesFromWaypointResponse() {
        return new GetCoordonatesFromWaypointResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfdouble }
     * 
     */
    public ArrayOfArrayOfdouble createArrayOfArrayOfdouble() {
        return new ArrayOfArrayOfdouble();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link Engine }
     * 
     */
    public Engine createEngine() {
        return new Engine();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link ArrayOfRoute }
     * 
     */
    public ArrayOfRoute createArrayOfRoute() {
        return new ArrayOfRoute();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link ArrayOfSegment }
     * 
     */
    public ArrayOfSegment createArrayOfSegment() {
        return new ArrayOfSegment();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link ArrayOfStep }
     * 
     */
    public ArrayOfStep createArrayOfStep() {
        return new ArrayOfStep();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfdouble }
     * 
     */
    public ArrayOfdouble createArrayOfdouble() {
        return new ArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ArrayOfPlaces")
    public JAXBElement<ArrayOfPlaces> createArrayOfPlaces(ArrayOfPlaces value) {
        return new JAXBElement<ArrayOfPlaces>(_ArrayOfPlaces_QNAME, ArrayOfPlaces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Places")
    public JAXBElement<Places> createPlaces(Places value) {
        return new JAXBElement<Places>(_Places_QNAME, Places.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Metadata")
    public JAXBElement<Metadata> createMetadata(Metadata value) {
        return new JAXBElement<Metadata>(_Metadata_QNAME, Metadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Engine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Engine }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Engine")
    public JAXBElement<Engine> createEngine(Engine value) {
        return new JAXBElement<Engine>(_Engine_QNAME, Engine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Query }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ArrayOfRoute")
    public JAXBElement<ArrayOfRoute> createArrayOfRoute(ArrayOfRoute value) {
        return new JAXBElement<ArrayOfRoute>(_ArrayOfRoute_QNAME, ArrayOfRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Route }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Route")
    public JAXBElement<Route> createRoute(Route value) {
        return new JAXBElement<Route>(_Route_QNAME, Route.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ArrayOfSegment")
    public JAXBElement<ArrayOfSegment> createArrayOfSegment(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_ArrayOfSegment_QNAME, ArrayOfSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Segment")
    public JAXBElement<Segment> createSegment(Segment value) {
        return new JAXBElement<Segment>(_Segment_QNAME, Segment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ArrayOfStep")
    public JAXBElement<ArrayOfStep> createArrayOfStep(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_ArrayOfStep_QNAME, ArrayOfStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Step")
    public JAXBElement<Step> createStep(Step value) {
        return new JAXBElement<Step>(_Step_QNAME, Step.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "Summary")
    public JAXBElement<Summary> createSummary(Summary value) {
        return new JAXBElement<Summary>(_Summary_QNAME, Summary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdouble")
    public JAXBElement<ArrayOfdouble> createArrayOfdouble(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ArrayOfdouble_QNAME, ArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfdouble")
    public JAXBElement<ArrayOfArrayOfdouble> createArrayOfArrayOfdouble(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_ArrayOfArrayOfdouble_QNAME, ArrayOfArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Device.Location", name = "GeoCoordinate")
    public JAXBElement<GeoCoordinate> createGeoCoordinate(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_GeoCoordinate_QNAME, GeoCoordinate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Itinerary")
    public JAXBElement<Itinerary> createItinerary(Itinerary value) {
        return new JAXBElement<Itinerary>(_Itinerary_QNAME, Itinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "input", scope = GetCorrectAdress.class)
    public JAXBElement<String> createGetCorrectAdressInput(String value) {
        return new JAXBElement<String>(_GetCorrectAdressInput_QNAME, String.class, GetCorrectAdress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getCorrectAdressResult", scope = GetCorrectAdressResponse.class)
    public JAXBElement<ArrayOfPlaces> createGetCorrectAdressResponseGetCorrectAdressResult(ArrayOfPlaces value) {
        return new JAXBElement<ArrayOfPlaces>(_GetCorrectAdressResponseGetCorrectAdressResult_QNAME, ArrayOfPlaces.class, GetCorrectAdressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correctAdrress", scope = GetCoordonateWithUniqueCorrectAdress.class)
    public JAXBElement<String> createGetCoordonateWithUniqueCorrectAdressCorrectAdrress(String value) {
        return new JAXBElement<String>(_GetCoordonateWithUniqueCorrectAdressCorrectAdrress_QNAME, String.class, GetCoordonateWithUniqueCorrectAdress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getCoordonateWithUniqueCorrectAdressResult", scope = GetCoordonateWithUniqueCorrectAdressResponse.class)
    public JAXBElement<GeoCoordinate> createGetCoordonateWithUniqueCorrectAdressResponseGetCoordonateWithUniqueCorrectAdressResult(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_GetCoordonateWithUniqueCorrectAdressResponseGetCoordonateWithUniqueCorrectAdressResult_QNAME, GeoCoordinate.class, GetCoordonateWithUniqueCorrectAdressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "start", scope = ComputeItineraryWithAddress.class)
    public JAXBElement<Places> createComputeItineraryWithAddressStart(Places value) {
        return new JAXBElement<Places>(_ComputeItineraryWithAddressStart_QNAME, Places.class, ComputeItineraryWithAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Places }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "end", scope = ComputeItineraryWithAddress.class)
    public JAXBElement<Places> createComputeItineraryWithAddressEnd(Places value) {
        return new JAXBElement<Places>(_ComputeItineraryWithAddressEnd_QNAME, Places.class, ComputeItineraryWithAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "typeOfTransport", scope = ComputeItineraryWithAddress.class)
    public JAXBElement<String> createComputeItineraryWithAddressTypeOfTransport(String value) {
        return new JAXBElement<String>(_ComputeItineraryWithAddressTypeOfTransport_QNAME, String.class, ComputeItineraryWithAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "method", scope = ComputeItineraryWithAddress.class)
    public JAXBElement<String> createComputeItineraryWithAddressMethod(String value) {
        return new JAXBElement<String>(_ComputeItineraryWithAddressMethod_QNAME, String.class, ComputeItineraryWithAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "coordinate", scope = GetCorrectAdressFromCooordinates.class)
    public JAXBElement<GeoCoordinate> createGetCorrectAdressFromCooordinatesCoordinate(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_GetCorrectAdressFromCooordinatesCoordinate_QNAME, GeoCoordinate.class, GetCorrectAdressFromCooordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getCorrectAdressFromCooordinatesResult", scope = GetCorrectAdressFromCooordinatesResponse.class)
    public JAXBElement<String> createGetCorrectAdressFromCooordinatesResponseGetCorrectAdressFromCooordinatesResult(String value) {
        return new JAXBElement<String>(_GetCorrectAdressFromCooordinatesResponseGetCorrectAdressFromCooordinatesResult_QNAME, String.class, GetCorrectAdressFromCooordinatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "start", scope = ComputeItineraryWithGeoCoordinates.class)
    public JAXBElement<GeoCoordinate> createComputeItineraryWithGeoCoordinatesStart(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_ComputeItineraryWithAddressStart_QNAME, GeoCoordinate.class, ComputeItineraryWithGeoCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "end", scope = ComputeItineraryWithGeoCoordinates.class)
    public JAXBElement<GeoCoordinate> createComputeItineraryWithGeoCoordinatesEnd(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_ComputeItineraryWithAddressEnd_QNAME, GeoCoordinate.class, ComputeItineraryWithGeoCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "transport", scope = ComputeItineraryWithGeoCoordinates.class)
    public JAXBElement<String> createComputeItineraryWithGeoCoordinatesTransport(String value) {
        return new JAXBElement<String>(_ComputeItineraryWithGeoCoordinatesTransport_QNAME, String.class, ComputeItineraryWithGeoCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "method", scope = ComputeItineraryWithGeoCoordinates.class)
    public JAXBElement<String> createComputeItineraryWithGeoCoordinatesMethod(String value) {
        return new JAXBElement<String>(_ComputeItineraryWithAddressMethod_QNAME, String.class, ComputeItineraryWithGeoCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getItineraryResult", scope = GetItineraryResponse.class)
    public JAXBElement<Itinerary> createGetItineraryResponseGetItineraryResult(Itinerary value) {
        return new JAXBElement<Itinerary>(_GetItineraryResponseGetItineraryResult_QNAME, Itinerary.class, GetItineraryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getCoordonatesFromWaypointResult", scope = GetCoordonatesFromWaypointResponse.class)
    public JAXBElement<ArrayOfArrayOfdouble> createGetCoordonatesFromWaypointResponseGetCoordonatesFromWaypointResult(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_GetCoordonatesFromWaypointResponseGetCoordonatesFromWaypointResult_QNAME, ArrayOfArrayOfdouble.class, GetCoordonatesFromWaypointResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "instruction", scope = Step.class)
    public JAXBElement<String> createStepInstruction(String value) {
        return new JAXBElement<String>(_StepInstruction_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "name", scope = Step.class)
    public JAXBElement<String> createStepName(String value) {
        return new JAXBElement<String>(_StepName_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "way_points", scope = Step.class)
    public JAXBElement<ArrayOfint> createStepWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StepWayPoints_QNAME, ArrayOfint.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "steps", scope = Segment.class)
    public JAXBElement<ArrayOfStep> createSegmentSteps(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_SegmentSteps_QNAME, ArrayOfStep.class, Segment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "bbox", scope = Route.class)
    public JAXBElement<ArrayOfdouble> createRouteBbox(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_RouteBbox_QNAME, ArrayOfdouble.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "geometry", scope = Route.class)
    public JAXBElement<String> createRouteGeometry(String value) {
        return new JAXBElement<String>(_RouteGeometry_QNAME, String.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "legs", scope = Route.class)
    public JAXBElement<ArrayOfanyType> createRouteLegs(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_RouteLegs_QNAME, ArrayOfanyType.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "segments", scope = Route.class)
    public JAXBElement<ArrayOfSegment> createRouteSegments(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_RouteSegments_QNAME, ArrayOfSegment.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "summary", scope = Route.class)
    public JAXBElement<Summary> createRouteSummary(Summary value) {
        return new JAXBElement<Summary>(_RouteSummary_QNAME, Summary.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "way_points", scope = Route.class)
    public JAXBElement<ArrayOfint> createRouteWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StepWayPoints_QNAME, ArrayOfint.class, Route.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "coordinates", scope = Query.class)
    public JAXBElement<ArrayOfArrayOfdouble> createQueryCoordinates(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_QueryCoordinates_QNAME, ArrayOfArrayOfdouble.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "format", scope = Query.class)
    public JAXBElement<String> createQueryFormat(String value) {
        return new JAXBElement<String>(_QueryFormat_QNAME, String.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "profile", scope = Query.class)
    public JAXBElement<String> createQueryProfile(String value) {
        return new JAXBElement<String>(_QueryProfile_QNAME, String.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "version", scope = Engine.class)
    public JAXBElement<String> createEngineVersion(String value) {
        return new JAXBElement<String>(_EngineVersion_QNAME, String.class, Engine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "attribution", scope = Metadata.class)
    public JAXBElement<String> createMetadataAttribution(String value) {
        return new JAXBElement<String>(_MetadataAttribution_QNAME, String.class, Metadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Engine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Engine }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "engine", scope = Metadata.class)
    public JAXBElement<Engine> createMetadataEngine(Engine value) {
        return new JAXBElement<Engine>(_MetadataEngine_QNAME, Engine.class, Metadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Query }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "query", scope = Metadata.class)
    public JAXBElement<Query> createMetadataQuery(Query value) {
        return new JAXBElement<Query>(_MetadataQuery_QNAME, Query.class, Metadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "service", scope = Metadata.class)
    public JAXBElement<String> createMetadataService(String value) {
        return new JAXBElement<String>(_MetadataService_QNAME, String.class, Metadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ISO31662lvl4", scope = Address.class)
    public JAXBElement<String> createAddressISO31662Lvl4(String value) {
        return new JAXBElement<String>(_AddressISO31662Lvl4_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "ISO31662lvl6", scope = Address.class)
    public JAXBElement<String> createAddressISO31662Lvl6(String value) {
        return new JAXBElement<String>(_AddressISO31662Lvl6_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "country", scope = Address.class)
    public JAXBElement<String> createAddressCountry(String value) {
        return new JAXBElement<String>(_AddressCountry_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "country_code", scope = Address.class)
    public JAXBElement<String> createAddressCountryCode(String value) {
        return new JAXBElement<String>(_AddressCountryCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "county", scope = Address.class)
    public JAXBElement<String> createAddressCounty(String value) {
        return new JAXBElement<String>(_AddressCounty_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "municipality", scope = Address.class)
    public JAXBElement<String> createAddressMunicipality(String value) {
        return new JAXBElement<String>(_AddressMunicipality_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "neighbourhood", scope = Address.class)
    public JAXBElement<String> createAddressNeighbourhood(String value) {
        return new JAXBElement<String>(_AddressNeighbourhood_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "postcode", scope = Address.class)
    public JAXBElement<String> createAddressPostcode(String value) {
        return new JAXBElement<String>(_AddressPostcode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "region", scope = Address.class)
    public JAXBElement<String> createAddressRegion(String value) {
        return new JAXBElement<String>(_AddressRegion_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "road", scope = Address.class)
    public JAXBElement<String> createAddressRoad(String value) {
        return new JAXBElement<String>(_AddressRoad_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "state", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "suburb", scope = Address.class)
    public JAXBElement<String> createAddressSuburb(String value) {
        return new JAXBElement<String>(_AddressSuburb_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "town", scope = Address.class)
    public JAXBElement<String> createAddressTown(String value) {
        return new JAXBElement<String>(_AddressTown_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "bbox", scope = Itinerary.class)
    public JAXBElement<ArrayOfdouble> createItineraryBbox(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ItineraryBbox_QNAME, ArrayOfdouble.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "firstStationPosition", scope = Itinerary.class)
    public JAXBElement<GeoCoordinate> createItineraryFirstStationPosition(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_ItineraryFirstStationPosition_QNAME, GeoCoordinate.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "lastStationPosition", scope = Itinerary.class)
    public JAXBElement<GeoCoordinate> createItineraryLastStationPosition(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_ItineraryLastStationPosition_QNAME, GeoCoordinate.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "metadata", scope = Itinerary.class)
    public JAXBElement<Metadata> createItineraryMetadata(Metadata value) {
        return new JAXBElement<Metadata>(_ItineraryMetadata_QNAME, Metadata.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "routes", scope = Itinerary.class)
    public JAXBElement<ArrayOfRoute> createItineraryRoutes(ArrayOfRoute value) {
        return new JAXBElement<ArrayOfRoute>(_ItineraryRoutes_QNAME, ArrayOfRoute.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "typeOfItinerary", scope = Itinerary.class)
    public JAXBElement<String> createItineraryTypeOfItinerary(String value) {
        return new JAXBElement<String>(_ItineraryTypeOfItinerary_QNAME, String.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "address", scope = Places.class)
    public JAXBElement<Address> createPlacesAddress(Address value) {
        return new JAXBElement<Address>(_PlacesAddress_QNAME, Address.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "addresstype", scope = Places.class)
    public JAXBElement<String> createPlacesAddresstype(String value) {
        return new JAXBElement<String>(_PlacesAddresstype_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "boundingbox", scope = Places.class)
    public JAXBElement<ArrayOfstring> createPlacesBoundingbox(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PlacesBoundingbox_QNAME, ArrayOfstring.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "category", scope = Places.class)
    public JAXBElement<String> createPlacesCategory(String value) {
        return new JAXBElement<String>(_PlacesCategory_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "display_name", scope = Places.class)
    public JAXBElement<String> createPlacesDisplayName(String value) {
        return new JAXBElement<String>(_PlacesDisplayName_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "finalCoordinate", scope = Places.class)
    public JAXBElement<GeoCoordinate> createPlacesFinalCoordinate(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_PlacesFinalCoordinate_QNAME, GeoCoordinate.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "lat", scope = Places.class)
    public JAXBElement<String> createPlacesLat(String value) {
        return new JAXBElement<String>(_PlacesLat_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "licence", scope = Places.class)
    public JAXBElement<String> createPlacesLicence(String value) {
        return new JAXBElement<String>(_PlacesLicence_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "lon", scope = Places.class)
    public JAXBElement<String> createPlacesLon(String value) {
        return new JAXBElement<String>(_PlacesLon_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "name", scope = Places.class)
    public JAXBElement<String> createPlacesName(String value) {
        return new JAXBElement<String>(_StepName_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "osm_type", scope = Places.class)
    public JAXBElement<String> createPlacesOsmType(String value) {
        return new JAXBElement<String>(_PlacesOsmType_QNAME, String.class, Places.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", name = "type", scope = Places.class)
    public JAXBElement<String> createPlacesType(String value) {
        return new JAXBElement<String>(_PlacesType_QNAME, String.class, Places.class, value);
    }

}
