
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="direction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="a_b"/&gt;
 *     &lt;enumeration value="b_a"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "direction")
@XmlEnum
public enum Direction {

    @XmlEnumValue("a_b")
    A_B("a_b"),
    @XmlEnumValue("b_a")
    B_A("b_a");
    private final String value;

    Direction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Direction fromValue(String v) {
        for (Direction c: Direction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
