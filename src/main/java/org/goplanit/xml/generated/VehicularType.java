
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicularType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicularType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="vehicle"/&gt;
 *     &lt;enumeration value="no_vehicle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "vehicularType")
@XmlEnum
public enum VehicularType {

    @XmlEnumValue("vehicle")
    VEHICLE("vehicle"),
    @XmlEnumValue("no_vehicle")
    NO_VEHICLE("no_vehicle");
    private final String value;

    VehicularType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicularType fromValue(String v) {
        for (VehicularType c: VehicularType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
