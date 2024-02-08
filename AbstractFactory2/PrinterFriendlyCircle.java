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
public class PrinterFriendlyCircle implements PrinterFriendlyShape{
    private int xpos,ypos;
    private int radius;
    public PrinterFriendlyCircle(int x,int y,int r)
    {
        xpos=x;
        ypos=y;
        radius=r;
        System.out.print("PrinterFriendlyCircle constructor");
    }
    public void draw()
    {
        System.out.print("PrinterFriendlyRectangle draw()");
    }
}
