
package oasis.names.specification.ubl.schema.xsd.cataloguedeletion_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.cataloguedeletion_21 package. 
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

    private final static QName _CatalogueDeletion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CatalogueDeletion-2", "CatalogueDeletion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.cataloguedeletion_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueDeletionType }
     * 
     */
    public CatalogueDeletionType createCatalogueDeletionType() {
        return new CatalogueDeletionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueDeletionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CatalogueDeletion-2", name = "CatalogueDeletion")
    public JAXBElement<CatalogueDeletionType> createCatalogueDeletion(CatalogueDeletionType value) {
        return new JAXBElement<CatalogueDeletionType>(_CatalogueDeletion_QNAME, CatalogueDeletionType.class, null, value);
    }

}
