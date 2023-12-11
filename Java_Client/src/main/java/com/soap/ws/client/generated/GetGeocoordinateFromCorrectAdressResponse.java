
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
 *         &lt;element name="getGeocoordinateFromCorrectAdressResult" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
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
    "getGeocoordinateFromCorrectAdressResult"
})
@XmlRootElement(name = "getGeocoordinateFromCorrectAdressResponse")
public class GetGeocoordinateFromCorrectAdressResponse {

    @XmlElementRef(name = "getGeocoordinateFromCorrectAdressResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> getGeocoordinateFromCorrectAdressResult;

    /**
     * Obtient la valeur de la propriété getGeocoordinateFromCorrectAdressResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getGetGeocoordinateFromCorrectAdressResult() {
        return getGeocoordinateFromCorrectAdressResult;
    }

    /**
     * Définit la valeur de la propriété getGeocoordinateFromCorrectAdressResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setGetGeocoordinateFromCorrectAdressResult(JAXBElement<GeoCoordinate> value) {
        this.getGeocoordinateFromCorrectAdressResult = value;
    }

}
