
package oasis.names.specification.ubl.schema.xsd.qualifieddatatypes_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentAlternativeCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PricingCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedInvoiceCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxCurrencyCodeType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:DictionaryEntryName&gt;Currency_ Code. Type&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Version&gt;2.0&lt;/ccts:Version&gt;&lt;ccts:Definition&gt;The set of world currencies.&lt;/ccts:Definition&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:QualifierTerm&gt;Currency&lt;/ccts:QualifierTerm&gt;&lt;ccts:UniqueID/&gt;&lt;ccts:UsageRule&gt;Derived from the ISO 4217 currency code list and used under the terms of the ISO policy stated at 
 * http://www.iso.org/iso/en/commcentre/pressreleases/2003/Ref871.html&lt;/ccts:UsageRule&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CurrencyCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyCodeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2>CodeType">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="ISO 4217 Alpha" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="6" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" default="United Nations Economic Commission for Europe" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" default="Currency" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="2001" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://docs.oasis-open.org/ubl/os-ubl-2.0/cl/gc/cefact/CurrencyCode-2.0.gc" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:un:unece:uncefact:codelist:specification:54217:2001" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyCodeType")
@XmlSeeAlso({
    PaymentAlternativeCurrencyCodeType.class,
    RequestedInvoiceCurrencyCodeType.class,
    TaxCurrencyCodeType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CurrencyCodeType.class,
    PricingCurrencyCodeType.class,
    TargetCurrencyCodeType.class,
    SourceCurrencyCodeType.class,
    PaymentCurrencyCodeType.class,
    DocumentCurrencyCodeType.class
})
public class CurrencyCodeType
    extends CodeType
{


}
