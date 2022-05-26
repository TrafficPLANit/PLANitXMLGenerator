
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	       A service network layer defines services on top of a physical network layer, but is a network in itself albeit that nodes refer
 *          to physical nodes and link(segment)s are represented as leg(segment)s which in turn represent one or more link(segments) in the underlying 
 *          physical network
 * 	    
 * 
 * <p>Java class for servicenetworklayer element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="servicenetworklayer"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}servicenodes"/&gt;
 *           &lt;element ref="{}servicelegs"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="parentlayerref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "servicenodes",
    "servicelegs"
})
@XmlRootElement(name = "servicenetworklayer")
public class XMLElementServiceNetworkLayer {

    @XmlElement(required = true)
    protected XMLElementServiceNodes servicenodes;
    @XmlElement(required = true)
    protected XMLElementServiceLegs servicelegs;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "parentlayerref", required = true)
    protected String parentlayerref;

    /**
     * Gets the value of the servicenodes property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementServiceNodes }
     *     
     */
    public XMLElementServiceNodes getServicenodes() {
        return servicenodes;
    }

    /**
     * Sets the value of the servicenodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementServiceNodes }
     *     
     */
    public void setServicenodes(XMLElementServiceNodes value) {
        this.servicenodes = value;
    }

    /**
     * Gets the value of the servicelegs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementServiceLegs }
     *     
     */
    public XMLElementServiceLegs getServicelegs() {
        return servicelegs;
    }

    /**
     * Sets the value of the servicelegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementServiceLegs }
     *     
     */
    public void setServicelegs(XMLElementServiceLegs value) {
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
     * Gets the value of the parentlayerref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentlayerref() {
        return parentlayerref;
    }

    /**
     * Sets the value of the parentlayerref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentlayerref(String value) {
        this.parentlayerref = value;
    }

}
