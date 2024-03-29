
package org.goplanit.xml.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				a transfer zone group is a group of somehow related transfer zones that logically belong together. This is optional
 * 				 and can potentially be used to streamline finding eligible or more likely transfers, or to aggregate transfer zones if 
 * 				 one wants to simplify the model in meaningful way
 * 			
 * 
 * <p>Java class for transferzonegroups element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="transferzonegroups"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}transfergroup" maxOccurs="unbounded"/&gt;
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
    "transfergroup"
})
@XmlRootElement(name = "transferzonegroups")
public class XMLElementTransferZoneGroups
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected List<XMLElementTransferGroup> transfergroup;

    /**
     * 
     * 							A transfer group logically groups two or more transfer zones together
     * 						Gets the value of the transfergroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transfergroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransfergroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementTransferGroup }
     * 
     * 
     */
    public List<XMLElementTransferGroup> getTransfergroup() {
        if (transfergroup == null) {
            transfergroup = new ArrayList<XMLElementTransferGroup>();
        }
        return this.transfergroup;
    }

}
