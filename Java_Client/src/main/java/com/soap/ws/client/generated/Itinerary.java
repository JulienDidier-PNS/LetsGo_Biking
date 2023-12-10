
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Itinerary complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bbox" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdouble" minOccurs="0"/&gt;
 *         &lt;element name="currentPosition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="firstStationPosition" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="lastStationPosition" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="metadata" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Metadata" minOccurs="0"/&gt;
 *         &lt;element name="routes" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}ArrayOfRoute" minOccurs="0"/&gt;
 *         &lt;element name="totalSteps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="typeOfItinerary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "bbox",
    "currentPosition",
    "firstStationPosition",
    "lastStationPosition",
    "metadata",
    "routes",
    "totalSteps",
    "typeOfItinerary"
})
public class Itinerary {

    @XmlElementRef(name = "bbox", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdouble> bbox;
    protected Integer currentPosition;
    @XmlElementRef(name = "firstStationPosition", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> firstStationPosition;
    @XmlElementRef(name = "lastStationPosition", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> lastStationPosition;
    @XmlElementRef(name = "metadata", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<Metadata> metadata;
    @XmlElementRef(name = "routes", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoute> routes;
    protected Integer totalSteps;
    @XmlElementRef(name = "typeOfItinerary", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfItinerary;

    /**
     * Obtient la valeur de la propriété bbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdouble> getBbox() {
        return bbox;
    }

    /**
     * Définit la valeur de la propriété bbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public void setBbox(JAXBElement<ArrayOfdouble> value) {
        this.bbox = value;
    }

    /**
     * Obtient la valeur de la propriété currentPosition.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Définit la valeur de la propriété currentPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPosition(Integer value) {
        this.currentPosition = value;
    }

    /**
     * Obtient la valeur de la propriété firstStationPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getFirstStationPosition() {
        return firstStationPosition;
    }

    /**
     * Définit la valeur de la propriété firstStationPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setFirstStationPosition(JAXBElement<GeoCoordinate> value) {
        this.firstStationPosition = value;
    }

    /**
     * Obtient la valeur de la propriété lastStationPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getLastStationPosition() {
        return lastStationPosition;
    }

    /**
     * Définit la valeur de la propriété lastStationPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setLastStationPosition(JAXBElement<GeoCoordinate> value) {
        this.lastStationPosition = value;
    }

    /**
     * Obtient la valeur de la propriété metadata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     *     
     */
    public JAXBElement<Metadata> getMetadata() {
        return metadata;
    }

    /**
     * Définit la valeur de la propriété metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     *     
     */
    public void setMetadata(JAXBElement<Metadata> value) {
        this.metadata = value;
    }

    /**
     * Obtient la valeur de la propriété routes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoute> getRoutes() {
        return routes;
    }

    /**
     * Définit la valeur de la propriété routes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<ArrayOfRoute> value) {
        this.routes = value;
    }

    /**
     * Obtient la valeur de la propriété totalSteps.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSteps() {
        return totalSteps;
    }

    /**
     * Définit la valeur de la propriété totalSteps.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSteps(Integer value) {
        this.totalSteps = value;
    }

    /**
     * Obtient la valeur de la propriété typeOfItinerary.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfItinerary() {
        return typeOfItinerary;
    }

    /**
     * Définit la valeur de la propriété typeOfItinerary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfItinerary(JAXBElement<String> value) {
        this.typeOfItinerary = value;
    }

}
