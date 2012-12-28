
package oasis.names.specification.ubl.schema.xsd.ordercancellation_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.ordercancellation_21 package. 
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

    private final static QName _OrderCancellation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:OrderCancellation-2", "OrderCancellation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.ordercancellation_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderCancellationType }
     * 
     */
    public OrderCancellationType createOrderCancellationType() {
        return new OrderCancellationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCancellationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:OrderCancellation-2", name = "OrderCancellation")
    public JAXBElement<OrderCancellationType> createOrderCancellation(OrderCancellationType value) {
        return new JAXBElement<OrderCancellationType>(_OrderCancellation_QNAME, OrderCancellationType.class, null, value);
    }

}
