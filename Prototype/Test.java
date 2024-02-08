/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameCache.loadCache();
        Game clonedGame1=(Game)GameCache.getGame("1");
         System.out.println("Game:"+clonedGame1.getType());
         
         Game clonedGame2=(Game)GameCache.getGame("2");
         System.out.println("Game:"+clonedGame2.getType());
         
         Game clonedGame3=(Game)GameCache.getGame("3");
         System.out.println("Game:"+clonedGame3.getType());
    
    }
}
