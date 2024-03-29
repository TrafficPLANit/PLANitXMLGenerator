
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
 * 				Root element of routed services, these can be for
 * 				either microscopic or macroscopic networks. A routed service
 * 				has a
 * 				predefined route that is being executed by a mode at specific time
 * 				instances (or frequencies).
 * 			
 * 
 * <p>Java class for routedservices element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="routedservices"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="servicelayers"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{}servicelayer" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="servicenetworkref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
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
    "externalid",
    "servicelayers"
})
@XmlRootElement(name = "routedservices")
public class XMLElementRoutedServices
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String id;
    protected String externalid;
    @XmlElement(required = true)
    protected XMLElementRoutedServices.Servicelayers servicelayers;

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
     * Gets the value of the servicelayers property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementRoutedServices.Servicelayers }
     *     
     */
    public XMLElementRoutedServices.Servicelayers getServicelayers() {
        return servicelayers;
    }

    /**
     * Sets the value of the servicelayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementRoutedServices.Servicelayers }
     *     
     */
    public void setServicelayers(XMLElementRoutedServices.Servicelayers value) {
        this.servicelayers = value;
    }


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
     *         &lt;element ref="{}servicelayer" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="servicenetworkref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servicelayer"
    })
    public static class Servicelayers
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<XMLElementRoutedServicesLayer> servicelayer;
        @XmlAttribute(name = "servicenetworkref", required = true)
        protected String servicenetworkref;

        /**
         * Gets the value of the servicelayer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicelayer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicelayer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLElementRoutedServicesLayer }
         * 
         * 
         */
        public List<XMLElementRoutedServicesLayer> getServicelayer() {
            if (servicelayer == null) {
                servicelayer = new ArrayList<XMLElementRoutedServicesLayer>();
            }
            return this.servicelayer;
        }

        /**
         * Gets the value of the servicenetworkref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServicenetworkref() {
            return servicenetworkref;
        }

        /**
         * Sets the value of the servicenetworkref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServicenetworkref(String value) {
            this.servicenetworkref = value;
        }

    }

}
