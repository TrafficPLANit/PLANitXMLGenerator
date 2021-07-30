//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package org.planit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the schedule for a routed service trip
 * 			
 * 
 * <p>Java class for scheduledefinition element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="scheduledefinition"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}departures"/&gt;
 *           &lt;element ref="{}reltimings"/&gt;
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
    "departures",
    "reltimings"
})
@XmlRootElement(name = "scheduledefinition")
public class XMLElementSchedule {

    @XmlElement(required = true)
    protected XMLElementDepartures departures;
    @XmlElement(required = true)
    protected XMLElementRelativeTimings reltimings;

    /**
     * 
     * 							Contains all absolute departure times for this schedule
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
     * 							Contains all leg travel times which combined with the absolute departure times can be used
     * 							to construct the (idealised) travel time of the trip 
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
