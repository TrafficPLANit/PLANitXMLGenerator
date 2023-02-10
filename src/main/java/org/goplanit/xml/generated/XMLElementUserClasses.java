
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
 * <p>Java class for userclasses element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="userclasses"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="userclass" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="moderef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="travellertyperef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
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
    "userclass"
})
@XmlRootElement(name = "userclasses")
public class XMLElementUserClasses
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementUserClasses.Userclass> userclass;

    /**
     * Gets the value of the userclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementUserClasses.Userclass }
     * 
     * 
     */
    public List<XMLElementUserClasses.Userclass> getUserclass() {
        if (userclass == null) {
            userclass = new ArrayList<XMLElementUserClasses.Userclass>();
        }
        return this.userclass;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="moderef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="travellertyperef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Userclass
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        protected String name;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "externalid")
        protected String externalid;
        @XmlAttribute(name = "moderef")
        protected String moderef;
        @XmlAttribute(name = "travellertyperef")
        protected String travellertyperef;

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
         * Gets the value of the moderef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModeref() {
            return moderef;
        }

        /**
         * Sets the value of the moderef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModeref(String value) {
            this.moderef = value;
        }

        /**
         * Gets the value of the travellertyperef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravellertyperef() {
            return travellertyperef;
        }

        /**
         * Sets the value of the travellertyperef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravellertyperef(String value) {
            this.travellertyperef = value;
        }

    }

}
