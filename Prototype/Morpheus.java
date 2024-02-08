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
public class Morpheus extends Game {
     public Morpheus()
    {
        type="Morpheus";
        System.out.println("Morpheus character created");
    }

    /**
     *
     */
    @Override
    public void render()
    {
         System.out.println("Inside Morpheus::render() method");
    }
}
