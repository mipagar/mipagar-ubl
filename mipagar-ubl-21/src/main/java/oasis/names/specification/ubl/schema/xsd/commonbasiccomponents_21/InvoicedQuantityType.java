
package oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21.QuantityType;


/**
 * <p>Java class for InvoicedQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicedQuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2>QuantityType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicedQuantityType")
public class InvoicedQuantityType extends QuantityType {

    public InvoicedQuantityType() {
    }

    public InvoicedQuantityType(BigDecimal quantity) {
        value = quantity;
    }

}
