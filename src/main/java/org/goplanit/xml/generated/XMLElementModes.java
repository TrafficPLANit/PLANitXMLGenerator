
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
 * 				The modes of transport used by travelers.
 * 			
 * 
 * <p>Java class for modes element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="modes"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="mode" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element ref="{}maxspeed" minOccurs="0"/&gt;
 *                     &lt;element ref="{}pcu" minOccurs="0"/&gt;
 *                     &lt;element ref="{}physicalfeatures" minOccurs="0"/&gt;
 *                     &lt;element ref="{}usabilityfeatures" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="predefined" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "mode"
})
@XmlRootElement(name = "modes")
public class XMLElementModes
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementModes.Mode> mode;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementModes.Mode }
     * 
     * 
     */
    public List<XMLElementModes.Mode> getMode() {
        if (mode == null) {
            mode = new ArrayList<XMLElementModes.Mode>();
        }
        return this.mode;
    }


    /**
     * 
     * 								Each mode can have a description(name) and pcu
     * 								value besides their unique identifier (id).
     * 								When no name is
     * 								given, the description is absent. When no pcu value
     * 								is defined
     * 								the default is adopted. When a predefined PLANit mode is used
     * 								this is indicated with attribute predefined. For predefined
     * 								modes all features
     * 								are defined by defaults and therefore
     * 								sub-elements need not be specified, if they are
     * 								they are ignored.
     * 								When the predefines attribute is missing, it is inferred from
     * 								the name. Note however
     * 								that if you use a custom mode with a
     * 								predefined name, PLANit will then populate the mode with the
     * 								predefined
     * 								defaults instead of the specified ones.
     * 							
     * 
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
     *         &lt;element ref="{}maxspeed" minOccurs="0"/&gt;
     *         &lt;element ref="{}pcu" minOccurs="0"/&gt;
     *         &lt;element ref="{}physicalfeatures" minOccurs="0"/&gt;
     *         &lt;element ref="{}usabilityfeatures" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="predefined" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "maxspeed",
        "pcu",
        "physicalfeatures",
        "usabilityfeatures"
    })
    public static class Mode
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        protected String name;
        @XmlElement(defaultValue = "80.0")
        protected Double maxspeed;
        @XmlElement(defaultValue = "1")
        protected Double pcu;
        protected XMLElementPhysicalFeatures physicalfeatures;
        protected XMLElementUsabilityFeatures usabilityfeatures;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "externalid")
        protected String externalid;
        @XmlAttribute(name = "predefined")
        protected Boolean predefined;

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
         * Gets the value of the maxspeed property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMaxspeed() {
            return maxspeed;
        }

        /**
         * Sets the value of the maxspeed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMaxspeed(Double value) {
            this.maxspeed = value;
        }

        /**
         * Gets the value of the pcu property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getPcu() {
            return pcu;
        }

        /**
         * Sets the value of the pcu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPcu(Double value) {
            this.pcu = value;
        }

        /**
         * Gets the value of the physicalfeatures property.
         * 
         * @return
         *     possible object is
         *     {@link XMLElementPhysicalFeatures }
         *     
         */
        public XMLElementPhysicalFeatures getPhysicalfeatures() {
            return physicalfeatures;
        }

        /**
         * Sets the value of the physicalfeatures property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementPhysicalFeatures }
         *     
         */
        public void setPhysicalfeatures(XMLElementPhysicalFeatures value) {
            this.physicalfeatures = value;
        }

        /**
         * Gets the value of the usabilityfeatures property.
         * 
         * @return
         *     possible object is
         *     {@link XMLElementUsabilityFeatures }
         *     
         */
        public XMLElementUsabilityFeatures getUsabilityfeatures() {
            return usabilityfeatures;
        }

        /**
         * Sets the value of the usabilityfeatures property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementUsabilityFeatures }
         *     
         */
        public void setUsabilityfeatures(XMLElementUsabilityFeatures value) {
            this.usabilityfeatures = value;
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
         * Gets the value of the predefined property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPredefined() {
            if (predefined == null) {
                return false;
            } else {
                return predefined;
            }
        }

        /**
         * Sets the value of the predefined property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPredefined(Boolean value) {
            this.predefined = value;
        }

    }

}
