
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Root element of a service network. Each service network is built on top of a physical network, where each service network layer directly
 * 				corresponds to a physical network layer on top of which its services are placed.
 * 			
 * 
 * <p>Java class for servicenetwork element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="servicenetwork"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="parentnetwork" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}servicenetworklayer" maxOccurs="unbounded"/&gt;
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
    "parentnetwork",
    "servicenetworklayer"
})
@XmlRootElement(name = "servicenetwork")
public class XMLElementServiceNetwork
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String parentnetwork;
    @XmlElement(required = true)
    protected List<XMLElementServiceNetworkLayer> servicenetworklayer;

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
     * Gets the value of the parentnetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentnetwork() {
        return parentnetwork;
    }

    /**
     * Sets the value of the parentnetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentnetwork(String value) {
        this.parentnetwork = value;
    }

    /**
     * Gets the value of the servicenetworklayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicenetworklayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicenetworklayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementServiceNetworkLayer }
     * 
     * 
     */
    public List<XMLElementServiceNetworkLayer> getServicenetworklayer() {
        if (servicenetworklayer == null) {
            servicenetworklayer = new ArrayList<XMLElementServiceNetworkLayer>();
        }
        return this.servicenetworklayer;
    }

}
