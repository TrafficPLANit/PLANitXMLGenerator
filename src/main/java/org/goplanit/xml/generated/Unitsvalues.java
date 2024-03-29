
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitsvalues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="unitsvalues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="veh/km"/&gt;
 *     &lt;enumeration value="pcu/km"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="veh/h"/&gt;
 *     &lt;enumeration value="pcu/h"/&gt;
 *     &lt;enumeration value="km/h"/&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="km"/&gt;
 *     &lt;enumeration value="srs"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "unitsvalues")
@XmlEnum
public enum Unitsvalues {

    @XmlEnumValue("veh/km")
    VEH_KM("veh/km"),
    @XmlEnumValue("pcu/km")
    PCU_KM("pcu/km"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("veh/h")
    VEH_H("veh/h"),
    @XmlEnumValue("pcu/h")
    PCU_H("pcu/h"),
    @XmlEnumValue("km/h")
    KM_H("km/h"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("srs")
    SRS("srs");
    private final String value;

    Unitsvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Unitsvalues fromValue(String v) {
        for (Unitsvalues c: Unitsvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
