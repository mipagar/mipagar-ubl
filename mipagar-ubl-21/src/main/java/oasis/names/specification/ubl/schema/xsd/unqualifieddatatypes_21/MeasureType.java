
package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AltitudeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.BaseUnitMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ChargeableWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ComparedValueMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ConditionValueMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.DurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.GrossVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LatitudeDegreesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LatitudeMinutesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LeadTimeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LoadingLengthMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LongitudeDegreesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LongitudeMinutesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MaximumMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MinimumMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NetNetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NetVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.SourceValueMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.TareWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ValueMeasureType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000013&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A numeric value determined by measuring an object along with the specified unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Type&lt;/ccts:PropertyTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>MeasureType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType")
@XmlSeeAlso({
    LatitudeMinutesMeasureType.class,
    TareWeightMeasureType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MeasureType.class,
    SourceValueMeasureType.class,
    MinimumMeasureType.class,
    LatitudeDegreesMeasureType.class,
    ConditionValueMeasureType.class,
    LongitudeDegreesMeasureType.class,
    NetVolumeMeasureType.class,
    GrossWeightMeasureType.class,
    GrossVolumeMeasureType.class,
    BaseUnitMeasureType.class,
    LeadTimeMeasureType.class,
    NetWeightMeasureType.class,
    ComparedValueMeasureType.class,
    DurationMeasureType.class,
    NetNetWeightMeasureType.class,
    ValueMeasureType.class,
    LongitudeMinutesMeasureType.class,
    MaximumMeasureType.class,
    AltitudeMeasureType.class,
    ChargeableWeightMeasureType.class,
    LoadingLengthMeasureType.class
})
public class MeasureType
    extends un.unece.uncefact.data.specification.corecomponenttypeschemamodule._21.MeasureType
{


}
