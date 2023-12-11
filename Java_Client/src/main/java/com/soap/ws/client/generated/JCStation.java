
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour JCStation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="JCStation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bonus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainStands" type="{http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects}JCStands" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="overflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overflowStands" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects}Position" minOccurs="0"/&gt;
 *         &lt;element name="shape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalStands" type="{http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects}JCStands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JCStation", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", propOrder = {
    "adress",
    "banking",
    "bonus",
    "connected",
    "contractName",
    "lastUpdate",
    "mainStands",
    "name",
    "number",
    "overflow",
    "overflowStands",
    "position",
    "shape",
    "status",
    "totalStands"
})
public class JCStation {

    @XmlElementRef(name = "adress", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adress;
    protected Boolean banking;
    protected Boolean bonus;
    protected Boolean connected;
    @XmlElementRef(name = "contractName", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "lastUpdate", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdate;
    @XmlElementRef(name = "mainStands", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<JCStands> mainStands;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected Integer number;
    protected Boolean overflow;
    @XmlElementRef(name = "overflowStands", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> overflowStands;
    @XmlElementRef(name = "position", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Position> position;
    @XmlElementRef(name = "shape", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shape;
    @XmlElementRef(name = "status", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "totalStands", namespace = "http://schemas.datacontract.org/2004/07/CS_ProxyCache_MAIN.Exposed.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<JCStands> totalStands;

    /**
     * Obtient la valeur de la propriété adress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdress() {
        return adress;
    }

    /**
     * Définit la valeur de la propriété adress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdress(JAXBElement<String> value) {
        this.adress = value;
    }

    /**
     * Obtient la valeur de la propriété banking.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBanking() {
        return banking;
    }

    /**
     * Définit la valeur de la propriété banking.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanking(Boolean value) {
        this.banking = value;
    }

    /**
     * Obtient la valeur de la propriété bonus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBonus() {
        return bonus;
    }

    /**
     * Définit la valeur de la propriété bonus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBonus(Boolean value) {
        this.bonus = value;
    }

    /**
     * Obtient la valeur de la propriété connected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnected() {
        return connected;
    }

    /**
     * Définit la valeur de la propriété connected.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnected(Boolean value) {
        this.connected = value;
    }

    /**
     * Obtient la valeur de la propriété contractName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractName() {
        return contractName;
    }

    /**
     * Définit la valeur de la propriété contractName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractName(JAXBElement<String> value) {
        this.contractName = value;
    }

    /**
     * Obtient la valeur de la propriété lastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Définit la valeur de la propriété lastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdate(JAXBElement<String> value) {
        this.lastUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété mainStands.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JCStands }{@code >}
     *     
     */
    public JAXBElement<JCStands> getMainStands() {
        return mainStands;
    }

    /**
     * Définit la valeur de la propriété mainStands.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JCStands }{@code >}
     *     
     */
    public void setMainStands(JAXBElement<JCStands> value) {
        this.mainStands = value;
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
     * Obtient la valeur de la propriété number.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Obtient la valeur de la propriété overflow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverflow() {
        return overflow;
    }

    /**
     * Définit la valeur de la propriété overflow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverflow(Boolean value) {
        this.overflow = value;
    }

    /**
     * Obtient la valeur de la propriété overflowStands.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getOverflowStands() {
        return overflowStands;
    }

    /**
     * Définit la valeur de la propriété overflowStands.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setOverflowStands(JAXBElement<Object> value) {
        this.overflowStands = value;
    }

    /**
     * Obtient la valeur de la propriété position.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Position }{@code >}
     *     
     */
    public JAXBElement<Position> getPosition() {
        return position;
    }

    /**
     * Définit la valeur de la propriété position.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Position }{@code >}
     *     
     */
    public void setPosition(JAXBElement<Position> value) {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propriété shape.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShape() {
        return shape;
    }

    /**
     * Définit la valeur de la propriété shape.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShape(JAXBElement<String> value) {
        this.shape = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété totalStands.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JCStands }{@code >}
     *     
     */
    public JAXBElement<JCStands> getTotalStands() {
        return totalStands;
    }

    /**
     * Définit la valeur de la propriété totalStands.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JCStands }{@code >}
     *     
     */
    public void setTotalStands(JAXBElement<JCStands> value) {
        this.totalStands = value;
    }

}
