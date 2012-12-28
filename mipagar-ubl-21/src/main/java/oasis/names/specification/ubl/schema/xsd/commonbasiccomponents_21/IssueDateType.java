
package oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_21.DateType;


/**
 * <p>Java class for IssueDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueDateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2>DateType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueDateType")
public class IssueDateType extends DateType {

    public IssueDateType() {
    }

    public IssueDateType(XMLGregorianCalendar calendar) {
        this.value = calendar;
    }


}
