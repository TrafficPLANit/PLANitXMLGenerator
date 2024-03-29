
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Root element of the macroscopic network
 * 				infrastructure. Defines the physical road network and its properties
 * 			
 * 
 * <p>Java class for macroscopicnetwork element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="macroscopicnetwork"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}configuration" minOccurs="0"/&gt;
 *           &lt;element ref="{}infrastructurelayers"/&gt;
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
    "configuration",
    "infrastructurelayers"
})
@XmlRootElement(name = "macroscopicnetwork")
public class XMLElementMacroscopicNetwork
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String id;
    protected XMLElementConfiguration configuration;
    @XmlElement(required = true)
    protected XMLElementInfrastructureLayers infrastructurelayers;

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
     * 							When configuration is absent we assume a single
     * 							mode for the entire simulation
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementConfiguration }
     *     
     */
    public XMLElementConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementConfiguration }
     *     
     */
    public void setConfiguration(XMLElementConfiguration value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the infrastructurelayers property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementInfrastructureLayers }
     *     
     */
    public XMLElementInfrastructureLayers getInfrastructurelayers() {
        return infrastructurelayers;
    }

    /**
     * Sets the value of the infrastructurelayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementInfrastructureLayers }
     *     
     */
    public void setInfrastructurelayers(XMLElementInfrastructureLayers value) {
        this.infrastructurelayers = value;
    }

}
