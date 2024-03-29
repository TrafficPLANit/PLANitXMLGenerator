
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linksegment element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="linksegment"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}numberoflanes" minOccurs="0"/&gt;
 *           &lt;element ref="{}maxspeed" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="dir" use="required" type="{}direction" /&gt;
 *         &lt;attribute name="typeref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "numberoflanes",
    "maxspeed"
})
@XmlRootElement(name = "linksegment")
public class XMLElementLinkSegment
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberoflanes;
    @XmlElement(defaultValue = "80.0")
    protected Double maxspeed;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "dir", required = true)
    protected Direction dir;
    @XmlAttribute(name = "typeref")
    protected String typeref;

    /**
     * Gets the value of the numberoflanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberoflanes() {
        return numberoflanes;
    }

    /**
     * Sets the value of the numberoflanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberoflanes(BigInteger value) {
        this.numberoflanes = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalid() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalid(String value) {
        this.externalid = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDir(Direction value) {
        this.dir = value;
    }

    /**
     * Gets the value of the typeref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyperef() {
        return typeref;
    }

    /**
     * Sets the value of the typeref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyperef(String value) {
        this.typeref = value;
    }

}
