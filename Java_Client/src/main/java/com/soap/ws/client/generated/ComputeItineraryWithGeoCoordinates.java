
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="activeMq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "start",
    "end",
    "activeMq",
    "transport",
    "method"
})
@XmlRootElement(name = "computeItineraryWithGeoCoordinates")
public class ComputeItineraryWithGeoCoordinates {

    @XmlElementRef(name = "start", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> start;
    @XmlElementRef(name = "end", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> end;
    protected Boolean activeMq;
    @XmlElementRef(name = "transport", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transport;
    @XmlElementRef(name = "method", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> method;

    /**
     * Obtient la valeur de la propriété start.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setStart(JAXBElement<GeoCoordinate> value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setEnd(JAXBElement<GeoCoordinate> value) {
        this.end = value;
    }

    /**
     * Obtient la valeur de la propriété activeMq.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveMq() {
        return activeMq;
    }

    /**
     * Définit la valeur de la propriété activeMq.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveMq(Boolean value) {
        this.activeMq = value;
    }

    /**
     * Obtient la valeur de la propriété transport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransport() {
        return transport;
    }

    /**
     * Définit la valeur de la propriété transport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransport(JAXBElement<String> value) {
        this.transport = value;
    }

    /**
     * Obtient la valeur de la propriété method.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMethod() {
        return method;
    }

    /**
     * Définit la valeur de la propriété method.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMethod(JAXBElement<String> value) {
        this.method = value;
    }

}
