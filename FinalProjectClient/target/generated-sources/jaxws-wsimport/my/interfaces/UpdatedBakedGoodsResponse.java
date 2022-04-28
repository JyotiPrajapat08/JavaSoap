
package my.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatedBakedGoodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatedBakedGoodsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdatedBakedGoods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatedBakedGoodsResponse", propOrder = {
    "updatedBakedGoods"
})
public class UpdatedBakedGoodsResponse {

    @XmlElement(name = "UpdatedBakedGoods")
    protected int updatedBakedGoods;

    /**
     * Gets the value of the updatedBakedGoods property.
     * 
     */
    public int getUpdatedBakedGoods() {
        return updatedBakedGoods;
    }

    /**
     * Sets the value of the updatedBakedGoods property.
     * 
     */
    public void setUpdatedBakedGoods(int value) {
        this.updatedBakedGoods = value;
    }

}
