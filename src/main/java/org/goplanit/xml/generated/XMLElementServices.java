
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
 * 				All routed services for a particular layer
 * 			
 * 
 * <p>Java class for services element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="services"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}service" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="moderef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "service"
})
@XmlRootElement(name = "services")
public class XMLElementServices
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementService> service;
    @XmlAttribute(name = "moderef", required = true)
    protected String moderef;

    /**
     * 
     * 							A single service for a particular mode. A
     * 							service can have multiple variants, i.e., slightly different
     * 							routes, within its service
     * 						Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementService }
     * 
     * 
     */
    public List<XMLElementService> getService() {
        if (service == null) {
            service = new ArrayList<XMLElementService>();
        }
        return this.service;
    }

    /**
     * Gets the value of the moderef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeref() {
        return moderef;
    }

    /**
     * Sets the value of the moderef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeref(String value) {
        this.moderef = value;
    }

}
