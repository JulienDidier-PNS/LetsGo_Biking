
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
 *         &lt;element name="getCorrectAdressResult" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}ArrayOfPlaces" minOccurs="0"/&gt;
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
    "getCorrectAdressResult"
})
@XmlRootElement(name = "getCorrectAdressResponse")
public class GetCorrectAdressResponse {

    @XmlElementRef(name = "getCorrectAdressResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPlaces> getCorrectAdressResult;

    /**
     * Obtient la valeur de la propriété getCorrectAdressResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPlaces> getGetCorrectAdressResult() {
        return getCorrectAdressResult;
    }

    /**
     * Définit la valeur de la propriété getCorrectAdressResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPlaces }{@code >}
     *     
     */
    public void setGetCorrectAdressResult(JAXBElement<ArrayOfPlaces> value) {
        this.getCorrectAdressResult = value;
    }

}
