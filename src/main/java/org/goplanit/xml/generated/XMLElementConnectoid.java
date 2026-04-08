
package org.goplanit.xml.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Each "regular" OD connectoid represents a potential point of exit/entry from/to the physical
 * 				network coming from the zone/centroid. There
 * 				must be at minimum one connectoid to be able to leave/enter the zone. Each regular connectoid
 * 				attaches by means of a node XML id reference
 * 			
 * 
 * <p>Java class for connectoid element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="connectoid"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;extension base="{}connectoidtype"&gt;
 *       &lt;/extension&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "connectoid")
public class XMLElementConnectoid
    extends Connectoidtype
    implements Serializable
{

    private final static long serialVersionUID = -1L;

}
