
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lengthUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="lengthUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="km"/&gt;
 *     &lt;enumeration value="m"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "lengthUnit")
@XmlEnum
public enum LengthUnit {

    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("m")
    M("m");
    private final String value;

    LengthUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnit fromValue(String v) {
        for (LengthUnit c: LengthUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
