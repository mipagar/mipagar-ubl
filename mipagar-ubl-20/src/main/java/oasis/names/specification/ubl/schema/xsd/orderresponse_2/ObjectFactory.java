
package oasis.names.specification.ubl.schema.xsd.orderresponse_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.orderresponse_2 package. 
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

    private final static QName _OrderResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:OrderResponse-2", "OrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.orderresponse_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderResponseType }
     * 
     */
    public OrderResponseType createOrderResponseType() {
        return new OrderResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:OrderResponse-2", name = "OrderResponse")
    public JAXBElement<OrderResponseType> createOrderResponse(OrderResponseType value) {
        return new JAXBElement<OrderResponseType>(_OrderResponse_QNAME, OrderResponseType.class, null, value);
    }

}
