
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The macroscopic demand, i.e., in traffic flows not
 * 				discrete vehicles, for the project at hand per mode per time period,
 * 				per od
 * 			
 * 
 * <p>Java class for macroscopicdemand element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="macroscopicdemand"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}demandconfiguration"/&gt;
 *           &lt;element ref="{}oddemands"/&gt;
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
    "id",
    "demandconfiguration",
    "oddemands"
})
@XmlRootElement(name = "macroscopicdemand")
public class XMLElementMacroscopicDemand
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected XMLElementDemandConfiguration demandconfiguration;
    @XmlElement(required = true)
    protected XMLElementOdDemands oddemands;

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
     * 
     * 							Configuration of the demands, specifically, user
     * 							classes and time periods
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementDemandConfiguration }
     *     
     */
    public XMLElementDemandConfiguration getDemandconfiguration() {
        return demandconfiguration;
    }

    /**
     * Sets the value of the demandconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementDemandConfiguration }
     *     
     */
    public void setDemandconfiguration(XMLElementDemandConfiguration value) {
        this.demandconfiguration = value;
    }

    /**
     * Gets the value of the oddemands property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementOdDemands }
     *     
     */
    public XMLElementOdDemands getOddemands() {
        return oddemands;
    }

    /**
     * Sets the value of the oddemands property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementOdDemands }
     *     
     */
    public void setOddemands(XMLElementOdDemands value) {
        this.oddemands = value;
    }

}
