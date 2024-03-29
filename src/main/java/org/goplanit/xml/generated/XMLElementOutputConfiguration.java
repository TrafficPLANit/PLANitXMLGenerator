
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputconfiguration element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="outputconfiguration"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}assignment"/&gt;
 *           &lt;element ref="{}physicalcost"/&gt;
 *           &lt;element ref="{}virtualcost"/&gt;
 *           &lt;element ref="{}smoothing"/&gt;
 *           &lt;element ref="{}gapfunction"/&gt;
 *           &lt;element ref="{}stopcriterion"/&gt;
 *           &lt;element ref="{}timeperiod"/&gt;
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
    "assignment",
    "physicalcost",
    "virtualcost",
    "smoothing",
    "gapfunction",
    "stopcriterion",
    "timeperiod"
})
@XmlRootElement(name = "outputconfiguration")
public class XMLElementOutputConfiguration
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String assignment;
    @XmlElement(required = true)
    protected String physicalcost;
    @XmlElement(required = true)
    protected String virtualcost;
    @XmlElement(required = true)
    protected String smoothing;
    @XmlElement(required = true)
    protected String gapfunction;
    @XmlElement(required = true)
    protected String stopcriterion;
    @XmlElement(required = true)
    protected XMLElementOutputTimePeriod timeperiod;

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignment(String value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the physicalcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalcost() {
        return physicalcost;
    }

    /**
     * Sets the value of the physicalcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalcost(String value) {
        this.physicalcost = value;
    }

    /**
     * Gets the value of the virtualcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualcost() {
        return virtualcost;
    }

    /**
     * Sets the value of the virtualcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualcost(String value) {
        this.virtualcost = value;
    }

    /**
     * Gets the value of the smoothing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmoothing() {
        return smoothing;
    }

    /**
     * Sets the value of the smoothing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmoothing(String value) {
        this.smoothing = value;
    }

    /**
     * Gets the value of the gapfunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGapfunction() {
        return gapfunction;
    }

    /**
     * Sets the value of the gapfunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGapfunction(String value) {
        this.gapfunction = value;
    }

    /**
     * Gets the value of the stopcriterion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopcriterion() {
        return stopcriterion;
    }

    /**
     * Sets the value of the stopcriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopcriterion(String value) {
        this.stopcriterion = value;
    }

    /**
     * Gets the value of the timeperiod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementOutputTimePeriod }
     *     
     */
    public XMLElementOutputTimePeriod getTimeperiod() {
        return timeperiod;
    }

    /**
     * Sets the value of the timeperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementOutputTimePeriod }
     *     
     */
    public void setTimeperiod(XMLElementOutputTimePeriod value) {
        this.timeperiod = value;
    }

}
