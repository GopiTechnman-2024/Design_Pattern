/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;


import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author DELL
 */
public class Canvas {
    private final ArrayList<Shape>shapeList=new ArrayList<>();
    public void addNewShape(String shapeType)
    {
       Shape shape=ShapeFactory.getShape(shapeType);
//          System.out.println("dgbh");
       shapeList.add(shape);
    }
    
    
    public void redraw()
    {
        Iterator<Shape>itr=shapeList.iterator();
        while(itr.hasNext())
        {
//            System.out.println("dgbh");
           Shape shape=itr.next();
          shape.draw();
        }
    }
    
    
    public static void main(String[] args)
    {
//       System.out.println("sg");
        Canvas c=new Canvas();
        c.addNewShape("Circle");
        c.addNewShape("Rectangle");
        c.redraw();
    }
}
