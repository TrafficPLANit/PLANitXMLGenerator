
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
 * 				A leg definition represents a (partial) route for a service in between two locations of interest, e.g., public transport stops 
 * 				for example. The node references are to the service node ids in this same service network
 * 			
 * 
 * <p>Java class for leg element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="leg"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="legsegment" maxOccurs="2"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="dir" use="required" type="{}direction" /&gt;
 *                   &lt;attribute name="lsrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="nodearef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="nodebref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "legsegment"
})
@XmlRootElement(name = "leg")
public class XMLElementServiceLeg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementServiceLeg.Legsegment> legsegment;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "nodearef", required = true)
    protected String nodearef;
    @XmlAttribute(name = "nodebref", required = true)
    protected String nodebref;

    /**
     * Gets the value of the legsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegsegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementServiceLeg.Legsegment }
     * 
     * 
     */
    public List<XMLElementServiceLeg.Legsegment> getLegsegment() {
        if (legsegment == null) {
            legsegment = new ArrayList<XMLElementServiceLeg.Legsegment>();
        }
        return this.legsegment;
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
     * Gets the value of the nodearef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodearef() {
        return nodearef;
    }

    /**
     * Sets the value of the nodearef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodearef(String value) {
        this.nodearef = value;
    }

    /**
     * Gets the value of the nodebref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodebref() {
        return nodebref;
    }

    /**
     * Sets the value of the nodebref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodebref(String value) {
        this.nodebref = value;
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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dir" use="required" type="{}direction" /&gt;
     *       &lt;attribute name="lsrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Legsegment
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "externalid")
        protected String externalid;
        @XmlAttribute(name = "dir", required = true)
        protected Direction dir;
        @XmlAttribute(name = "lsrefs", required = true)
        protected String lsrefs;

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
         * Gets the value of the lsrefs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLsrefs() {
            return lsrefs;
        }

        /**
         * Sets the value of the lsrefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLsrefs(String value) {
            this.lsrefs = value;
        }

    }

}
