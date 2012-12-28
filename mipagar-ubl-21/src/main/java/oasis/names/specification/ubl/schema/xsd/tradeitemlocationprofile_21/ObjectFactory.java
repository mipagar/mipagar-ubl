
package oasis.names.specification.ubl.schema.xsd.tradeitemlocationprofile_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.tradeitemlocationprofile_21 package. 
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

    private final static QName _TradeItemLocationProfile_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:TradeItemLocationProfile-2", "TradeItemLocationProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.tradeitemlocationprofile_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemLocationProfileType }
     * 
     */
    public TradeItemLocationProfileType createTradeItemLocationProfileType() {
        return new TradeItemLocationProfileType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemLocationProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:TradeItemLocationProfile-2", name = "TradeItemLocationProfile")
    public JAXBElement<TradeItemLocationProfileType> createTradeItemLocationProfile(TradeItemLocationProfileType value) {
        return new JAXBElement<TradeItemLocationProfileType>(_TradeItemLocationProfile_QNAME, TradeItemLocationProfileType.class, null, value);
    }

}
