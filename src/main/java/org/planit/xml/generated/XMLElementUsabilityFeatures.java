//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Usability features of a mode.        
 *       
 * 
 * <p>Java class for usabilityfeatures element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="usabilityfeatures"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="usedtotype" type="{}usedToType"/&gt;
 *         &lt;/sequence&gt;
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
    "usedtotype"
})
@XmlRootElement(name = "usabilityfeatures")
public class XMLElementUsabilityFeatures {

    @XmlElement(required = true, defaultValue = "private")
    @XmlSchemaType(name = "string")
    protected UsedToType usedtotype;

    /**
     * Gets the value of the usedtotype property.
     * 
     * @return
     *     possible object is
     *     {@link UsedToType }
     *     
     */
    public UsedToType getUsedtotype() {
        return usedtotype;
    }

    /**
     * Sets the value of the usedtotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsedToType }
     *     
     */
    public void setUsedtotype(UsedToType value) {
        this.usedtotype = value;
    }

}
