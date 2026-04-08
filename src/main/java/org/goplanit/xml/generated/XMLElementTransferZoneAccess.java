
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
 * 				Provide how each access point can access one or more transfer zones
 * 			
 * 
 * <p>Java class for transferzoneaccess element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="transferzoneaccess"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="connectoid" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{}connectoidtype"&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="network_ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="network_layer_ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "connectoid"
})
@XmlRootElement(name = "transferzoneaccess")
public class XMLElementTransferZoneAccess
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementTransferZoneAccess.XMLElementTransferConnectoid> connectoid;
    @XmlAttribute(name = "network_ref")
    protected String networkRef;
    @XmlAttribute(name = "network_layer_ref")
    protected String networkLayerRef;

    /**
     * Gets the value of the connectoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementTransferZoneAccess.XMLElementTransferConnectoid }
     * 
     * 
     */
    public List<XMLElementTransferZoneAccess.XMLElementTransferConnectoid> getConnectoid() {
        if (connectoid == null) {
            connectoid = new ArrayList<XMLElementTransferZoneAccess.XMLElementTransferConnectoid>();
        }
        return this.connectoid;
    }

    /**
     * Gets the value of the networkRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkRef() {
        return networkRef;
    }

    /**
     * Sets the value of the networkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkRef(String value) {
        this.networkRef = value;
    }

    /**
     * Gets the value of the networkLayerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLayerRef() {
        return networkLayerRef;
    }

    /**
     * Sets the value of the networkLayerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLayerRef(String value) {
        this.networkLayerRef = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}connectoidtype"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMLElementTransferConnectoid
        extends Connectoidtype
        implements Serializable
    {

        private final static long serialVersionUID = -1L;

    }

}
