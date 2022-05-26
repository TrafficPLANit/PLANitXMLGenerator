
package org.goplanit.xml.generated;

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
 * 				Provide how each access point can access one or more transfer zones
 * 			
 * 
 * <p>Java class for transferzoneaccess element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="transferzoneaccess"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="connectoid" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{}connectoidtype"&gt;
 *                   &lt;attribute name="tzrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="lsref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="loc" type="{}connectoidnodelocationtype" default="downstream" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
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
    "connectoid"
})
@XmlRootElement(name = "transferzoneaccess")
public class XMLElementTransferZoneAccess {

    @XmlElement(required = true)
    protected List<XMLElementTransferZoneAccess.XMLElementTransferConnectoid> connectoid;

    /**
     * Gets the value of the connectoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementTransferZoneAccess.XMLElementTransferConnectoid }
     * 
     * 
     */
    public List<XMLElementTransferZoneAccess.XMLElementTransferConnectoid> getConnectoid() {
        if (connectoid == null) {
            connectoid = new ArrayList<XMLElementTransferZoneAccess.XMLElementTransferConnectoid>();
        }
        return this.connectoid;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}connectoidtype"&gt;
     *       &lt;attribute name="tzrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="lsref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="loc" type="{}connectoidnodelocationtype" default="downstream" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMLElementTransferConnectoid
        extends Connectoidtype
    {

        @XmlAttribute(name = "tzrefs", required = true)
        protected String tzrefs;
        @XmlAttribute(name = "lsref", required = true)
        protected String lsref;
        @XmlAttribute(name = "loc")
        protected Connectoidnodelocationtype loc;

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

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link Connectoidnodelocationtype }
         *     
         */
        public Connectoidnodelocationtype getLoc() {
            if (loc == null) {
                return Connectoidnodelocationtype.DOWNSTREAM;
            } else {
                return loc;
            }
        }

        /**
         * Sets the value of the loc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Connectoidnodelocationtype }
         *     
         */
        public void setLoc(Connectoidnodelocationtype value) {
            this.loc = value;
        }

    }

}
