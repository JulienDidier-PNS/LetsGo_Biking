
package com.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="computeItineraryWithAddressResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
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
    "computeItineraryWithAddressResult"
})
@XmlRootElement(name = "computeItineraryWithAddressResponse")
public class ComputeItineraryWithAddressResponse {

    protected String computeItineraryWithAddressResult;

    /**
     * Obtient la valeur de la propriété computeItineraryWithAddressResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputeItineraryWithAddressResult() {
        return computeItineraryWithAddressResult;
    }

    /**
     * Définit la valeur de la propriété computeItineraryWithAddressResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputeItineraryWithAddressResult(String value) {
        this.computeItineraryWithAddressResult = value;
    }

}
