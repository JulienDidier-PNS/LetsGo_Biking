
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
 *         &lt;element name="start" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Places" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Places" minOccurs="0"/&gt;
 *         &lt;element name="activeMq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="typeOfTransport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "typeOfTransport",
    "method"
})
@XmlRootElement(name = "computeItineraryWithAddress")
public class ComputeItineraryWithAddress {

    @XmlElementRef(name = "start", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Places> start;
    @XmlElementRef(name = "end", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Places> end;
    protected Boolean activeMq;
    @XmlElementRef(name = "typeOfTransport", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfTransport;
    @XmlElementRef(name = "method", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> method;

    /**
     * Obtient la valeur de la propriété start.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Places }{@code >}
     *     
     */
    public JAXBElement<Places> getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Places }{@code >}
     *     
     */
    public void setStart(JAXBElement<Places> value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Places }{@code >}
     *     
     */
    public JAXBElement<Places> getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Places }{@code >}
     *     
     */
    public void setEnd(JAXBElement<Places> value) {
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
     * Obtient la valeur de la propriété typeOfTransport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfTransport() {
        return typeOfTransport;
    }

    /**
     * Définit la valeur de la propriété typeOfTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfTransport(JAXBElement<String> value) {
        this.typeOfTransport = value;
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
