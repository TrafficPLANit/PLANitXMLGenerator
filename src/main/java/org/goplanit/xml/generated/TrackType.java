
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trackType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="trackType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "trackType")
@XmlEnum
public enum TrackType {

    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("water")
    WATER("water");
    private final String value;

    TrackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackType fromValue(String v) {
        for (TrackType c: TrackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
