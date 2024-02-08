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
public class AgentSmith extends Game{
     public AgentSmith()
    {
        type="AgentSmith";
        System.out.println("AgentSmith character created");
    }

    /**
     *
     */
    @Override
    public void render()
    {
         System.out.println("Inside AgentSmith::render() method");
    }
}
