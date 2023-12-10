
package com.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MEANS_TRANSPORT.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MEANS_TRANSPORT"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BICYCLE"/&gt;
 *     &lt;enumeration value="PEDESTRIANS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MEANS_TRANSPORT", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.InternalSystem.RoutingSystem")
@XmlEnum
public enum MEANSTRANSPORT {

    BICYCLE,
    PEDESTRIANS;

    public String value() {
        return name();
    }

    public static MEANSTRANSPORT fromValue(String v) {
        return valueOf(v);
    }

}
