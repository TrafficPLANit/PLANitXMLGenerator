
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Length can be used to override geometric length computed for connectoid based on zone and physical
 * 				network (layer) connection.
 * 				When multiple zones are accessible each one gets its own access zone element
 * 			
 * 
 * <p>Java class for connectoidtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectoidtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accesszone" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="lengthkm" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="noderef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="lsrefs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="modes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{}connectoidtypetype" default="none" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectoidtype", propOrder = {
    "accesszone"
})
@XmlSeeAlso({
    org.goplanit.xml.generated.XMLElementTransferZoneAccess.XMLElementTransferConnectoid.class,
    XMLElementConnectoid.class
})
public class Connectoidtype
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<Connectoidtype.Accesszone> accesszone;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type")
    protected Connectoidtypetype type;

    /**
     * Gets the value of the accesszone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accesszone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccesszone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connectoidtype.Accesszone }
     * 
     * 
     */
    public List<Connectoidtype.Accesszone> getAccesszone() {
        if (accesszone == null) {
            accesszone = new ArrayList<Connectoidtype.Accesszone>();
        }
        return this.accesszone;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Connectoidtypetype }
     *     
     */
    public Connectoidtypetype getType() {
        if (type == null) {
            return Connectoidtypetype.NONE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connectoidtypetype }
     *     
     */
    public void setType(Connectoidtypetype value) {
        this.type = value;
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
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="lengthkm" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="noderef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="lsrefs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="modes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Accesszone
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "ref", required = true)
        protected String ref;
        @XmlAttribute(name = "lengthkm")
        protected BigDecimal lengthkm;
        @XmlAttribute(name = "noderef", required = true)
        protected String noderef;
        @XmlAttribute(name = "lsrefs")
        protected String lsrefs;
        @XmlAttribute(name = "modes")
        protected String modes;

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

        /**
         * Gets the value of the lengthkm property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLengthkm() {
            return lengthkm;
        }

        /**
         * Sets the value of the lengthkm property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLengthkm(BigDecimal value) {
            this.lengthkm = value;
        }

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

        /**
         * Gets the value of the modes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModes() {
            return modes;
        }

        /**
         * Sets the value of the modes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModes(String value) {
            this.modes = value;
        }

    }

}
