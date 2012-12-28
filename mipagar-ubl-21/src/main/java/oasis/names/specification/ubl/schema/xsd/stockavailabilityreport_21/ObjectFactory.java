
package oasis.names.specification.ubl.schema.xsd.stockavailabilityreport_21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.stockavailabilityreport_21 package. 
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

    private final static QName _StockAvailabilityReport_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:StockAvailabilityReport-2", "StockAvailabilityReport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.stockavailabilityreport_21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockAvailabilityReportType }
     * 
     */
    public StockAvailabilityReportType createStockAvailabilityReportType() {
        return new StockAvailabilityReportType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockAvailabilityReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:StockAvailabilityReport-2", name = "StockAvailabilityReport")
    public JAXBElement<StockAvailabilityReportType> createStockAvailabilityReport(StockAvailabilityReportType value) {
        return new JAXBElement<StockAvailabilityReportType>(_StockAvailabilityReport_QNAME, StockAvailabilityReportType.class, null, value);
    }

}
