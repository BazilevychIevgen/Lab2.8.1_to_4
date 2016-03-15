package edu.brainacad;

/**
 * Created by Admin on 09.03.2016.
 */
public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle(String shapeName, String shapeColor, double a, double b, double c) {
        super(shapeName, shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "This is " + this.getShapeName()+ ","+ // use withiout this keyword
                "color is:" + this.getShapeColor()+ ", a = " + getA() + ", b = "+ getB()+ ", c = "+getC();
    }

    @Override
    public double calcArea() {
        double s = (getA() + getB()+getC())/2;
        double area =Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));

        return area;
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle)o;
        if(this.calcArea()>triangle.calcArea())return 1;
        if(this.calcArea()<triangle.calcArea())return -1;
        return 0;
    }
}
