
package com.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour COMPUTE_METHOD.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="COMPUTE_METHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHORTEST_DISTANCE"/&gt;
 *     &lt;enumeration value="SHORTEST_TIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "COMPUTE_METHOD", namespace = "http://schemas.datacontract.org/2004/07/CS_Server_Main.InternalSystem.RoutingSystem")
@XmlEnum
public enum COMPUTEMETHOD {

    SHORTEST_DISTANCE,
    SHORTEST_TIME;

    public String value() {
        return name();
    }

    public static COMPUTEMETHOD fromValue(String v) {
        return valueOf(v);
    }

}
