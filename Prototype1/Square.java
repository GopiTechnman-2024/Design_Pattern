/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype1;

/**
 *
 * @author DELL
 */
public class Square extends Shape{
   
    public Square()
    {
        type="Square";
        System.out.println("Square object created");
    }
    @Override
    public void draw()
    {
        System.out.println("Inside Square");
    }

}
