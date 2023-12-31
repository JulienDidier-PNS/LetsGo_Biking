
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Route complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bbox" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdouble" minOccurs="0"/&gt;
 *         &lt;element name="geometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/&gt;
 *         &lt;element name="segments" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}ArrayOfSegment" minOccurs="0"/&gt;
 *         &lt;element name="summary" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Summary" minOccurs="0"/&gt;
 *         &lt;element name="way_points" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", propOrder = {
    "bbox",
    "geometry",
    "legs",
    "segments",
    "summary",
    "wayPoints"
})
public class Route {

    @XmlElementRef(name = "bbox", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdouble> bbox;
    @XmlElementRef(name = "geometry", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geometry;
    @XmlElementRef(name = "legs", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> legs;
    @XmlElementRef(name = "segments", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSegment> segments;
    @XmlElementRef(name = "summary", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Summary> summary;
    @XmlElementRef(name = "way_points", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wayPoints;

    /**
     * Obtient la valeur de la propriété bbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdouble> getBbox() {
        return bbox;
    }

    /**
     * Définit la valeur de la propriété bbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public void setBbox(JAXBElement<ArrayOfdouble> value) {
        this.bbox = value;
    }

    /**
     * Obtient la valeur de la propriété geometry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeometry() {
        return geometry;
    }

    /**
     * Définit la valeur de la propriété geometry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeometry(JAXBElement<String> value) {
        this.geometry = value;
    }

    /**
     * Obtient la valeur de la propriété legs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getLegs() {
        return legs;
    }

    /**
     * Définit la valeur de la propriété legs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setLegs(JAXBElement<ArrayOfanyType> value) {
        this.legs = value;
    }

    /**
     * Obtient la valeur de la propriété segments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSegment> getSegments() {
        return segments;
    }

    /**
     * Définit la valeur de la propriété segments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public void setSegments(JAXBElement<ArrayOfSegment> value) {
        this.segments = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Summary }{@code >}
     *     
     */
    public JAXBElement<Summary> getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Summary }{@code >}
     *     
     */
    public void setSummary(JAXBElement<Summary> value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propriété wayPoints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getWayPoints() {
        return wayPoints;
    }

    /**
     * Définit la valeur de la propriété wayPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setWayPoints(JAXBElement<ArrayOfint> value) {
        this.wayPoints = value;
    }

}
