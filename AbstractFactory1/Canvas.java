/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class Canvas {
    private final ArrayList<Shape>shapeList=new ArrayList<>();
    public void addNewShape(String objecttype,String shapetype)
    {
        Shape shape=null;
        switch(objecttype)
        {
            case "DisplayFriendly":
                shape=new DisplayFriendlyFactory().getShape(shapetype);
                break;
            case "PrinterFriendly":
                shape=new PrinterFriendlyFactory().getShape(shapetype);
                break;
        }
        shapeList.add(shape);
        
    }
    public void redraw()
    {
        Iterator<Shape>itr=shapeList.iterator();
        while(itr.hasNext())
        {
            Shape shape=itr.next();
            shape.draw();
        }
    }
}
