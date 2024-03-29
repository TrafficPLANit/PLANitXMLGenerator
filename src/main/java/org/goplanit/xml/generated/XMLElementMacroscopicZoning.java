
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for macroscopiczoning element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="macroscopiczoning"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}zones" minOccurs="0"/&gt;
 *           &lt;element name="intermodal" type="{}intermodaltype" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute ref="{}srsname use="required""/&gt;
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
    "zones",
    "intermodal"
})
@XmlRootElement(name = "macroscopiczoning")
public class XMLElementMacroscopicZoning
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String id;
    protected XMLElementZones zones;
    @XmlElementRef(name = "intermodal", type = XMLElementMacroscopicZoning.XMLElementIntermodal.class, required = false)
    protected XMLElementMacroscopicZoning.XMLElementIntermodal intermodal;
    @XmlAttribute(name = "srsname", required = true)
    protected String srsname;

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
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementZones }
     *     
     */
    public XMLElementZones getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementZones }
     *     
     */
    public void setZones(XMLElementZones value) {
        this.zones = value;
    }

    /**
     * Gets the value of the intermodal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementMacroscopicZoning.XMLElementIntermodal }
     *     
     */
    public XMLElementMacroscopicZoning.XMLElementIntermodal getIntermodal() {
        return intermodal;
    }

    /**
     * Sets the value of the intermodal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementMacroscopicZoning.XMLElementIntermodal }
     *     
     */
    public void setIntermodal(XMLElementMacroscopicZoning.XMLElementIntermodal value) {
        this.intermodal = value;
    }

    /**
     * 
     * 	            Spatial reference system used for this zoning. It can be different to the network it is used on but it is recommended to be the same. When different the gml elements in this xml
     * 	            are parsed according to the provided srs but will internally be converted into the "dominant" project srs which is the one provided on the infrastructure element
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

    public static class XMLElementIntermodal
        extends JAXBElement<Intermodaltype>
    {

        protected final static QName NAME = new QName("", "intermodal");

        public XMLElementIntermodal(Intermodaltype value) {
            super(NAME, ((Class) Intermodaltype.class), XMLElementMacroscopicZoning.class, value);
        }

        public XMLElementIntermodal() {
            super(NAME, ((Class) Intermodaltype.class), XMLElementMacroscopicZoning.class, null);
        }

    }

}
