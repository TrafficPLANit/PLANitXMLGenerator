
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motorisationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="motorisationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="motorised"/&gt;
 *     &lt;enumeration value="non_motorised"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "motorisationType")
@XmlEnum
public enum MotorisationType {

    @XmlEnumValue("motorised")
    MOTORISED("motorised"),
    @XmlEnumValue("non_motorised")
    NON_MOTORISED("non_motorised");
    private final String value;

    MotorisationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MotorisationType fromValue(String v) {
        for (MotorisationType c: MotorisationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
