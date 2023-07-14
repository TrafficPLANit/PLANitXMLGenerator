
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usedToType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="usedToType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="private"/&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="ride_share"/&gt;
 *     &lt;enumeration value="high_occupancy"/&gt;
 *     &lt;enumeration value="goods"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "usedToType")
@XmlEnum
public enum UsedToType {

    @XmlEnumValue("private")
    PRIVATE("private"),
    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("ride_share")
    RIDE_SHARE("ride_share"),
    @XmlEnumValue("high_occupancy")
    HIGH_OCCUPANCY("high_occupancy"),
    @XmlEnumValue("goods")
    GOODS("goods");
    private final String value;

    UsedToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsedToType fromValue(String v) {
        for (UsedToType c: UsedToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
