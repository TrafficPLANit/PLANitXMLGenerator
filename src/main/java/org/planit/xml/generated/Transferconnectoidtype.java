//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferconnectoidtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transferconnectoidtype"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pt_veh_stop"/&gt;
 *     &lt;enumeration value="traveller_access"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transferconnectoidtype")
@XmlEnum
public enum Transferconnectoidtype {

    @XmlEnumValue("pt_veh_stop")
    PT_VEH_STOP("pt_veh_stop"),
    @XmlEnumValue("traveller_access")
    TRAVELLER_ACCESS("traveller_access");
    private final String value;

    Transferconnectoidtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Transferconnectoidtype fromValue(String v) {
        for (Transferconnectoidtype c: Transferconnectoidtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}