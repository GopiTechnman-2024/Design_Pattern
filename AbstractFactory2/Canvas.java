/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class Canvas {
    private ArrayList<Shape>shapeList=new ArrayList<Shape>();
    public void addNewShape(String shapeType,String objectType)
    {
        Shape shape=null;
        switch(objectType)
        {
            case "DisplayFriendly":
                shape=new DisplayFriendlyFactory().getShape(shapeType);
                break;
            case "PrinterFriendly":
                shape=new PrinterFriendlyFactory().getShape(shapeType);
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
