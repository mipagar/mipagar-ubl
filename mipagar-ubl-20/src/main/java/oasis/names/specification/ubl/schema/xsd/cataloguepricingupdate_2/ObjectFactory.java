
package oasis.names.specification.ubl.schema.xsd.cataloguepricingupdate_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.cataloguepricingupdate_2 package. 
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

    private final static QName _CataloguePricingUpdate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CataloguePricingUpdate-2", "CataloguePricingUpdate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.cataloguepricingupdate_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CataloguePricingUpdateType }
     * 
     */
    public CataloguePricingUpdateType createCataloguePricingUpdateType() {
        return new CataloguePricingUpdateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CataloguePricingUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CataloguePricingUpdate-2", name = "CataloguePricingUpdate")
    public JAXBElement<CataloguePricingUpdateType> createCataloguePricingUpdate(CataloguePricingUpdateType value) {
        return new JAXBElement<CataloguePricingUpdateType>(_CataloguePricingUpdate_QNAME, CataloguePricingUpdateType.class, null, value);
    }

}
