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
 *         &lt;element ref="{}servicenodes"/&gt;
 *         &lt;element ref="{}servicelegs"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="networkref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="servicenetworklayerref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "servicenodes",
    "servicelegs"
})
@XmlRootElement(name = "servicenetworklayer")
public class Servicenetworklayer {

    @XmlElement(required = true)
    protected Servicenodes servicenodes;
    @XmlElement(required = true)
    protected Servicelegs servicelegs;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "networkref", required = true)
    protected String networkref;
    @XmlAttribute(name = "servicenetworklayerref", required = true)
    protected String servicenetworklayerref;

    /**
     * Gets the value of the servicenodes property.
     * 
     * @return
     *     possible object is
     *     {@link Servicenodes }
     *     
     */
    public Servicenodes getServicenodes() {
        return servicenodes;
    }

    /**
     * Sets the value of the servicenodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicenodes }
     *     
     */
    public void setServicenodes(Servicenodes value) {
        this.servicenodes = value;
    }

    /**
     * Gets the value of the servicelegs property.
     * 
     * @return
     *     possible object is
     *     {@link Servicelegs }
     *     
     */
    public Servicelegs getServicelegs() {
        return servicelegs;
    }

    /**
     * Sets the value of the servicelegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicelegs }
     *     
     */
    public void setServicelegs(Servicelegs value) {
        this.servicelegs = value;
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
     * Gets the value of the networkref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkref() {
        return networkref;
    }

    /**
     * Sets the value of the networkref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkref(String value) {
        this.networkref = value;
    }

    /**
     * Gets the value of the servicenetworklayerref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicenetworklayerref() {
        return servicenetworklayerref;
    }

    /**
     * Sets the value of the servicenetworklayerref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicenetworklayerref(String value) {
        this.servicenetworklayerref = value;
    }

}
