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
public class Rectangle extends Shape{
    public Rectangle()
    {
        type="Rectangle";
        System.out.println("Rectangle object created");
    }
    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle");
    }

}
