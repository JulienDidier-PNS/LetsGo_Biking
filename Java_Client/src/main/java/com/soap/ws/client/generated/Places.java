
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Places complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Places"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Address" minOccurs="0"/&gt;
 *         &lt;element name="addresstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boundingbox" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="display_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finalCoordinate" type="{http://schemas.datacontract.org/2004/07/System.Device.Location}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="importance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osm_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="osm_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="place_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="place_rank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Places", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", propOrder = {
    "address",
    "addresstype",
    "boundingbox",
    "category",
    "displayName",
    "finalCoordinate",
    "importance",
    "lat",
    "licence",
    "lon",
    "name",
    "osmId",
    "osmType",
    "placeId",
    "placeRank",
    "type"
})
public class Places {

    @XmlElementRef(name = "address", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "addresstype", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addresstype;
    @XmlElementRef(name = "boundingbox", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> boundingbox;
    @XmlElementRef(name = "category", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category;
    @XmlElementRef(name = "display_name", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "finalCoordinate", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> finalCoordinate;
    protected Double importance;
    @XmlElementRef(name = "lat", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lat;
    @XmlElementRef(name = "licence", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licence;
    @XmlElementRef(name = "lon", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lon;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "osm_id")
    protected Long osmId;
    @XmlElementRef(name = "osm_type", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> osmType;
    @XmlElement(name = "place_id")
    protected Integer placeId;
    @XmlElement(name = "place_rank")
    protected Integer placeRank;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
    }

    /**
     * Obtient la valeur de la propriété addresstype.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddresstype() {
        return addresstype;
    }

    /**
     * Définit la valeur de la propriété addresstype.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddresstype(JAXBElement<String> value) {
        this.addresstype = value;
    }

    /**
     * Obtient la valeur de la propriété boundingbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getBoundingbox() {
        return boundingbox;
    }

    /**
     * Définit la valeur de la propriété boundingbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setBoundingbox(JAXBElement<ArrayOfstring> value) {
        this.boundingbox = value;
    }

    /**
     * Obtient la valeur de la propriété category.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory() {
        return category;
    }

    /**
     * Définit la valeur de la propriété category.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory(JAXBElement<String> value) {
        this.category = value;
    }

    /**
     * Obtient la valeur de la propriété displayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Définit la valeur de la propriété displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Obtient la valeur de la propriété finalCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getFinalCoordinate() {
        return finalCoordinate;
    }

    /**
     * Définit la valeur de la propriété finalCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setFinalCoordinate(JAXBElement<GeoCoordinate> value) {
        this.finalCoordinate = value;
    }

    /**
     * Obtient la valeur de la propriété importance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportance() {
        return importance;
    }

    /**
     * Définit la valeur de la propriété importance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportance(Double value) {
        this.importance = value;
    }

    /**
     * Obtient la valeur de la propriété lat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLat() {
        return lat;
    }

    /**
     * Définit la valeur de la propriété lat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLat(JAXBElement<String> value) {
        this.lat = value;
    }

    /**
     * Obtient la valeur de la propriété licence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicence() {
        return licence;
    }

    /**
     * Définit la valeur de la propriété licence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicence(JAXBElement<String> value) {
        this.licence = value;
    }

    /**
     * Obtient la valeur de la propriété lon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLon() {
        return lon;
    }

    /**
     * Définit la valeur de la propriété lon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLon(JAXBElement<String> value) {
        this.lon = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété osmId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOsmId() {
        return osmId;
    }

    /**
     * Définit la valeur de la propriété osmId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOsmId(Long value) {
        this.osmId = value;
    }

    /**
     * Obtient la valeur de la propriété osmType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOsmType() {
        return osmType;
    }

    /**
     * Définit la valeur de la propriété osmType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOsmType(JAXBElement<String> value) {
        this.osmType = value;
    }

    /**
     * Obtient la valeur de la propriété placeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * Définit la valeur de la propriété placeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaceId(Integer value) {
        this.placeId = value;
    }

    /**
     * Obtient la valeur de la propriété placeRank.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaceRank() {
        return placeRank;
    }

    /**
     * Définit la valeur de la propriété placeRank.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaceRank(Integer value) {
        this.placeRank = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}
