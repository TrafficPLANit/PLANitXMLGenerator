
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Each "regular" OD connectoid represents a potential point of exit/entry from/to the physical
 * 				network coming from the zone/centroid. There
 * 				must be at minimum one connectoid to be able to leave/enter the zone. Each regular connectoid
 * 				attaches by means of a node XML id reference. we reuse connectoid type but since it is inverted and
 * 				zone already known we do not have access zone entries here, instead we supplement with a single length
 * 				element and modes. this is to be changed in future
 * 			
 * 
 * <p>Java class for connectoid element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="connectoid"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;extension base="{}connectoidtype"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="modes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;/extension&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "length"
})
@XmlRootElement(name = "connectoid")
public class XMLElementConnectoid
    extends Connectoidtype
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected BigDecimal length;
    @XmlAttribute(name = "modes")
    protected String modes;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the modes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModes(String value) {
        this.modes = value;
    }

}
