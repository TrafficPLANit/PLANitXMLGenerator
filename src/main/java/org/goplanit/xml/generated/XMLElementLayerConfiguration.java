
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Configuration, i.e., meta data of a network layer
 * 			
 * 
 * <p>Java class for layerconfiguration element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="layerconfiguration"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}linksegmenttypes" minOccurs="0"/&gt;
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
    "linksegmenttypes"
})
@XmlRootElement(name = "layerconfiguration")
public class XMLElementLayerConfiguration
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected XMLElementLinkSegmentTypes linksegmenttypes;

    /**
     * 
     * 							Link segment types define the different types of
     * 							link segment properties that can be attributed to links. Note
     * 							that it is allowed not to define this element. In that case all
     * 							link(segments) are assumed to be of the same default
     * 							link segment type.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLElementLinkSegmentTypes }
     *     
     */
    public XMLElementLinkSegmentTypes getLinksegmenttypes() {
        return linksegmenttypes;
    }

    /**
     * Sets the value of the linksegmenttypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementLinkSegmentTypes }
     *     
     */
    public void setLinksegmenttypes(XMLElementLinkSegmentTypes value) {
        this.linksegmenttypes = value;
    }

}
