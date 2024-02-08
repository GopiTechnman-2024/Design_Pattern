/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory2;

/**
 *
 * @author DELL
 */
public class DisplayFriendlyRectangle implements DisplayFriendlyShape{
    public DisplayFriendlyRectangle(int length,int height)
    {
        this.length=length;
        this.height=height;
          System.out.print("DisplayFriendlyRectangle constructor");
    }
    private int length,height;

    @Override
    public void draw() {
         System.out.print("DisplayFriendlyRectangle draw()");
    }
    
}
