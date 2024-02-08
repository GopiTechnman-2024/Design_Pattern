/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author DELL
 */
public class Test {
public static void main(String []s) {
Circle circle = new Circle(10, 10, 20);
System.out.println(circle);
circle.setCanvas(new Canvas());
circle.setShapeArchiver(new ShapeArchiver());
circle.setRadius(50);
System.out.println(circle);
}
}

