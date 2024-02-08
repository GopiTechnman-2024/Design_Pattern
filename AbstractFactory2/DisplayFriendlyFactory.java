/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory2;

/**
 *
 * @author DELL
 */
public class DisplayFriendlyFactory implements ShapeFactory{
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
                return new DisplayFriendlyCircle(10,10,20);
            case "Rectangle":
                return new DisplayFriendlyRectangle(10,20);
        }
        return null;
    }
}
