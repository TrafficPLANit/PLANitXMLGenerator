
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for durationunit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="durationunit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="m"/&gt;
 *     &lt;enumeration value="s"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "durationunit")
@XmlEnum
public enum Durationunit {

    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("m")
    M("m"),
    @XmlEnumValue("s")
    S("s");
    private final String value;

    Durationunit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Durationunit fromValue(String v) {
        for (Durationunit c: Durationunit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
