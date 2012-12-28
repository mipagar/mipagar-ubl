
package oasis.names.specification.ubl.schema.xsd.catalogueitemspecificationupdate_21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.CatalogueItemSpecificationUpdateLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.CatalogueReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.ContractType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.CustomerPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.LanguageType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.SignatureType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.SupplierPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.TradingTermsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ProfileExecutionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RevisionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.RevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.VersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The document used to update information about Items (e.g., technical descriptions and properties) on an existing Catalogue.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CatalogueItemSpecificationUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemSpecificationUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UBLVersionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileExecutionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RevisionDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RevisionTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineCountNumeric" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RelatedCatalogueReference"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReferencedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProviderParty"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiverParty"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractorCustomerParty" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TradingTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DefaultLanguage" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueItemSpecificationUpdateLine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemSpecificationUpdateType", propOrder = {
    "ublExtensions",
    "ublVersionID",
    "customizationID",
    "profileID",
    "profileExecutionID",
    "id",
    "uuid",
    "name",
    "issueDate",
    "issueTime",
    "revisionDate",
    "revisionTime",
    "note",
    "description",
    "versionID",
    "lineCountNumeric",
    "validityPeriod",
    "relatedCatalogueReference",
    "referencedContract",
    "signature",
    "providerParty",
    "receiverParty",
    "sellerSupplierParty",
    "contractorCustomerParty",
    "tradingTerms",
    "defaultLanguage",
    "catalogueItemSpecificationUpdateLine"
})
public class CatalogueItemSpecificationUpdateType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UBLVersionIDType ublVersionID;
    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomizationIDType customizationID;
    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileIDType profileID;
    @XmlElement(name = "ProfileExecutionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileExecutionIDType profileExecutionID;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDateType issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTimeType issueTime;
    @XmlElement(name = "RevisionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RevisionDateType revisionDate;
    @XmlElement(name = "RevisionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RevisionTimeType revisionTime;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VersionIDType versionID;
    @XmlElement(name = "LineCountNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineCountNumericType lineCountNumeric;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<PeriodType> validityPeriod;
    @XmlElement(name = "RelatedCatalogueReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected CatalogueReferenceType relatedCatalogueReference;
    @XmlElement(name = "ReferencedContract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<ContractType> referencedContract;
    @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<SignatureType> signature;
    @XmlElement(name = "ProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType providerParty;
    @XmlElement(name = "ReceiverParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType receiverParty;
    @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "ContractorCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected CustomerPartyType contractorCustomerParty;
    @XmlElement(name = "TradingTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected TradingTermsType tradingTerms;
    @XmlElement(name = "DefaultLanguage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected LanguageType defaultLanguage;
    @XmlElement(name = "CatalogueItemSpecificationUpdateLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<CatalogueItemSpecificationUpdateLineType> catalogueItemSpecificationUpdateLine;

    /**
     * A container for all extensions present in the document.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensionsType }
     *     
     */
    public UBLExtensionsType getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Sets the value of the ublExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensionsType }
     *     
     */
    public void setUBLExtensions(UBLExtensionsType value) {
        this.ublExtensions = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. UBL Version Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The earliest version of the UBL 2 schema for this document type that defines all of the elements that might be encountered in the current instance.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;UBL Version Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;2.0.5&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link UBLVersionIDType }
     *     
     */
    public UBLVersionIDType getUBLVersionID() {
        return ublVersionID;
    }

    /**
     * Sets the value of the ublVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLVersionIDType }
     *     
     */
    public void setUBLVersionID(UBLVersionIDType value) {
        this.ublVersionID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Customization Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Identifies a user-defined customization of UBL for a specific use.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Customization Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;NES&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIDType }
     *     
     */
    public CustomizationIDType getCustomizationID() {
        return customizationID;
    }

    /**
     * Sets the value of the customizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIDType }
     *     
     */
    public void setCustomizationID(CustomizationIDType value) {
        this.customizationID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Profile Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Identifies a user-defined profile of the subset of UBL being used.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Profile Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;BasicProcurementProcess&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ProfileIDType }
     *     
     */
    public ProfileIDType getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIDType }
     *     
     */
    public void setProfileID(ProfileIDType value) {
        this.profileID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Profile Execution Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Identifies an instance of executing a profile, to associate all transactions in a collaboration.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Profile Execution Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ProfileExecutionIDType }
     *     
     */
    public ProfileExecutionIDType getProfileExecutionID() {
        return profileExecutionID;
    }

    /**
     * Sets the value of the profileExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExecutionIDType }
     *     
     */
    public void setProfileExecutionID(ProfileExecutionIDType value) {
        this.profileExecutionID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for the Catalogue Revision assigned by the Seller.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. UUID. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A universally unique identifier for an instance of this ABIE.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;UUID&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A name given to the Catalogue Revision.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;electrical goods - new energy ratings.&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Issue Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The date when the Catalogue Revision was issued.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Issue Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link IssueDateType }
     *     
     */
    public IssueDateType getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDateType }
     *     
     */
    public void setIssueDate(IssueDateType value) {
        this.issueDate = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Issue Time. Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The time when the Catalogue Revision was issued.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Issue Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link IssueTimeType }
     *     
     */
    public IssueTimeType getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTimeType }
     *     
     */
    public void setIssueTime(IssueTimeType value) {
        this.issueTime = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Revision Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The date assigned by the Seller on which the Catalogue was revised.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Revision Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link RevisionDateType }
     *     
     */
    public RevisionDateType getRevisionDate() {
        return revisionDate;
    }

    /**
     * Sets the value of the revisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionDateType }
     *     
     */
    public void setRevisionDate(RevisionDateType value) {
        this.revisionDate = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Revision Time. Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The time assigned by the Seller at which the Catalogue was revised.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Revision Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link RevisionTimeType }
     *     
     */
    public RevisionTimeType getRevisionTime() {
        return revisionTime;
    }

    /**
     * Sets the value of the revisionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionTimeType }
     *     
     */
    public void setRevisionTime(RevisionTimeType value) {
        this.revisionTime = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Note. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Free-form text applying to the Catalogue Revision. This element may contain notes or any other similar information that is not contained explicitly in another structure.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Note&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A description of the Catalogue Revision.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;ratings based on new environmental standards for EU&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Version. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Indicates the current version of the Catalogue.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Version&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;1.1&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link VersionIDType }
     *     
     */
    public VersionIDType getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIDType }
     *     
     */
    public void setVersionID(VersionIDType value) {
        this.versionID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Line Count. Numeric&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The number of lines in the document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Line Count&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Numeric&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Numeric. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LineCountNumericType }
     *     
     */
    public LineCountNumericType getLineCountNumeric() {
        return lineCountNumeric;
    }

    /**
     * Sets the value of the lineCountNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineCountNumericType }
     *     
     */
    public void setLineCountNumeric(LineCountNumericType value) {
        this.lineCountNumeric = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Validity_ Period. Period&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The period assigned by the Seller during which the information in the Catalogue Revision is effective.  This may be given as start and end dates or a duration.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Validity&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Period&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Period&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodType>();
        }
        return this.validityPeriod;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Related_ Catalogue Reference. Catalogue Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to the Catalogue containing the revised Items.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Related&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Catalogue Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Catalogue Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReferenceType }
     *     
     */
    public CatalogueReferenceType getRelatedCatalogueReference() {
        return relatedCatalogueReference;
    }

    /**
     * Sets the value of the relatedCatalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReferenceType }
     *     
     */
    public void setRelatedCatalogueReference(CatalogueReferenceType value) {
        this.relatedCatalogueReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Referenced_ Contract. Contract&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to a framework agreement or contract.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Referenced&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Contract&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Contract&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the referencedContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractType }
     * 
     * 
     */
    public List<ContractType> getReferencedContract() {
        if (referencedContract == null) {
            referencedContract = new ArrayList<ContractType>();
        }
        return this.referencedContract;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Signature&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;One or more signatures applied to the document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Signature&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Signature&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Provider_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to the Catalogue Provider Party.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Provider&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getProviderParty() {
        return providerParty;
    }

    /**
     * Sets the value of the providerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setProviderParty(PartyType value) {
        this.providerParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Receiver_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to the Catalogue Receiver Party.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Receiver&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getReceiverParty() {
        return receiverParty;
    }

    /**
     * Sets the value of the receiverParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setReceiverParty(PartyType value) {
        this.receiverParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Seller_ Supplier Party. Supplier Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The Supplier Party responsible for the contract to which the Catalogue relates.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Seller&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Supplier Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Supplier Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Sets the value of the sellerSupplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Contractor_ Customer Party. Customer Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The Customer Party responsible for the contract to which the Catalogue relates.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Contractor&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Customer Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Customer Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    /**
     * Sets the value of the contractorCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Trading Terms&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to trading terms.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Trading Terms&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Trading Terms&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link TradingTermsType }
     *     
     */
    public TradingTermsType getTradingTerms() {
        return tradingTerms;
    }

    /**
     * Sets the value of the tradingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingTermsType }
     *     
     */
    public void setTradingTerms(TradingTermsType value) {
        this.tradingTerms = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Default_ Language. Language&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The default language for the item specifications.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Default&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Language&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Language&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setDefaultLanguage(LanguageType value) {
        this.defaultLanguage = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CatalogueItemSpecificationUpdate-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Catalogue Item Specification Update. Catalogue Item Specification Update Line&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to one or more Catalogue Item Specification Update Lines.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Catalogue Item Specification Update&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Catalogue Item Specification Update Line&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Catalogue Item Specification Update Line&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the catalogueItemSpecificationUpdateLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueItemSpecificationUpdateLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueItemSpecificationUpdateLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueItemSpecificationUpdateLineType }
     * 
     * 
     */
    public List<CatalogueItemSpecificationUpdateLineType> getCatalogueItemSpecificationUpdateLine() {
        if (catalogueItemSpecificationUpdateLine == null) {
            catalogueItemSpecificationUpdateLine = new ArrayList<CatalogueItemSpecificationUpdateLineType>();
        }
        return this.catalogueItemSpecificationUpdateLine;
    }

}
