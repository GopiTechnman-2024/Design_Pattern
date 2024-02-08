/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverSun;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sun sun=new Sun((float) 10.2);
        System.out.println("Angle of sun is="+sun);
        sun.addObserver(new Building());
        System.out.println("Change angle to 10.5");
        sun.setAngle((float) 10.5);
        System.out.println("Sun:"+sun);
    }
    
}
