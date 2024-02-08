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
public class PrinterFriendlyFactory implements ShapeFactory{
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
                return new PrinterFriendlyCircle(10,10,20);
            case "Rectangle":
                return new PrinterFriendlyRectangle(10,20);
        }
        return null;
    }
}
