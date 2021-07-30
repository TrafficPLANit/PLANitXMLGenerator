//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Instance of a routed service defining the route, schedule/frequency and other related attributes
 * 			
 * 
 * <p>Java class for trip element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="trip"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}scheduledefinition"/&gt;
 *           &lt;element name="frequency"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *                   &lt;attribute name="unit" type="{}timeUnit" default="h" /&gt;
 *                   &lt;attribute name="legrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
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
    "scheduledefinition",
    "frequency"
})
@XmlRootElement(name = "trip")
public class XMLElementRoutedTrip {

    protected XMLElementSchedule scheduledefinition;
    @XmlElement(defaultValue = "-1")
    protected XMLElementRoutedTrip.Frequency frequency;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;

    /**
     * 
     * 							A scheduled variant
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementSchedule }
     *     
     */
    public XMLElementSchedule getScheduledefinition() {
        return scheduledefinition;
    }

    /**
     * Sets the value of the scheduledefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementSchedule }
     *     
     */
    public void setScheduledefinition(XMLElementSchedule value) {
        this.scheduledefinition = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementRoutedTrip.Frequency }
     *     
     */
    public XMLElementRoutedTrip.Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementRoutedTrip.Frequency }
     *     
     */
    public void setFrequency(XMLElementRoutedTrip.Frequency value) {
        this.frequency = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
     *       &lt;attribute name="unit" type="{}timeUnit" default="h" /&gt;
     *       &lt;attribute name="legrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Frequency {

        @XmlValue
        protected float value;
        @XmlAttribute(name = "unit")
        protected TimeUnit unit;
        @XmlAttribute(name = "legrefs", required = true)
        protected String legrefs;

        /**
         * Gets the value of the value property.
         * 
         */
        public float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(float value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnit }
         *     
         */
        public TimeUnit getUnit() {
            if (unit == null) {
                return TimeUnit.H;
            } else {
                return unit;
            }
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnit }
         *     
         */
        public void setUnit(TimeUnit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the legrefs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegrefs() {
            return legrefs;
        }

        /**
         * Sets the value of the legrefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegrefs(String value) {
            this.legrefs = value;
        }

    }

}
