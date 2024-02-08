/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author DELL
 */
public class Rectangle implements Shape{
    
    @Override
    public void draw() {
    System.out.println("Square draw()");
    }

    
    @Override
    public void fillColor() {
        System.out.println("Square fillColor()");
    }

    public Rectangle(int length,int height) {
        this.length = length;
        this.height=height;
    }
    private int length,height;
    
}
