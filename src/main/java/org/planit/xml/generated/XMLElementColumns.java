//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 11:45:04 AM AEST 
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
 * <p>Java class for columns element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="columns"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}column" maxOccurs="unbounded"/&gt;
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
    "column"
})
@XmlRootElement(name = "columns")
public class XMLElementColumns {

    @XmlElement(required = true)
    protected List<XMLElementColumn> column;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLElementColumn }
     * 
     * 
     */
    public List<XMLElementColumn> getColumn() {
        if (column == null) {
            column = new ArrayList<XMLElementColumn>();
        }
        return this.column;
    }

}
