
package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ActualDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ActualDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ActualPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AwardTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CallTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ComparisonForecastIssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.EarliestPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.EffectiveTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.EndTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.EstimatedDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.EstimatedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ExpiryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.GuaranteedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LastRevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LatestDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LatestPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ManufactureTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NominationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.OccurrenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.PaidTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ReferenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RegisteredTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RequestedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RequiredDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ResolutionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ResponseTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.SourceForecastIssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.StartTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ValidationTimeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000010&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The instance of time that occurs every day.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ReferenceTimeType.class,
    ComparisonForecastIssueTimeType.class,
    RegisteredTimeType.class,
    RevisionTimeType.class,
    LastRevisionTimeType.class,
    RequiredDeliveryTimeType.class,
    ResolutionTimeType.class,
    OccurrenceTimeType.class,
    EarliestPickupTimeType.class,
    ValidationTimeType.class,
    RequestedDespatchTimeType.class,
    CallTimeType.class,
    PaidTimeType.class,
    LatestPickupTimeType.class,
    NominationTimeType.class,
    EffectiveTimeType.class,
    IssueTimeType.class,
    EstimatedDespatchTimeType.class,
    ManufactureTimeType.class,
    ResponseTimeType.class,
    ActualDeliveryTimeType.class,
    SourceForecastIssueTimeType.class,
    ActualDespatchTimeType.class,
    AwardTimeType.class,
    ActualPickupTimeType.class,
    LatestDeliveryTimeType.class,
    StartTimeType.class,
    GuaranteedDespatchTimeType.class,
    ExpiryTimeType.class,
    EndTimeType.class,
    EstimatedDeliveryTimeType.class
})
public class TimeType {

    @XmlValue
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
