/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype1;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class ShapeCache {
    private static HashMap<String,Shape>shapeMap=new HashMap<>();
    public static Shape getShape(String shapeId)
    {
        Shape cachedShape=shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }
    public static void loadCache()
    {
        System.out.print("Startin Objects creation and caching");
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
        System.out.print("Objects creation and caching completed");
    }
}
