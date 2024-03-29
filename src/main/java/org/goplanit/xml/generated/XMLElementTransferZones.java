
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
import net.opengis.gml.PolygonType;


/**
 * 
 * 				Defines the available transfer zones one-by-one, where each transferzone represents
 * 				a geographic location where transfers between zones are being facilitated.
 * 			
 * 
 * <p>Java class for transferzones element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="transferzones"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="zone" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="platforms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element ref="{}centroid" minOccurs="0"/&gt;
 *                     &lt;choice minOccurs="0"&gt;
 *                       &lt;element ref="{http://www.opengis.net/gml}LineString"/&gt;
 *                       &lt;element ref="{http://www.opengis.net/gml}Polygon"/&gt;
 *                     &lt;/choice&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="type" type="{}transferzonetype" default="none" /&gt;
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
    "zone"
})
@XmlRootElement(name = "transferzones")
public class XMLElementTransferZones
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementTransferZones.XMLElementTransferZone> zone;

    /**
     * Gets the value of the zone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementTransferZones.XMLElementTransferZone }
     * 
     * 
     */
    public List<XMLElementTransferZones.XMLElementTransferZone> getZone() {
        if (zone == null) {
            zone = new ArrayList<XMLElementTransferZones.XMLElementTransferZone>();
        }
        return this.zone;
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
     *         &lt;element name="platforms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element ref="{}centroid" minOccurs="0"/&gt;
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element ref="{http://www.opengis.net/gml}LineString"/&gt;
     *           &lt;element ref="{http://www.opengis.net/gml}Polygon"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="externalid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="type" type="{}transferzonetype" default="none" /&gt;
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
        "platforms",
        "centroid",
        "lineString",
        "polygon"
    })
    public static class XMLElementTransferZone
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        protected String name;
        protected String platforms;
        protected XMLElementCentroid centroid;
        @XmlElement(name = "LineString", namespace = "http://www.opengis.net/gml")
        protected LineStringType lineString;
        @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml")
        protected PolygonType polygon;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "externalid")
        protected String externalid;
        @XmlAttribute(name = "type")
        protected Transferzonetype type;

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
         * Gets the value of the platforms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatforms() {
            return platforms;
        }

        /**
         * Sets the value of the platforms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatforms(String value) {
            this.platforms = value;
        }

        /**
         * 
         * 			              each transfer zone can have a centroid to allow modes to enter via one mode/network layer, pass through
         * 			              the centroid, and exit the zone via another mode/network layer. If absent the distance travelled through
         * 			              the zone cannot be computed geometrically and therefore will revert to the default
         * 			            
         * 
         * @return
         *     possible object is
         *     {@link XMLElementCentroid }
         *     
         */
        public XMLElementCentroid getCentroid() {
            return centroid;
        }

        /**
         * Sets the value of the centroid property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLElementCentroid }
         *     
         */
        public void setCentroid(XMLElementCentroid value) {
            this.centroid = value;
        }

        /**
         * Gets the value of the lineString property.
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
         * Gets the value of the polygon property.
         * 
         * @return
         *     possible object is
         *     {@link PolygonType }
         *     
         */
        public PolygonType getPolygon() {
            return polygon;
        }

        /**
         * Sets the value of the polygon property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolygonType }
         *     
         */
        public void setPolygon(PolygonType value) {
            this.polygon = value;
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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Transferzonetype }
         *     
         */
        public Transferzonetype getType() {
            if (type == null) {
                return Transferzonetype.NONE;
            } else {
                return type;
            }
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Transferzonetype }
         *     
         */
        public void setType(Transferzonetype value) {
            this.type = value;
        }

    }

}
