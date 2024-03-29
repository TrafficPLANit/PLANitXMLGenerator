
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Definition for a single routed service for a
 * 				particular mode
 * 			
 * 
 * <p>Java class for service element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="service"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="namedescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="servicedescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="circular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element ref="{}trips"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "name",
    "namedescription",
    "servicedescription",
    "circular",
    "trips"
})
@XmlRootElement(name = "service")
public class XMLElementService
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String name;
    protected String namedescription;
    protected String servicedescription;
    @XmlElement(defaultValue = "false")
    protected Boolean circular;
    @XmlElement(required = true)
    protected XMLElementRoutedTrips trips;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;

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
     * Gets the value of the namedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedescription() {
        return namedescription;
    }

    /**
     * Sets the value of the namedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedescription(String value) {
        this.namedescription = value;
    }

    /**
     * Gets the value of the servicedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicedescription() {
        return servicedescription;
    }

    /**
     * Sets the value of the servicedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicedescription(String value) {
        this.servicedescription = value;
    }

    /**
     * Gets the value of the circular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCircular() {
        return circular;
    }

    /**
     * Sets the value of the circular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCircular(Boolean value) {
        this.circular = value;
    }

    /**
     * 
     * 							Lists the instances of trips made for this
     * 							service
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementRoutedTrips }
     *     
     */
    public XMLElementRoutedTrips getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementRoutedTrips }
     *     
     */
    public void setTrips(XMLElementRoutedTrips value) {
        this.trips = value;
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

}
