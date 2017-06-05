
package ee.ttu.idu0075._2015.ws.player;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appearances" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="goals" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="assists" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="recordCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "appearances",
    "goals",
    "assists",
    "recordCode"
})
@XmlRootElement(name = "addRecordRequest")
public class AddRecordRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected BigInteger appearances;
    @XmlElement(required = true)
    protected BigInteger goals;
    @XmlElement(required = true)
    protected BigInteger assists;
    @XmlElement(required = true)
    protected BigInteger recordCode;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the appearances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppearances() {
        return appearances;
    }

    /**
     * Sets the value of the appearances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppearances(BigInteger value) {
        this.appearances = value;
    }

    /**
     * Gets the value of the goals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoals() {
        return goals;
    }

    /**
     * Sets the value of the goals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoals(BigInteger value) {
        this.goals = value;
    }

    /**
     * Gets the value of the assists property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssists() {
        return assists;
    }

    /**
     * Sets the value of the assists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssists(BigInteger value) {
        this.assists = value;
    }

    /**
     * Gets the value of the recordCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordCode() {
        return recordCode;
    }

    /**
     * Sets the value of the recordCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordCode(BigInteger value) {
        this.recordCode = value;
    }

}
