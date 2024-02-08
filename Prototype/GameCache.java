/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class GameCache {
    private static HashMap<String,Game>GameMap=new HashMap<>();
    public static Game getGame(String GameId) throws CloneNotSupportedException
    {
       Game cachedGame=GameMap.get(GameId);
       return (Game)cachedGame.clone();
    }
    public static void loadCache()
    {
        System.out.println("Starting object creation and caching");
        
        Neo neo=new Neo();
        neo.setId("1");
        GameMap.put(neo.getId(),neo);
        
        Morpheus morpheus=new Morpheus();
        morpheus.setId("2");
        GameMap.put(morpheus.getId(),morpheus);
        
        AgentSmith agentsmith=new AgentSmith();
        agentsmith.setId("3");
        GameMap.put(agentsmith.getId(),agentsmith);
         System.out.println("Objects creation and caching completed");
    }
    
}
