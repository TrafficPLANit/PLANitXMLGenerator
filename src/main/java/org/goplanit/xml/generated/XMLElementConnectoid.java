
package org.goplanit.xml.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class XMLElementConnectoid
    extends JAXBElement<Odconnectoid>
{

    protected final static QName NAME = new QName("", "connectoid");

    public XMLElementConnectoid(Odconnectoid value) {
        super(NAME, ((Class) Odconnectoid.class), null, value);
    }

    public XMLElementConnectoid() {
        super(NAME, ((Class) Odconnectoid.class), null, null);
    }

}
