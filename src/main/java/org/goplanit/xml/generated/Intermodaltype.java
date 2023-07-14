
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intermodaltype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intermodaltype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}transferzones"/&gt;
 *         &lt;element ref="{}transferzoneaccess"/&gt;
 *         &lt;element ref="{}transferzonegroups" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intermodaltype", propOrder = {
    "transferzones",
    "transferzoneaccess",
    "transferzonegroups"
})
public class Intermodaltype
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected XMLElementTransferZones transferzones;
    @XmlElement(required = true)
    protected XMLElementTransferZoneAccess transferzoneaccess;
    protected XMLElementTransferZoneGroups transferzonegroups;

    /**
     * 
     * 	            A transfer zone represents a possibility for transfers between different modes from different
     * 	            network layers. How these interactions take place is defined via the transferzoneaccess elements.
     * 	          
     * 
     * @return
     *     possible object is
     *     {@link XMLElementTransferZones }
     *     
     */
    public XMLElementTransferZones getTransferzones() {
        return transferzones;
    }

    /**
     * Sets the value of the transferzones property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementTransferZones }
     *     
     */
    public void setTransferzones(XMLElementTransferZones value) {
        this.transferzones = value;
    }

    /**
     * 
     * 	            transfer zone access elements define how transfer zones can be accessed via different modes from different layers
     * 	            linking layer specific infrastructure to the transfer zones which exist between network layers.
     * 	          
     * 
     * @return
     *     possible object is
     *     {@link XMLElementTransferZoneAccess }
     *     
     */
    public XMLElementTransferZoneAccess getTransferzoneaccess() {
        return transferzoneaccess;
    }

    /**
     * Sets the value of the transferzoneaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementTransferZoneAccess }
     *     
     */
    public void setTransferzoneaccess(XMLElementTransferZoneAccess value) {
        this.transferzoneaccess = value;
    }

    /**
     * 
     * 	            Transfer zone groups allow one to group multiple transfer zones to indicate they logically belong together. For
     * 	            example to group various platforms on a station. This is optional. 
     * 	          
     * 
     * @return
     *     possible object is
     *     {@link XMLElementTransferZoneGroups }
     *     
     */
    public XMLElementTransferZoneGroups getTransferzonegroups() {
        return transferzonegroups;
    }

    /**
     * Sets the value of the transferzonegroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementTransferZoneGroups }
     *     
     */
    public void setTransferzonegroups(XMLElementTransferZoneGroups value) {
        this.transferzonegroups = value;
    }

}
