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
public class Test {
    public static void main(String[] args) {
        Canvas canvas=new Canvas();
        canvas.addNewShape("Circle","DisplayFriendly");
        canvas.addNewShape("Rectangle","DisplayFriendly");
        canvas.redraw();
    }
}
