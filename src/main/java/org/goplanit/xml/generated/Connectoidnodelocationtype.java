
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectoidnodelocationtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectoidnodelocationtype"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="upstream"/&gt;
 *     &lt;enumeration value="downstream"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "connectoidnodelocationtype")
@XmlEnum
public enum Connectoidnodelocationtype {

    @XmlEnumValue("upstream")
    UPSTREAM("upstream"),
    @XmlEnumValue("downstream")
    DOWNSTREAM("downstream");
    private final String value;

    Connectoidnodelocationtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Connectoidnodelocationtype fromValue(String v) {
        for (Connectoidnodelocationtype c: Connectoidnodelocationtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
