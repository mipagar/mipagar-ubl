
package oasis.names.specification.ubl.schema.xsd.exceptioncriteria_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.exceptioncriteria_21 package. 
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

    private final static QName _ExceptionCriteria_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:ExceptionCriteria-2", "ExceptionCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.exceptioncriteria_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionCriteriaType }
     * 
     */
    public ExceptionCriteriaType createExceptionCriteriaType() {
        return new ExceptionCriteriaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:ExceptionCriteria-2", name = "ExceptionCriteria")
    public JAXBElement<ExceptionCriteriaType> createExceptionCriteria(ExceptionCriteriaType value) {
        return new JAXBElement<ExceptionCriteriaType>(_ExceptionCriteria_QNAME, ExceptionCriteriaType.class, null, value);
    }

}
