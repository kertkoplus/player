/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.player;

import ee.ttu.idu0075._2015.ws.player.AddPlayerRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerListRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerListResponse;
import ee.ttu.idu0075._2015.ws.player.GetPlayerRequest;
import ee.ttu.idu0075._2015.ws.player.PlayerType;
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
@Path("players")
public class PlayersResource {

    @Context
    private UriInfo context;

    
    public PlayersResource() {
    }

    
    @GET
    @Produces("application/json")
    public GetPlayerListResponse getPlayerList(@QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        GetPlayerListRequest request = new GetPlayerListRequest();
        request.setToken(token);
        return pws.getPlayerList(request);
    }
    
    @GET
    @Path("{id: \\d+}") //Supports digits only
    @Produces("application/json")
    public PlayerType getPlayer(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        GetPlayerRequest request = new GetPlayerRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return pws.getPlayer(request);
    }

    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PlayerType addPlayer (PlayerType content,
                            @QueryParam("token") String token) {
        PlayerWebService pws = new PlayerWebService();
        AddPlayerRequest request = new AddPlayerRequest();
        request.setToken(token);
        request.setName(content.getName());
        request.setAge(content.getAge());
        request.setClub(content.getClub());
        request.setPosition(content.getPosition());
        request.setNationality(content.getNationality());
        return pws.addPlayer(request);
    }
}
