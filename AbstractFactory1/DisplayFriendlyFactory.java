/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory1;

/**
 *
 * @author DELL
 */
public class DisplayFriendlyFactory {
    public Shape getShape(String sourcetype)
    {
      switch(sourcetype)
      {
          case "Circle":
              new DisplayFriendlyCircle(10,10,20);
           case "Square":
              new DisplayFriendlySquare(10,10,20);
      }
      return null;
    }
    
}
