/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author DELL
 */
public class Point {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public String toString(){
        return "("+xPos+","+yPos+")";
    }
    
}
