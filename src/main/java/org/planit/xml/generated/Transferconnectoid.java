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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferconnectoid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferconnectoid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}connectoidtype"&gt;
 *       &lt;attribute name="tzrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lsref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferconnectoid")
public class Transferconnectoid
    extends Connectoidtype
{

    @XmlAttribute(name = "tzrefs", required = true)
    protected String tzrefs;
    @XmlAttribute(name = "lsref", required = true)
    protected String lsref;

    /**
     * Gets the value of the tzrefs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzrefs() {
        return tzrefs;
    }

    /**
     * Sets the value of the tzrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzrefs(String value) {
        this.tzrefs = value;
    }

    /**
     * Gets the value of the lsref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsref() {
        return lsref;
    }

    /**
     * Sets the value of the lsref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsref(String value) {
        this.lsref = value;
    }

}
