
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Address complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISO31662lvl4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISO31662lvl6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neighbourhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="road" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suburb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", propOrder = {
    "iso31662Lvl4",
    "iso31662Lvl6",
    "country",
    "countryCode",
    "county",
    "municipality",
    "neighbourhood",
    "postcode",
    "region",
    "road",
    "state",
    "suburb",
    "town"
})
public class Address {

    @XmlElementRef(name = "ISO31662lvl4", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iso31662Lvl4;
    @XmlElementRef(name = "ISO31662lvl6", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iso31662Lvl6;
    @XmlElementRef(name = "country", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "country_code", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "county", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "municipality", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipality;
    @XmlElementRef(name = "neighbourhood", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neighbourhood;
    @XmlElementRef(name = "postcode", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "region", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "road", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> road;
    @XmlElementRef(name = "state", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "suburb", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suburb;
    @XmlElementRef(name = "town", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> town;

    /**
     * Obtient la valeur de la propriété iso31662Lvl4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISO31662Lvl4() {
        return iso31662Lvl4;
    }

    /**
     * Définit la valeur de la propriété iso31662Lvl4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISO31662Lvl4(JAXBElement<String> value) {
        this.iso31662Lvl4 = value;
    }

    /**
     * Obtient la valeur de la propriété iso31662Lvl6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISO31662Lvl6() {
        return iso31662Lvl6;
    }

    /**
     * Définit la valeur de la propriété iso31662Lvl6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISO31662Lvl6(JAXBElement<String> value) {
        this.iso31662Lvl6 = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété countryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Définit la valeur de la propriété countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Obtient la valeur de la propriété county.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Définit la valeur de la propriété county.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = value;
    }

    /**
     * Obtient la valeur de la propriété municipality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipality() {
        return municipality;
    }

    /**
     * Définit la valeur de la propriété municipality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipality(JAXBElement<String> value) {
        this.municipality = value;
    }

    /**
     * Obtient la valeur de la propriété neighbourhood.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Définit la valeur de la propriété neighbourhood.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeighbourhood(JAXBElement<String> value) {
        this.neighbourhood = value;
    }

    /**
     * Obtient la valeur de la propriété postcode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostcode() {
        return postcode;
    }

    /**
     * Définit la valeur de la propriété postcode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostcode(JAXBElement<String> value) {
        this.postcode = value;
    }

    /**
     * Obtient la valeur de la propriété region.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Définit la valeur de la propriété region.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété road.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoad() {
        return road;
    }

    /**
     * Définit la valeur de la propriété road.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoad(JAXBElement<String> value) {
        this.road = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété suburb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuburb() {
        return suburb;
    }

    /**
     * Définit la valeur de la propriété suburb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuburb(JAXBElement<String> value) {
        this.suburb = value;
    }

    /**
     * Obtient la valeur de la propriété town.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTown() {
        return town;
    }

    /**
     * Définit la valeur de la propriété town.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTown(JAXBElement<String> value) {
        this.town = value;
    }

}
