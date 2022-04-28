
package my.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertBakedGoodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertBakedGoodsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insertBakedGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertBakedGoodsResponse", propOrder = {
    "insertBakedGoods"
})
public class InsertBakedGoodsResponse {

    protected String insertBakedGoods;

    /**
     * Gets the value of the insertBakedGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertBakedGoods() {
        return insertBakedGoods;
    }

    /**
     * Sets the value of the insertBakedGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertBakedGoods(String value) {
        this.insertBakedGoods = value;
    }

}
