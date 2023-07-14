
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Define the link segment types maximum and critical speed for one or more modes.
 *       
 * 
 * <p>Java class for accessgroup element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="accessgroup"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}maxspeed" minOccurs="0"/&gt;
 *           &lt;element ref="{}critspeed" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="moderefs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxspeed",
    "critspeed"
})
@XmlRootElement(name = "accessgroup")
public class XMLElementAccessGroup
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(defaultValue = "80.0")
    protected Double maxspeed;
    protected Double critspeed;
    @XmlAttribute(name = "moderefs")
    protected String moderefs;

    /**
     * Gets the value of the maxspeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxspeed() {
        return maxspeed;
    }

    /**
     * Sets the value of the maxspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxspeed(Double value) {
        this.maxspeed = value;
    }

    /**
     * Gets the value of the critspeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCritspeed() {
        return critspeed;
    }

    /**
     * Sets the value of the critspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCritspeed(Double value) {
        this.critspeed = value;
    }

    /**
     * Gets the value of the moderefs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModerefs() {
        return moderefs;
    }

    /**
     * Sets the value of the moderefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModerefs(String value) {
        this.moderefs = value;
    }

}
