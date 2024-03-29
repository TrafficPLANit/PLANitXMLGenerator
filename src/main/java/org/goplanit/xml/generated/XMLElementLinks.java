
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
import net.opengis.gml.LineStringType;


/**
 * 
 * 				The connections between a pair of nodes
 * 			
 * 
 * <p>Java class for links element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="links"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="link" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element ref="{http://www.opengis.net/gml}LineString" minOccurs="0"/&gt;
 *                     &lt;element ref="{}linksegment" maxOccurs="2"/&gt;
 *                     &lt;element name="length" type="{}linkLengthType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="nodearef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="nodebref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "link"
})
@XmlRootElement(name = "links")
public class XMLElementLinks
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementLinks.Link> link;

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementLinks.Link }
     * 
     * 
     */
    public List<XMLElementLinks.Link> getLink() {
        if (link == null) {
            link = new ArrayList<XMLElementLinks.Link>();
        }
        return this.link;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.opengis.net/gml}LineString" minOccurs="0"/&gt;
     *         &lt;element ref="{}linksegment" maxOccurs="2"/&gt;
     *         &lt;element name="length" type="{}linkLengthType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="nodearef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="nodebref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "lineString",
        "linksegment",
        "length"
    })
    public static class Link
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(defaultValue = "")
        protected String name;
        @XmlElement(name = "LineString", namespace = "http://www.opengis.net/gml")
        protected LineStringType lineString;
        @XmlElement(required = true)
        protected List<XMLElementLinkSegment> linksegment;
        protected XMLElementLinkLengthType length;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "externalid")
        protected String externalid;
        @XmlAttribute(name = "nodearef", required = true)
        protected String nodearef;
        @XmlAttribute(name = "nodebref", required = true)
        protected String nodebref;

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
         * 
         * 										Each link segment has an optional gml
         * 										LineString to define shape points. Note that one can choose to
         * 										either duplicate the node points or not here
         * 									
         * 
         * @return
         *     possible object is
         *     {@link LineStringType }
         *     
         */
        public LineStringType getLineString() {
            return lineString;
        }

        /**
         * Sets the value of the lineString property.
         * 
         * @param value
         *     allowed object is
         *     {@link LineStringType }
         *     
         */
        public void setLineString(LineStringType value) {
            this.lineString = value;
        }

        /**
         * 
         * 										Each link segment has a direction and at most
         * 										two directions exist per link
         * 									Gets the value of the linksegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linksegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinksegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLElementLinkSegment }
         * 
         * 
         */
        public List<XMLElementLinkSegment> getLinksegment() {
            if (linksegment == null) {
                linksegment = new ArrayList<XMLElementLinkSegment>();
            }
            return this.linksegment;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link XMLElementLinkLengthType }
         *     
         */
        public XMLElementLinkLengthType getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementLinkLengthType }
         *     
         */
        public void setLength(XMLElementLinkLengthType value) {
            this.length = value;
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
         * Gets the value of the nodearef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodearef() {
            return nodearef;
        }

        /**
         * Sets the value of the nodearef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodearef(String value) {
            this.nodearef = value;
        }

        /**
         * Gets the value of the nodebref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodebref() {
            return nodebref;
        }

        /**
         * Sets the value of the nodebref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodebref(String value) {
            this.nodebref = value;
        }

    }

}
