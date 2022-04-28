
package my.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bakedGoods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bakedGoods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bakeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bakename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bakeprice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bakedGoods", propOrder = {
    "bakeid",
    "bakename",
    "bakeprice"
})
public class BakedGoods {

    protected int bakeid;
    protected String bakename;
    protected Double bakeprice;

    /**
     * Gets the value of the bakeid property.
     * 
     */
    public int getBakeid() {
        return bakeid;
    }

    /**
     * Sets the value of the bakeid property.
     * 
     */
    public void setBakeid(int value) {
        this.bakeid = value;
    }

    /**
     * Gets the value of the bakename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBakename() {
        return bakename;
    }

    /**
     * Sets the value of the bakename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBakename(String value) {
        this.bakename = value;
    }

    /**
     * Gets the value of the bakeprice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBakeprice() {
        return bakeprice;
    }

    /**
     * Sets the value of the bakeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBakeprice(Double value) {
        this.bakeprice = value;
    }

}
