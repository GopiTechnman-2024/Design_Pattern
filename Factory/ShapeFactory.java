/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author DELL
 */
public class ShapeFactory {
    public static Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle": 
                return new Circle(10,10,20);
            case "Rectangle": 
                return new Rectangle(10,20);
        }
        return null;
    }
}
