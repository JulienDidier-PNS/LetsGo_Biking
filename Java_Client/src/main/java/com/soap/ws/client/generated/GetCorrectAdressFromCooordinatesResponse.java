
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
 *         &lt;element name="getCorrectAdressFromCooordinatesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getCorrectAdressFromCooordinatesResult"
})
@XmlRootElement(name = "getCorrectAdressFromCooordinatesResponse")
public class GetCorrectAdressFromCooordinatesResponse {

    @XmlElementRef(name = "getCorrectAdressFromCooordinatesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getCorrectAdressFromCooordinatesResult;

    /**
     * Obtient la valeur de la propriété getCorrectAdressFromCooordinatesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetCorrectAdressFromCooordinatesResult() {
        return getCorrectAdressFromCooordinatesResult;
    }

    /**
     * Définit la valeur de la propriété getCorrectAdressFromCooordinatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetCorrectAdressFromCooordinatesResult(JAXBElement<String> value) {
        this.getCorrectAdressFromCooordinatesResult = value;
    }

}
