
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
 *         &lt;element name="getItineraryResult" type="{http://schemas.datacontract.org/2004/07/}Itinerary" minOccurs="0"/&gt;
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
    "getItineraryResult"
})
@XmlRootElement(name = "getItineraryResponse")
public class GetItineraryResponse {

    @XmlElementRef(name = "getItineraryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Itinerary> getItineraryResult;

    /**
     * Obtient la valeur de la propriété getItineraryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     *     
     */
    public JAXBElement<Itinerary> getGetItineraryResult() {
        return getItineraryResult;
    }

    /**
     * Définit la valeur de la propriété getItineraryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Itinerary }{@code >}
     *     
     */
    public void setGetItineraryResult(JAXBElement<Itinerary> value) {
        this.getItineraryResult = value;
    }

}
