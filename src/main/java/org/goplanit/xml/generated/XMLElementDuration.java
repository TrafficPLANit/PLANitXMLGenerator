
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Duration is a positive integer (in seconds) and we
 * 				start counting from the start time. Note that the duration must
 * 				always be less
 * 				than the number of seconds in a day (86400).
 * 			
 * 
 * <p>Java class for duration element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="duration"&gt;
 *   &lt;complexType&gt;
 *     &lt;simpleContent&gt;
 *       &lt;restriction base="&lt;&gt;unrestrictedduration"&gt;
 *       &lt;/restriction&gt;
 *     &lt;/simpleContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "duration")
public class XMLElementDuration
    extends XMLElementUnrestrictedDuration
    implements Serializable
{

    private final static long serialVersionUID = -1L;

}
