/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory1;

/**
 *
 * @author DELL
 */
public class PrinterFriendlySquare implements PrinterFriendlyShape{

     private int xpos,ypos;
    private int radius;
   
    /**
     *
     * @param xpos
     * @param ypos
     * @param r
     */
    public PrinterFriendlySquare(int xpos,int ypos,int r)
    {
        this.radius=radius;
        this.xpos=xpos;
        this.ypos=ypos;
    }
   @Override
    public void draw() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
