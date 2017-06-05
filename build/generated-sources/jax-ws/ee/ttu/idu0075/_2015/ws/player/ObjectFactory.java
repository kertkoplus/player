
package ee.ttu.idu0075._2015.ws.player;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.player package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPlayerResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "getPlayerResponse");
    private final static QName _AddPlayerResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "addPlayerResponse");
    private final static QName _GetRecordResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "getRecordResponse");
    private final static QName _AddRecordResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "addRecordResponse");
    private final static QName _GetPlayerRecordListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "getPlayerRecordListResponse");
    private final static QName _AddPlayerRecordListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/player", "addPlayerRecordListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.player
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPlayerRequest }
     * 
     */
    public GetPlayerRequest createGetPlayerRequest() {
        return new GetPlayerRequest();
    }

    /**
     * Create an instance of {@link PlayerType }
     * 
     */
    public PlayerType createPlayerType() {
        return new PlayerType();
    }

    /**
     * Create an instance of {@link AddPlayerRequest }
     * 
     */
    public AddPlayerRequest createAddPlayerRequest() {
        return new AddPlayerRequest();
    }

    /**
     * Create an instance of {@link GetPlayerListRequest }
     * 
     */
    public GetPlayerListRequest createGetPlayerListRequest() {
        return new GetPlayerListRequest();
    }

    /**
     * Create an instance of {@link GetPlayerListResponse }
     * 
     */
    public GetPlayerListResponse createGetPlayerListResponse() {
        return new GetPlayerListResponse();
    }

    /**
     * Create an instance of {@link GetRecordRequest }
     * 
     */
    public GetRecordRequest createGetRecordRequest() {
        return new GetRecordRequest();
    }

    /**
     * Create an instance of {@link PlayerRecordType }
     * 
     */
    public PlayerRecordType createPlayerRecordType() {
        return new PlayerRecordType();
    }

    /**
     * Create an instance of {@link AddRecordRequest }
     * 
     */
    public AddRecordRequest createAddRecordRequest() {
        return new AddRecordRequest();
    }

    /**
     * Create an instance of {@link GetRecordListRequest }
     * 
     */
    public GetRecordListRequest createGetRecordListRequest() {
        return new GetRecordListRequest();
    }

    /**
     * Create an instance of {@link GetRecordListResponse }
     * 
     */
    public GetRecordListResponse createGetRecordListResponse() {
        return new GetRecordListResponse();
    }

    /**
     * Create an instance of {@link GetPlayerRecordListRequest }
     * 
     */
    public GetPlayerRecordListRequest createGetPlayerRecordListRequest() {
        return new GetPlayerRecordListRequest();
    }

    /**
     * Create an instance of {@link PlayerStatusListType }
     * 
     */
    public PlayerStatusListType createPlayerStatusListType() {
        return new PlayerStatusListType();
    }

    /**
     * Create an instance of {@link AddPlayerRecordListRequest }
     * 
     */
    public AddPlayerRecordListRequest createAddPlayerRecordListRequest() {
        return new AddPlayerRecordListRequest();
    }

    /**
     * Create an instance of {@link PlayerStatusType }
     * 
     */
    public PlayerStatusType createPlayerStatusType() {
        return new PlayerStatusType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "getPlayerResponse")
    public JAXBElement<PlayerType> createGetPlayerResponse(PlayerType value) {
        return new JAXBElement<PlayerType>(_GetPlayerResponse_QNAME, PlayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "addPlayerResponse")
    public JAXBElement<PlayerType> createAddPlayerResponse(PlayerType value) {
        return new JAXBElement<PlayerType>(_AddPlayerResponse_QNAME, PlayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "getRecordResponse")
    public JAXBElement<PlayerRecordType> createGetRecordResponse(PlayerRecordType value) {
        return new JAXBElement<PlayerRecordType>(_GetRecordResponse_QNAME, PlayerRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "addRecordResponse")
    public JAXBElement<PlayerRecordType> createAddRecordResponse(PlayerRecordType value) {
        return new JAXBElement<PlayerRecordType>(_AddRecordResponse_QNAME, PlayerRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "getPlayerRecordListResponse")
    public JAXBElement<PlayerStatusListType> createGetPlayerRecordListResponse(PlayerStatusListType value) {
        return new JAXBElement<PlayerStatusListType>(_GetPlayerRecordListResponse_QNAME, PlayerStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/player", name = "addPlayerRecordListResponse")
    public JAXBElement<PlayerStatusType> createAddPlayerRecordListResponse(PlayerStatusType value) {
        return new JAXBElement<PlayerStatusType>(_AddPlayerRecordListResponse_QNAME, PlayerStatusType.class, null, value);
    }

}
