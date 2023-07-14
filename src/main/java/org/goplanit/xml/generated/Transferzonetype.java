
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferzonetype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="transferzonetype"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="platform"/&gt;
 *     &lt;enumeration value="stop_pole"/&gt;
 *     &lt;enumeration value="small_station"/&gt;
 *     &lt;enumeration value="station"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transferzonetype")
@XmlEnum
public enum Transferzonetype {

    @XmlEnumValue("platform")
    PLATFORM("platform"),
    @XmlEnumValue("stop_pole")
    STOP_POLE("stop_pole"),
    @XmlEnumValue("small_station")
    SMALL_STATION("small_station"),
    @XmlEnumValue("station")
    STATION("station"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    Transferzonetype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Transferzonetype fromValue(String v) {
        for (Transferzonetype c: Transferzonetype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
