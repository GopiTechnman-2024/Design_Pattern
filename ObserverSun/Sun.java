/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_gopi;

import java.util.Observable;

/**
 *
 * @author DELL
 */
public class Sun extends Observable{
    
    private float angle;
    
    public void setAngle(float angle)
    {
        this.angle=angle;
        setChanged();
        notifyObservers(this);
    }
    
    public Sun(float a)
    {
        angle=a;
    }
    
    @Override
    public String toString()
    {
        return "Angle= "+angle;
    }
}
