
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				a single link segment type with macroscopic model mode specific
 * 				properties
 * 			
 * 
 * <p>Java class for linksegmenttype element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="linksegmenttype"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}maxdensitylane" minOccurs="0"/&gt;
 *           &lt;element ref="{}capacitylane" minOccurs="0"/&gt;
 *           &lt;element name="access" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{}accessgroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "name",
    "maxdensitylane",
    "capacitylane",
    "access"
})
@XmlRootElement(name = "linksegmenttype")
public class XMLElementLinkSegmentType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true, defaultValue = "")
    protected String name;
    @XmlElement(defaultValue = "180.0")
    protected Double maxdensitylane;
    @XmlElement(defaultValue = "1800.0")
    protected Double capacitylane;
    protected XMLElementLinkSegmentType.Access access;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 
     * 							When not present, the default maximum density per lane will be applied
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxdensitylane() {
        return maxdensitylane;
    }

    /**
     * Sets the value of the maxdensitylane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxdensitylane(Double value) {
        this.maxdensitylane = value;
    }

    /**
     * 
     * 							When not present, the default capacity per lane will be applied, unless the applied assignment can
     * 							create a more accurate estimate of the capacity based on its fundamental diagram definition and available free speed
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapacitylane() {
        return capacitylane;
    }

    /**
     * Sets the value of the capacitylane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapacitylane(Double value) {
        this.capacitylane = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementLinkSegmentType.Access }
     *     
     */
    public XMLElementLinkSegmentType.Access getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementLinkSegmentType.Access }
     *     
     */
    public void setAccess(XMLElementLinkSegmentType.Access value) {
        this.access = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}accessgroup" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessgroup"
    })
    public static class Access
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        protected List<XMLElementAccessGroup> accessgroup;

        /**
         * Gets the value of the accessgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accessgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessgroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLElementAccessGroup }
         * 
         * 
         */
        public List<XMLElementAccessGroup> getAccessgroup() {
            if (accessgroup == null) {
                accessgroup = new ArrayList<XMLElementAccessGroup>();
            }
            return this.accessgroup;
        }

    }

}
