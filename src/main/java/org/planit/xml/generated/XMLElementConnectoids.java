//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 03:14:58 PM AEST 
//


package org.planit.xml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Connectoids are the interface between supply and demand which are defined as a node (but in practice create virtual links (connectors)
 * 				between the centroid and physical road network). Here the physical node(s) that act as connectoids for this particular zoning are to be
 * 				defined here. 
 * 			
 * 
 * <p>Java class for connectoids element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="connectoids"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element ref="{}connectoid"/&gt;
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
    "connectoid"
})
@XmlRootElement(name = "connectoids")
public class XMLElementConnectoids {

    @XmlElement(required = true)
    protected List<XMLElementConnectoid> connectoid;

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
     * {@link XMLElementConnectoid }
     * 
     * 
     */
    public List<XMLElementConnectoid> getConnectoid() {
        if (connectoid == null) {
            connectoid = new ArrayList<XMLElementConnectoid>();
        }
        return this.connectoid;
    }

}
