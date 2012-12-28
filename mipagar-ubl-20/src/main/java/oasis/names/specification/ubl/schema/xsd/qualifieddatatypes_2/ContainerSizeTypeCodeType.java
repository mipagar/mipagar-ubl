
package oasis.names.specification.ubl.schema.xsd.qualifieddatatypes_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:DictionaryEntryName&gt;Container Size Type_ Code. Type&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Version&gt;2.0&lt;/ccts:Version&gt;&lt;ccts:Definition&gt;The set of code values for classifying series 1 freight containers based on external dimensions and specifies the assoziated ratings and, where appropriate, the minimum internal and door opening dimensions for certain types of containers.&lt;/ccts:Definition&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:QualifierTerm&gt;Container Size Type&lt;/ccts:QualifierTerm&gt;&lt;ccts:UniqueID/&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ContainerSizeTypeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerSizeTypeCodeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2>CodeType">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="ISO 668" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="5" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" default="ISO" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" default="Container Size Type" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="1995" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://docs.oasis-open.org/ubl/os-ubl-2.0/cl/gc/special-purpose/ContainerSizeTypeCode-2.0.gc" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:oasis:names:specification:ubl:codelist:gc:ContainerSizeTypeCode-2.0" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerSizeTypeCodeType")
public class ContainerSizeTypeCodeType
    extends CodeType
{


}