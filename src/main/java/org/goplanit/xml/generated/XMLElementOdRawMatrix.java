
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				CSV like string of entire matrix (including zero
 * 				values) formatted based on os (origin separator) and ds (destination
 * 				separator) attribute configuration
 * 			
 * 
 * <p>Java class for odrawmatrix element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="odrawmatrix"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;extension base="{}odmatrix"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="values"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                   &lt;attribute ref="{}os"/&gt;
 *                   &lt;attribute ref="{}ds"/&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *       &lt;/extension&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "values"
})
@XmlRootElement(name = "odrawmatrix")
public class XMLElementOdRawMatrix
    extends XMLElementOdMatrix
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected XMLElementOdRawMatrix.Values values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link XMLElementOdRawMatrix.Values }
     *     
     */
    public XMLElementOdRawMatrix.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLElementOdRawMatrix.Values }
     *     
     */
    public void setValues(XMLElementOdRawMatrix.Values value) {
        this.values = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute ref="{}os"/&gt;
     *       &lt;attribute ref="{}ds"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Values
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected String value;
        @XmlAttribute(name = "os")
        protected String os;
        @XmlAttribute(name = "ds")
        protected String ds;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the os property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOs() {
            if (os == null) {
                return ",";
            } else {
                return os;
            }
        }

        /**
         * Sets the value of the os property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOs(String value) {
            this.os = value;
        }

        /**
         * Gets the value of the ds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDs() {
            if (ds == null) {
                return ",";
            } else {
                return ds;
            }
        }

        /**
         * Sets the value of the ds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDs(String value) {
            this.ds = value;
        }

    }

}
