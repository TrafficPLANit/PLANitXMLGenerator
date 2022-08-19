
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odconnectoid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odconnectoid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}connectoidtype"&gt;
 *       &lt;attribute name="noderef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odconnectoid")
public class Odconnectoid
    extends Connectoidtype
{

    @XmlAttribute(name = "noderef", required = true)
    protected String noderef;

    /**
     * Gets the value of the noderef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoderef() {
        return noderef;
    }

    /**
     * Sets the value of the noderef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoderef(String value) {
        this.noderef = value;
    }

}