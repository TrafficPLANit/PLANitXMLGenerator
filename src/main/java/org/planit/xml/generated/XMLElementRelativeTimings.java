//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains the schedule for a routed service variant
 * 			
 * 
 * <p>Java class for reltimings element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="reltimings"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="defaultstartoffset" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *           &lt;element name="leg" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *                     &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "defaultstartoffset",
    "leg"
})
@XmlRootElement(name = "reltimings")
public class XMLElementRelativeTimings {

    @XmlElement(defaultValue = "00:00:00")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar defaultstartoffset;
    protected List<XMLElementRelativeTimings.Leg> leg;

    /**
     * Gets the value of the defaultstartoffset property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefaultstartoffset() {
        return defaultstartoffset;
    }

    /**
     * Sets the value of the defaultstartoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefaultstartoffset(XMLGregorianCalendar value) {
        this.defaultstartoffset = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementRelativeTimings.Leg }
     * 
     * 
     */
    public List<XMLElementRelativeTimings.Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<XMLElementRelativeTimings.Leg>();
        }
        return this.leg;
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
     *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
     *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "start",
        "end"
    })
    public static class Leg {

        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar start;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar end;
        @XmlAttribute(name = "ref", required = true)
        protected String ref;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

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

    }

}
