
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLANit element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="PLANit"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;all&gt;
 *           &lt;element ref="{}macroscopicnetwork"/&gt;
 *           &lt;element ref="{}macroscopicdemand"/&gt;
 *           &lt;element ref="{}macroscopiczoning"/&gt;
 *           &lt;element ref="{}servicenetwork" minOccurs="0"/&gt;
 *           &lt;element ref="{}routedservices" minOccurs="0"/&gt;
 *         &lt;/all&gt;
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

})
@XmlRootElement(name = "PLANit")
public class XMLElementPLANit {

    @XmlElement(required = true)
    protected XMLElementMacroscopicNetwork macroscopicnetwork;
    @XmlElement(required = true)
    protected XMLElementMacroscopicDemand macroscopicdemand;
    @XmlElement(required = true)
    protected XMLElementMacroscopicZoning macroscopiczoning;
    protected XMLElementServiceNetwork servicenetwork;
    protected XMLElementRoutedServices routedservices;

    /**
     * Gets the value of the macroscopicnetwork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementMacroscopicNetwork }
     *     
     */
    public XMLElementMacroscopicNetwork getMacroscopicnetwork() {
        return macroscopicnetwork;
    }

    /**
     * Sets the value of the macroscopicnetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementMacroscopicNetwork }
     *     
     */
    public void setMacroscopicnetwork(XMLElementMacroscopicNetwork value) {
        this.macroscopicnetwork = value;
    }

    /**
     * Gets the value of the macroscopicdemand property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementMacroscopicDemand }
     *     
     */
    public XMLElementMacroscopicDemand getMacroscopicdemand() {
        return macroscopicdemand;
    }

    /**
     * Sets the value of the macroscopicdemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementMacroscopicDemand }
     *     
     */
    public void setMacroscopicdemand(XMLElementMacroscopicDemand value) {
        this.macroscopicdemand = value;
    }

    /**
     * Gets the value of the macroscopiczoning property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementMacroscopicZoning }
     *     
     */
    public XMLElementMacroscopicZoning getMacroscopiczoning() {
        return macroscopiczoning;
    }

    /**
     * Sets the value of the macroscopiczoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementMacroscopicZoning }
     *     
     */
    public void setMacroscopiczoning(XMLElementMacroscopicZoning value) {
        this.macroscopiczoning = value;
    }

    /**
     * Gets the value of the servicenetwork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementServiceNetwork }
     *     
     */
    public XMLElementServiceNetwork getServicenetwork() {
        return servicenetwork;
    }

    /**
     * Sets the value of the servicenetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementServiceNetwork }
     *     
     */
    public void setServicenetwork(XMLElementServiceNetwork value) {
        this.servicenetwork = value;
    }

    /**
     * Gets the value of the routedservices property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementRoutedServices }
     *     
     */
    public XMLElementRoutedServices getRoutedservices() {
        return routedservices;
    }

    /**
     * Sets the value of the routedservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementRoutedServices }
     *     
     */
    public void setRoutedservices(XMLElementRoutedServices value) {
        this.routedservices = value;
    }

}
