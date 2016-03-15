package edu.brainacad;

/**
 * Created by Admin on 09.03.2016.
 */
public class Circle extends Shape implements Comparable{
    private double radius;

    public Circle (String name, String shapeColor, double radius){
        super(name,shapeColor);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        double area = Math.PI* Math.pow(getRadius(),2); //can get value directly without method invoke

        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.getShapeName()+ ","+
                "color is:" + this.getShapeColor()+ ", radius = " +
                getRadius();
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if(this.calcArea()>circle.calcArea())return 1;
        if(this.calcArea()<circle.calcArea()) return -1;
        return 0;
    }
}
