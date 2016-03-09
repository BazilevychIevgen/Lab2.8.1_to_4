package edu.brainacad;

/**
 * Created by Admin on 09.03.2016.
 */
public abstract class Shape implements Drawable {
    private String shapeColor;
    private String shapeName;


    public Shape(String shapeName, String shapeColor) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;

    }

    public String getShapeName() {
        return shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }



    @Override
    public String toString() {
        return "This is " + shapeName + ",color is: "
                + shapeColor;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this + ", area is: " + calcArea());
    }
}
