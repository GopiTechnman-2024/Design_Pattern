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

public class Circle extends
        Observable {

    private Point center;

    public void setCenter(Point center) {
        this.center = center;
        setChanged();
        notifyObservers(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
        setChanged();
        notifyObservers(this);
    }
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
}
}
