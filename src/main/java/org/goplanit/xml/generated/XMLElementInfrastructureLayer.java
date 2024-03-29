
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
 * 				The physical infrastructure consists of nodes and
 * 				links
 * 			
 * 
 * <p>Java class for layer element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="layer"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}layerconfiguration"/&gt;
 *           &lt;element ref="{}nodes"/&gt;
 *           &lt;element ref="{}links"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;attribute ref="{}srsname"/&gt;
 *         &lt;attribute name="modes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "layerconfiguration",
    "nodes",
    "links"
})
@XmlRootElement(name = "layer")
public class XMLElementInfrastructureLayer
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected XMLElementLayerConfiguration layerconfiguration;
    @XmlElement(required = true)
    protected XMLElementNodes nodes;
    @XmlElement(required = true)
    protected XMLElementLinks links;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalid")
    protected String externalid;
    @XmlAttribute(name = "srsname")
    protected String srsname;
    @XmlAttribute(name = "modes")
    protected String modes;

    /**
     * Gets the value of the layerconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementLayerConfiguration }
     *     
     */
    public XMLElementLayerConfiguration getLayerconfiguration() {
        return layerconfiguration;
    }

    /**
     * Sets the value of the layerconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementLayerConfiguration }
     *     
     */
    public void setLayerconfiguration(XMLElementLayerConfiguration value) {
        this.layerconfiguration = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementNodes }
     *     
     */
    public XMLElementNodes getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementNodes }
     *     
     */
    public void setNodes(XMLElementNodes value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementLinks }
     *     
     */
    public XMLElementLinks getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementLinks }
     *     
     */
    public void setLinks(XMLElementLinks value) {
        this.links = value;
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
     * 
     * 						Spatial reference system chosen for
     * 						infrastructure, if absent WGS84, i.e., epsg:4326, is assumed
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsname() {
        if (srsname == null) {
            return "EPSG:4326";
        } else {
            return srsname;
        }
    }

    /**
     * Sets the value of the srsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsname(String value) {
        this.srsname = value;
    }

    /**
     * Gets the value of the modes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModes(String value) {
        this.modes = value;
    }

}
