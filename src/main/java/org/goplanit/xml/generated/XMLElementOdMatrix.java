
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odmatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odmatrix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}timeperiodref use="required""/&gt;
 *       &lt;attribute ref="{}userclassref"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odmatrix")
@XmlSeeAlso({
    XMLElementOdCellByCellMatrix.class,
    XMLElementOdRawMatrix.class,
    XMLElementOdRowMatrix.class
})
public class XMLElementOdMatrix implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "timeperiodref", required = true)
    protected String timeperiodref;
    @XmlAttribute(name = "userclassref")
    protected String userclassref;

    /**
     * Gets the value of the timeperiodref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeperiodref() {
        return timeperiodref;
    }

    /**
     * Sets the value of the timeperiodref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeperiodref(String value) {
        this.timeperiodref = value;
    }

    /**
     * Gets the value of the userclassref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserclassref() {
        return userclassref;
    }

    /**
     * Sets the value of the userclassref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserclassref(String value) {
        this.userclassref = value;
    }

}
