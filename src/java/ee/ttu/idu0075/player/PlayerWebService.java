/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.player;

import ee.ttu.idu0075._2015.ws.player.AddPlayerRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.AddPlayerRequest;
import ee.ttu.idu0075._2015.ws.player.AddRecordRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerListRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerListResponse;
import ee.ttu.idu0075._2015.ws.player.GetPlayerRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.GetPlayerRequest;
import ee.ttu.idu0075._2015.ws.player.GetRecordListRequest;
import ee.ttu.idu0075._2015.ws.player.GetRecordListResponse;
import ee.ttu.idu0075._2015.ws.player.GetRecordRequest;
import ee.ttu.idu0075._2015.ws.player.PlayerRecordType;
import ee.ttu.idu0075._2015.ws.player.PlayerStatusListType;
import ee.ttu.idu0075._2015.ws.player.PlayerStatusType;
import ee.ttu.idu0075._2015.ws.player.PlayerType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Kert-PC
 */
@WebService(serviceName = "PlayerService", portName = "PlayerPort", endpointInterface = "ee.ttu.idu0075._2015.ws.player.RecordPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/player", wsdlLocation = "WEB-INF/wsdl/PlayerWebService/PlayerService.wsdl")
public class PlayerWebService {
    
    private static int nextPlayerId = 1;
        static List<PlayerType> playerList = new ArrayList<PlayerType>();
        private static int nextRecordId = 1;
        static List<PlayerRecordType> recordList = new ArrayList<PlayerRecordType>();

    public PlayerType getPlayer(GetPlayerRequest parameter) {
        PlayerType pt = null;
        if (parameter.getToken().equalsIgnoreCase("salastatud")){
            for (int i =0; i < playerList.size(); i++){
                if(playerList.get(i).getId().equals(parameter.getId())){
                    pt = playerList.get(i);
    }
            }
        }
        return pt;
        
        
    }

    public PlayerType addPlayer(AddPlayerRequest parameter) {
        PlayerType pt = new PlayerType();
    if (parameter.getToken().equalsIgnoreCase("salastatud")){
        pt.setClub(parameter.getClub());
        pt.setPosition(parameter.getPosition());
        pt.setName(parameter.getName());
        pt.setAge(parameter.getAge());
        pt.setNationality(parameter.getNationality());
        pt.setId(BigInteger.valueOf(nextPlayerId++));
        playerList.add(pt);
        return pt;
            }
    return pt;
    }

    public GetPlayerListResponse getPlayerList(GetPlayerListRequest parameter) {
        GetPlayerListResponse response = new GetPlayerListResponse();
        if (parameter.getToken().equalsIgnoreCase("salastatud")) {
            for (PlayerType playerType : playerList) {
                response.getPlayer().add(playerType);
            }
        }
        return response;
    }

    public PlayerRecordType getRecord(GetRecordRequest parameter) {
        PlayerRecordType prt = null;
            if (parameter.getToken().equalsIgnoreCase("salastatud")){
                for (int i = 0; i < recordList.size(); i++){
                    if (recordList.get(i).getId().equals(parameter.getId())){
                        prt = recordList.get(i);
                        }
                    }
            }
        return prt;
    }

    public PlayerRecordType addRecord(AddRecordRequest parameter) {
        PlayerRecordType prt = new PlayerRecordType();
    if (parameter.getToken().equalsIgnoreCase("salastatud")){
        for (int i = 0; i < recordList.size(); i++){
            PlayerRecordType current = recordList.get(i);
            if(current.getRecordCode().equals(parameter.getRecordCode())){
                return current;
            }
        }
        prt.setAppearances(parameter.getAppearances());
        prt.setAssists(parameter.getAssists());
        prt.setGoals(parameter.getGoals());
        prt.setId(BigInteger.valueOf(nextRecordId++));
        prt.setRecordCode(parameter.getRecordCode());
        prt.setPlayerStatusList(new PlayerStatusListType());
        recordList.add(prt);
        return prt;
        }
    return prt;
    }

    public GetRecordListResponse getRecordList(GetRecordListRequest parameter) {
        GetRecordListResponse response = new GetRecordListResponse();
        if (parameter.getToken().equalsIgnoreCase("salastatud")){
            for (PlayerRecordType recordType : recordList){
                response.getStatus().add(recordType);
            }
        }
        return response;
    }

    public PlayerStatusListType getPlayerRecordList(GetPlayerRecordListRequest parameter) {
         PlayerStatusListType pslt = new PlayerStatusListType();
        if (parameter.getToken().equalsIgnoreCase("salastatud")){
            PlayerRecordType record;
            record = getRecord(parameter.getRecordId());
            pslt = record.getPlayerStatusList();
        }
        return pslt;
    }

    public PlayerStatusType addPlayerRecordList(AddPlayerRecordListRequest parameter) {
        PlayerStatusType pst = new PlayerStatusType();
    if(parameter.getToken().equalsIgnoreCase("salastatud")){
        pst.setPlayer(getPlayer(parameter.getPlayerId()));
        pst.setPlayerRaiting(BigInteger.valueOf(parameter.getRating()));
        PlayerRecordType record = getRecord(parameter.getRecordId());
        if(record !=null && pst.getPlayer() != null){
            if(record.getPlayerStatusList()== null){
                record.setPlayerStatusList(new PlayerStatusListType());
                }
            record.getPlayerStatusList().getPlayerStatus().add(pst);
            }
        }
    return pst;
    }
    
    private PlayerRecordType getRecord(BigInteger id){
    PlayerRecordType prt = null;
    for (PlayerRecordType record : recordList){
        if (record.getId().equals(id)){
            prt = record;
	}
    }
    return prt;
}

private PlayerType getPlayer(BigInteger id){
    PlayerType pt = null;
    for(PlayerType player: playerList){
        if(player.getId().equals(id)){
            pt = player;
           }
        }
    return pt;
    } 
    
}
