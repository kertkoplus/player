
package ee.ttu.idu0075._2015.ws.player;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playerStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playerStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="player" type="{http://www.ttu.ee/idu0075/2015/ws/player}playerType"/&gt;
 *         &lt;element name="playerRaiting" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playerStatusType", propOrder = {
    "player",
    "playerRaiting"
})
public class PlayerStatusType {

    @XmlElement(required = true)
    protected PlayerType player;
    @XmlElement(required = true)
    protected BigInteger playerRaiting;

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerType }
     *     
     */
    public PlayerType getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerType }
     *     
     */
    public void setPlayer(PlayerType value) {
        this.player = value;
    }

    /**
     * Gets the value of the playerRaiting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerRaiting() {
        return playerRaiting;
    }

    /**
     * Sets the value of the playerRaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerRaiting(BigInteger value) {
        this.playerRaiting = value;
    }

}
