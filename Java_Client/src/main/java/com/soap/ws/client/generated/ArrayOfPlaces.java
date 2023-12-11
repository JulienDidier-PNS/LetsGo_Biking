
package com.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfPlaces complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlaces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Places" type="{http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects}Places" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlaces", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.Exposed.Objects", propOrder = {
    "places"
})
public class ArrayOfPlaces {

    @XmlElement(name = "Places", nillable = true)
    protected List<Places> places;

    /**
     * Gets the value of the places property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the places property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Places }
     * 
     * 
     */
    public List<Places> getPlaces() {
        if (places == null) {
            places = new ArrayList<Places>();
        }
        return this.places;
    }

}
