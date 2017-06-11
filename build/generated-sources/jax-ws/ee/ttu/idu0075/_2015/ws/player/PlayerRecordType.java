
package ee.ttu.idu0075._2015.ws.player;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playerRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playerRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="appearances" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="goals" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="assists" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="recordCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="playerStatusList" type="{http://www.ttu.ee/idu0075/2015/ws/player}playerStatusListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playerRecordType", propOrder = {
    "id",
    "appearances",
    "goals",
    "assists",
    "recordCode",
    "playerStatusList"
})
public class PlayerRecordType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected BigInteger appearances;
    @XmlElement(required = true)
    protected BigInteger goals;
    @XmlElement(required = true)
    protected BigInteger assists;
    @XmlElement(required = true)
    protected BigInteger recordCode;
    @XmlElement(required = true)
    protected PlayerStatusListType playerStatusList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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

    /**
     * Gets the value of the playerStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerStatusListType }
     *     
     */
    public PlayerStatusListType getPlayerStatusList() {
        return playerStatusList;
    }

    /**
     * Sets the value of the playerStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerStatusListType }
     *     
     */
    public void setPlayerStatusList(PlayerStatusListType value) {
        this.playerStatusList = value;
    }

}


