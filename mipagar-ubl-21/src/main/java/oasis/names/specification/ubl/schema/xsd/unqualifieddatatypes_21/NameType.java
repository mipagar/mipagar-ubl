
package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AdditionalStreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AliasNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.BlockNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.BrandNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.BuildingNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CategoryNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CitySubdivisionNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.FamilyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.FileNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.HolderNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.MiddleNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ModelNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RetailEventNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ServiceNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.TechnicalNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.VesselNameType;
import un.unece.uncefact.data.specification.corecomponenttypeschemamodule._21.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000020&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string that consititues the distinctive designation of a person, place, thing or concept.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>TextType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType")
@XmlSeeAlso({
    ServiceNameType.class,
    HolderNameType.class,
    VesselNameType.class,
    FirstNameType.class,
    ModelNameType.class,
    FamilyNameType.class,
    RetailEventNameType.class,
    AdditionalStreetNameType.class,
    CategoryNameType.class,
    TechnicalNameType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NameType.class,
    BuildingNameType.class,
    RegistrationNameType.class,
    StreetNameType.class,
    BrandNameType.class,
    CitySubdivisionNameType.class,
    BlockNameType.class,
    CityNameType.class,
    FileNameType.class,
    MiddleNameType.class,
    AliasNameType.class
})
public class NameType
    extends TextType
{


}
