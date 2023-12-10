
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
 *         &lt;element name="getCoordonatesFromWaypointResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfArrayOfdouble" minOccurs="0"/&gt;
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
    "getCoordonatesFromWaypointResult"
})
@XmlRootElement(name = "getCoordonatesFromWaypointResponse")
public class GetCoordonatesFromWaypointResponse {

    @XmlElementRef(name = "getCoordonatesFromWaypointResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfdouble> getCoordonatesFromWaypointResult;

    /**
     * Obtient la valeur de la propriété getCoordonatesFromWaypointResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfdouble> getGetCoordonatesFromWaypointResult() {
        return getCoordonatesFromWaypointResult;
    }

    /**
     * Définit la valeur de la propriété getCoordonatesFromWaypointResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     *     
     */
    public void setGetCoordonatesFromWaypointResult(JAXBElement<ArrayOfArrayOfdouble> value) {
        this.getCoordonatesFromWaypointResult = value;
    }

}
