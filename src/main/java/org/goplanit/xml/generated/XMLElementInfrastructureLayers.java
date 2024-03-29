
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
 * 				The physical infrastructure consists of nodes and
 * 				links
 * 			
 * 
 * <p>Java class for infrastructurelayers element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="infrastructurelayers"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}layer" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute ref="{}srsname"/&gt;
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
    "layer"
})
@XmlRootElement(name = "infrastructurelayers")
public class XMLElementInfrastructureLayers
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementInfrastructureLayer> layer;
    @XmlAttribute(name = "srsname")
    protected String srsname;

    /**
     * 
     * 							each network consists of at least one infrastructure layer containing
     * 							network elements such as nodes, links, etc.
     * 						Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementInfrastructureLayer }
     * 
     * 
     */
    public List<XMLElementInfrastructureLayer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<XMLElementInfrastructureLayer>();
        }
        return this.layer;
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

}
