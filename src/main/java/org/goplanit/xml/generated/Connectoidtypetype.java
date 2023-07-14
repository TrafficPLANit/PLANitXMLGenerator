
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectoidtypetype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="connectoidtypetype"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="pt_veh_stop"/&gt;
 *     &lt;enumeration value="traveller_access"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "connectoidtypetype")
@XmlEnum
public enum Connectoidtypetype {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("pt_veh_stop")
    PT_VEH_STOP("pt_veh_stop"),
    @XmlEnumValue("traveller_access")
    TRAVELLER_ACCESS("traveller_access"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    Connectoidtypetype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Connectoidtypetype fromValue(String v) {
        for (Connectoidtypetype c: Connectoidtypetype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
