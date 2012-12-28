
package oasis.names.specification.ubl.schema.xsd.billoflading_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.billoflading_2 package. 
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

    private final static QName _BillOfLading_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:BillOfLading-2", "BillOfLading");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.billoflading_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BillOfLadingType }
     * 
     */
    public BillOfLadingType createBillOfLadingType() {
        return new BillOfLadingType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOfLadingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:BillOfLading-2", name = "BillOfLading")
    public JAXBElement<BillOfLadingType> createBillOfLading(BillOfLadingType value) {
        return new JAXBElement<BillOfLadingType>(_BillOfLading_QNAME, BillOfLadingType.class, null, value);
    }

}
