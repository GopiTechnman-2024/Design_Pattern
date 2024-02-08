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
public class DisplayFriendlyCircle implements DisplayFriendlyShape{
    private int xpos,ypos;
    private int radius;
    public DisplayFriendlyCircle(int x,int y,int r)
    {
        xpos=x;
        ypos=y;
        radius=r;
        System.out.print("DisplayFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.print("PrinterFriendlyCircle draw()");
    }
}
