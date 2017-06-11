/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.player;

import ee.ttu.idu0075._2015.ws.player.AddPlayerRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.AddRecordRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.GetRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.GetRecordListResponse;
import ee.ttu.idu0075._2015.ws.player.GetRecordRequest;
import ee.ttu.idu0075._2015.ws.player.PlayerRecordType;
import ee.ttu.idu0075._2015.ws.player.PlayerStatusListType;
import ee.ttu.idu0075._2015.ws.player.PlayerStatusType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Kert-PC
 */
@Path("playerRecords")
public class PlayerRecordsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PlayerRecordsResource
     */
    public PlayerRecordsResource() {
    }

    
    @GET
    @Produces("application/json")
    public GetRecordListResponse getRecordList(@QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        GetRecordListRequest request = new GetRecordListRequest();
        request.setToken(token);
        return pws.getRecordList(request);
    }
    
     @GET
    @Path("{id: \\d++}")
    @Produces("application/json")
    public PlayerRecordType getRecord(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        GetRecordRequest request = new GetRecordRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return pws.getRecord(request);
    }
    
    @GET
    @Path("{id :\\d++}/playerrecordlist")
    @Produces("application/json")
    public PlayerStatusListType getPlayerRecordList(@PathParam ("id") String id,
            @QueryParam("token") String token){
        PlayerWebService pws = new PlayerWebService();
        GetPlayerRecordListRequest request = new GetPlayerRecordListRequest();
        request.setRecordId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return pws.getPlayerRecordList(request);
    }
   

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PlayerRecordType addRecord(PlayerRecordType records,
            @QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        AddRecordRequest request = new AddRecordRequest();
        request.setToken(token);
        request.setAppearances(records.getAppearances());
        request.setRecordCode(records.getRecordCode());
        request.setAssists(records.getAssists());
        request.setGoals(records.getGoals());
        return pws.addRecord(request);
    }
    
    @POST
    @Path("{recordId : \\d+}/players/{playerId : \\d+}")
    @Consumes("application/json")
    @Produces("application/json")
    public PlayerStatusType addPlayerRecordList(PlayerStatusType records,
            @QueryParam("token") String token,
            @PathParam("recordId") String recordId,
            @PathParam("playerId") String playerId
            ){
        PlayerWebService pws = new PlayerWebService();
        AddPlayerRecordListRequest request = new AddPlayerRecordListRequest();
        request.setToken(token);
        request.setRating((records.getPlayerRaiting()).intValue());
        request.setPlayerId(BigInteger.valueOf(Integer.parseInt(playerId)));
        request.setRecordId(BigInteger.valueOf(Integer.parseInt(recordId)));
        return pws.addPlayerRecordList(request);
    }
}
