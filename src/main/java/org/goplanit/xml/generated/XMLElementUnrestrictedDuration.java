
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Duration give as a positive integer in some unit in
 * 				unrestricted from (no limitation on choice of integer)
 * 			
 * 
 * <p>Java class for unrestrictedduration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unrestrictedduration"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *       &lt;attribute name="unit" type="{}durationunit" default="s" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unrestrictedduration", propOrder = {
    "value"
})
@XmlSeeAlso({
    XMLElementDuration.class
})
public class XMLElementUnrestrictedDuration
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger value;
    @XmlAttribute(name = "unit")
    protected Durationunit unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Durationunit }
     *     
     */
    public Durationunit getUnit() {
        if (unit == null) {
            return Durationunit.S;
        } else {
            return unit;
        }
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Durationunit }
     *     
     */
    public void setUnit(Durationunit value) {
        this.unit = value;
    }

}
