
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Instance of a routed service defining the route,
 * 				schedule/frequency and other related attributes
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
 *           &lt;element name="schedule"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{}departures"/&gt;
 *                     &lt;element ref="{}reltimings"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="frequency"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *                   &lt;attribute name="unit" type="{}timeUnit" default="h" /&gt;
 *                   &lt;attribute name="lsrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "schedule",
    "frequency"
})
@XmlRootElement(name = "trip")
public class XMLElementRoutedTrip
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected XMLElementRoutedTrip.Schedule schedule;
    @XmlElement(defaultValue = "-1")
    protected XMLElementRoutedTrip.Frequency frequency;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementRoutedTrip.Schedule }
     *     
     */
    public XMLElementRoutedTrip.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementRoutedTrip.Schedule }
     *     
     */
    public void setSchedule(XMLElementRoutedTrip.Schedule value) {
        this.schedule = value;
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
     *       &lt;attribute name="lsrefs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class Frequency
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected float value;
        @XmlAttribute(name = "unit")
        protected TimeUnit unit;
        @XmlAttribute(name = "lsrefs", required = true)
        protected String lsrefs;

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
     *         &lt;element ref="{}departures"/&gt;
     *         &lt;element ref="{}reltimings"/&gt;
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
        "departures",
        "reltimings"
    })
    public static class Schedule
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected XMLElementDepartures departures;
        @XmlElement(required = true)
        protected XMLElementRelativeTimings reltimings;

        /**
         * 
         * 										Contains all absolute departure times for this schedule
         * 									
         * 
         * @return
         *     possible object is
         *     {@link XMLElementDepartures }
         *     
         */
        public XMLElementDepartures getDepartures() {
            return departures;
        }

        /**
         * Sets the value of the departures property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementDepartures }
         *     
         */
        public void setDepartures(XMLElementDepartures value) {
            this.departures = value;
        }

        /**
         * 
         * 										Contains all leg (segment) travel times which combined with the
         * 										absolute departure times can be used
         * 										to construct the (idealised) travel time of the trip
         * 									
         * 
         * @return
         *     possible object is
         *     {@link XMLElementRelativeTimings }
         *     
         */
        public XMLElementRelativeTimings getReltimings() {
            return reltimings;
        }

        /**
         * Sets the value of the reltimings property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementRelativeTimings }
         *     
         */
        public void setReltimings(XMLElementRelativeTimings value) {
            this.reltimings = value;
        }

    }

}
