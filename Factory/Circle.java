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
public class Circle implements Shape {
     private int xPos,yPos;
private int radius;
    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }
   
     
     @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    
     @Override
    public void fillColor() {
          System.out.println("Circle fillColor()");
    }
}
