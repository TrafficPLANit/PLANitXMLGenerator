//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Mode specific attributes associated with
 * 				the link segment type are the maximum and critical speed.
 * 				If a mode is not defined on the link segment type it is
 * 				assumed the mode is not allowed on the link segment.
 * 			
 * 
 * <p>Java class for accessmode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessmode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}maxspeed" minOccurs="0"/&gt;
 *         &lt;element ref="{}critspeed" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessmode", propOrder = {
    "maxspeed",
    "critspeed"
})
public class Accessmode {

    @XmlElement(defaultValue = "80.0")
    protected Double maxspeed;
    protected Double critspeed;
    @XmlAttribute(name = "ref")
    protected String ref;

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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
