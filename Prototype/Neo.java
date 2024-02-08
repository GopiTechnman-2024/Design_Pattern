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
public class Neo extends Game {
    public Neo()
    {
        type="Neo";
        System.out.println("Neo character created");
    }

    /**
     *
     */
    @Override
    public void render()
    {
         System.out.println("Inside Neo::render() method");
    }
}
