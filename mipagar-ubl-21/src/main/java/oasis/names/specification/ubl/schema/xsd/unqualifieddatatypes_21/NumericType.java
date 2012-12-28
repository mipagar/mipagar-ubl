
package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.BudgetYearNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CalculationSequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.FrozenPeriodDaysNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LineNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MaximumCopiesNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MaximumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MaximumPaymentInstructionsNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MinimumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MultiplierFactorNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.OrderIntervalDaysNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.OrderQuantityIncrementNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.PackSizeNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ReminderSequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ResidentOccupantsNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.SequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.WeightNumericType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000014&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric information that is assigned or is determined by calculation, counting, or sequencing. It does not require a unit of quantity or unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NumericType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>NumericType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType")
@XmlSeeAlso({
    MaximumPaymentInstructionsNumericType.class,
    PackSizeNumericType.class,
    OrderQuantityIncrementNumericType.class,
    OrderIntervalDaysNumericType.class,
    ResidentOccupantsNumericType.class,
    WeightNumericType.class,
    BudgetYearNumericType.class,
    MinimumNumberNumericType.class,
    MaximumCopiesNumericType.class,
    FrozenPeriodDaysNumericType.class,
    LineNumberNumericType.class,
    CalculationSequenceNumericType.class,
    ReminderSequenceNumericType.class,
    MaximumNumberNumericType.class,
    LineCountNumericType.class,
    SequenceNumericType.class,
    MultiplierFactorNumericType.class
})
public class NumericType
    extends un.unece.uncefact.data.specification.corecomponenttypeschemamodule._21.NumericType
{


}
