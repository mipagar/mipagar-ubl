
package oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21.AmountType;


/**
 * <p>Java class for PayableAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayableAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2>AmountType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayableAmountType")
public class PayableAmountType extends AmountType {

    public PayableAmountType() {
    }

    public PayableAmountType(BigDecimal amount, String currencyID) {
        this.value = amount;
        this.currencyID = currencyID;
    }
}
