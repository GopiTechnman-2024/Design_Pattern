/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverSun;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author DELL
 */
public class Building implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Building::update");
        Sun c=(Sun)arg;
        System.out.println("In Building::update,Sun="+c);
    }
    
}
