
package my.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllBakedGoodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllBakedGoodsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BakedGoodsList" type="{http://interfaces.my/}bakedGoods" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllBakedGoodsResponse", propOrder = {
    "bakedGoodsList"
})
public class GetAllBakedGoodsResponse {

    @XmlElement(name = "BakedGoodsList")
    protected List<BakedGoods> bakedGoodsList;

    /**
     * Gets the value of the bakedGoodsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bakedGoodsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBakedGoodsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BakedGoods }
     * 
     * 
     */
    public List<BakedGoods> getBakedGoodsList() {
        if (bakedGoodsList == null) {
            bakedGoodsList = new ArrayList<BakedGoods>();
        }
        return this.bakedGoodsList;
    }

}
