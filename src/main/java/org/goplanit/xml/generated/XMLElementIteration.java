
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iteration element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="iteration"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}nr"/&gt;
 *           &lt;element ref="{}csvdata" maxOccurs="unbounded"/&gt;
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
    "nr",
    "csvdata"
})
@XmlRootElement(name = "iteration")
public class XMLElementIteration
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nr;
    @XmlElement(required = true)
    protected List<XMLElementCsvdata> csvdata;

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNr(BigInteger value) {
        this.nr = value;
    }

    /**
     * Gets the value of the csvdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csvdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsvdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementCsvdata }
     * 
     * 
     */
    public List<XMLElementCsvdata> getCsvdata() {
        if (csvdata == null) {
            csvdata = new ArrayList<XMLElementCsvdata>();
        }
        return this.csvdata;
    }

}
