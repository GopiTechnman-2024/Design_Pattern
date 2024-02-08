/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_newmethod;

/**
 *
 * @author DELL
 */
import java.util.Observable;
import java.util.Observer;
public class Canvas implements Observer {
@Override
public void update(Observable arg0, Object arg1) {
System.out.println("Canvas::update");
Circle c=(Circle)arg1;
System.out.println("In Canvas::update, circle = "+c);
}
}
