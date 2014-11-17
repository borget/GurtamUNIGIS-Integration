
package mx.skyguardian.unigis.integration.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.skyguardian.integration.webservice.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Boolean_QNAME = new QName("http://www.assistcargo.com/", "boolean");
    private final static QName _Int_QNAME = new QName("http://www.assistcargo.com/", "int");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.skyguardian.integration.webservice.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginYInsertarEvento }
     * 
     */
    public LoginYInsertarEvento createLoginYInsertarEvento() {
        return new LoginYInsertarEvento();
    }

    

    /**
     * Create an instance of {@link LoginYInsertarEventoResponse }
     * 
     */
    public LoginYInsertarEventoResponse createLoginYInsertarEventoResponse() {
        return new LoginYInsertarEventoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.assistcargo.com/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.assistcargo.com/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

}
