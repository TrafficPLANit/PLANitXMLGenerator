
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.goplanit.xml.bindings.TimeAdapter;


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
 *           &lt;element name="leg" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="lsref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="duration" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *                   &lt;attribute name="dwelltime" type="{http://www.w3.org/2001/XMLSchema}time" default="00:00:00" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="dwelltime" type="{http://www.w3.org/2001/XMLSchema}time" default="00:00:00" /&gt;
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
    "leg"
})
@XmlRootElement(name = "reltimings")
public class XMLElementRelativeTimings
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementRelativeTimings.Leg> leg;
    @XmlAttribute(name = "dwelltime")
    @XmlJavaTypeAdapter(TimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime dwelltime;

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
     * Gets the value of the dwelltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getDwelltime() {
        if (dwelltime == null) {
            return new TimeAdapter().unmarshal("00:00:00");
        } else {
            return dwelltime;
        }
    }

    /**
     * Sets the value of the dwelltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwelltime(LocalTime value) {
        this.dwelltime = value;
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
     *       &lt;attribute name="lsref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="duration" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
     *       &lt;attribute name="dwelltime" type="{http://www.w3.org/2001/XMLSchema}time" default="00:00:00" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Leg
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "lsref", required = true)
        protected String lsref;
        @XmlAttribute(name = "duration", required = true)
        @XmlJavaTypeAdapter(TimeAdapter.class)
        @XmlSchemaType(name = "time")
        protected LocalTime duration;
        @XmlAttribute(name = "dwelltime")
        @XmlJavaTypeAdapter(TimeAdapter.class)
        @XmlSchemaType(name = "time")
        protected LocalTime dwelltime;

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
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalTime getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(LocalTime value) {
            this.duration = value;
        }

        /**
         * Gets the value of the dwelltime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalTime getDwelltime() {
            if (dwelltime == null) {
                return new TimeAdapter().unmarshal("00:00:00");
            } else {
                return dwelltime;
            }
        }

        /**
         * Sets the value of the dwelltime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDwelltime(LocalTime value) {
            this.dwelltime = value;
        }

    }

}
