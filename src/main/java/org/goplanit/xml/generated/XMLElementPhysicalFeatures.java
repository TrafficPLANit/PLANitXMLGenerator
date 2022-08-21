
package org.goplanit.xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Physical features of a mode.
 * 			
 * 
 * <p>Java class for physicalfeatures element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="physicalfeatures"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="vehicletype" type="{}vehicularType"/&gt;
 *           &lt;element name="motorisationtype" type="{}motorisationType"/&gt;
 *           &lt;element name="tracktype" type="{}trackType"/&gt;
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
    "vehicletype",
    "motorisationtype",
    "tracktype"
})
@XmlRootElement(name = "physicalfeatures")
public class XMLElementPhysicalFeatures {

    @XmlElement(required = true, defaultValue = "vehicle")
    @XmlSchemaType(name = "string")
    protected VehicularType vehicletype;
    @XmlElement(required = true, defaultValue = "motorised")
    @XmlSchemaType(name = "string")
    protected MotorisationType motorisationtype;
    @XmlElement(required = true, defaultValue = "road")
    @XmlSchemaType(name = "string")
    protected TrackType tracktype;

    /**
     * Gets the value of the vehicletype property.
     * 
     * @return
     *     possible object is
     *     {@link VehicularType }
     *     
     */
    public VehicularType getVehicletype() {
        return vehicletype;
    }

    /**
     * Sets the value of the vehicletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicularType }
     *     
     */
    public void setVehicletype(VehicularType value) {
        this.vehicletype = value;
    }

    /**
     * Gets the value of the motorisationtype property.
     * 
     * @return
     *     possible object is
     *     {@link MotorisationType }
     *     
     */
    public MotorisationType getMotorisationtype() {
        return motorisationtype;
    }

    /**
     * Sets the value of the motorisationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotorisationType }
     *     
     */
    public void setMotorisationtype(MotorisationType value) {
        this.motorisationtype = value;
    }

    /**
     * Gets the value of the tracktype property.
     * 
     * @return
     *     possible object is
     *     {@link TrackType }
     *     
     */
    public TrackType getTracktype() {
        return tracktype;
    }

    /**
     * Sets the value of the tracktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackType }
     *     
     */
    public void setTracktype(TrackType value) {
        this.tracktype = value;
    }

}
