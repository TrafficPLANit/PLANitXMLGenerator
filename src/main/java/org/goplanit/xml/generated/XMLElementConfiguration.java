
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Configuration, i.e., meta data of the network
 * 				infrastructure
 * 			
 * 
 * <p>Java class for configuration element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="configuration"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}modes" minOccurs="0"/&gt;
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
    "modes"
})
@XmlRootElement(name = "configuration")
public class XMLElementConfiguration {

    protected XMLElementModes modes;

    /**
     * 
     * 							Modes available in this project. Note that when
     * 							this element is absent a single default mode is created to
     * 							represent all modes. If this is the case, no references to modes
     * 							are to be
     * 							made in any forthcoming elements as there is nothing to
     * 							refer
     * 							to, i.e., no ids of modes are present so they cannot be
     * 							referred.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementModes }
     *     
     */
    public XMLElementModes getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementModes }
     *     
     */
    public void setModes(XMLElementModes value) {
        this.modes = value;
    }

}
