
package oasis.names.specification.ubl.schema.xsd.utilitystatement_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.utilitystatement_21 package. 
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

    private final static QName _UtilityStatement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:UtilityStatement-2", "UtilityStatement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.utilitystatement_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UtilityStatementType }
     * 
     */
    public UtilityStatementType createUtilityStatementType() {
        return new UtilityStatementType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityStatementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:UtilityStatement-2", name = "UtilityStatement")
    public JAXBElement<UtilityStatementType> createUtilityStatement(UtilityStatementType value) {
        return new JAXBElement<UtilityStatementType>(_UtilityStatement_QNAME, UtilityStatementType.class, null, value);
    }

}
