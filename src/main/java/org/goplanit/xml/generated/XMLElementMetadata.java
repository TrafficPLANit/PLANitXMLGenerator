
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for metadata element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="metadata"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}timestamp"/&gt;
 *           &lt;element ref="{}version"/&gt;
 *           &lt;element ref="{}description"/&gt;
 *           &lt;element ref="{}outputconfiguration"/&gt;
 *           &lt;element ref="{}simulation"/&gt;
 *           &lt;element ref="{}columns"/&gt;
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
    "timestamp",
    "version",
    "description",
    "outputconfiguration",
    "simulation",
    "columns"
})
@XmlRootElement(name = "metadata")
public class XMLElementMetadata
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected XMLElementOutputConfiguration outputconfiguration;
    @XmlElement(required = true)
    protected XMLElementSimulation simulation;
    @XmlElement(required = true)
    protected XMLElementColumns columns;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the outputconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementOutputConfiguration }
     *     
     */
    public XMLElementOutputConfiguration getOutputconfiguration() {
        return outputconfiguration;
    }

    /**
     * Sets the value of the outputconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementOutputConfiguration }
     *     
     */
    public void setOutputconfiguration(XMLElementOutputConfiguration value) {
        this.outputconfiguration = value;
    }

    /**
     * Gets the value of the simulation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementSimulation }
     *     
     */
    public XMLElementSimulation getSimulation() {
        return simulation;
    }

    /**
     * Sets the value of the simulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementSimulation }
     *     
     */
    public void setSimulation(XMLElementSimulation value) {
        this.simulation = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementColumns }
     *     
     */
    public XMLElementColumns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementColumns }
     *     
     */
    public void setColumns(XMLElementColumns value) {
        this.columns = value;
    }

}
