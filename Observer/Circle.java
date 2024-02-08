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
public class Circle {

    private Point center;
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public void setCenter(Point center) {
        this.center = center;
        canvas.update(this);
        shapeArchiver.update(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
        canvas.update(this);
        shapeArchiver.update(this);
    }
    private ShapeArchiver shapeArchiver;

    public void
            setShapeArchiver(ShapeArchiver shapeArchiver) {
        this.shapeArchiver
                = shapeArchiver;
    }
    protected Canvas canvas;

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }
}
