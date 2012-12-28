
package oasis.names.specification.ubl.schema.xsd.waybill_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.waybill_21 package. 
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

    private final static QName _Waybill_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:Waybill-2", "Waybill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.waybill_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WaybillType }
     * 
     */
    public WaybillType createWaybillType() {
        return new WaybillType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaybillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Waybill-2", name = "Waybill")
    public JAXBElement<WaybillType> createWaybill(WaybillType value) {
        return new JAXBElement<WaybillType>(_Waybill_QNAME, WaybillType.class, null, value);
    }

}
