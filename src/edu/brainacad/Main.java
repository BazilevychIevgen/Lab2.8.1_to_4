package edu.brainacad;

import java.util.Arrays;

/**
 * Created by Admin on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Shape[] arr = {new Rectangle("Rectangle1","Black",25.0,35.5),new Rectangle("Rectangle2","Rose",15,30),new Rectangle("Rectangle3","Gold",12,25),
                new Rectangle("Rectangle4","Silver",10,23),new Rectangle("Rectangle5","Yellow",8,16), new Circle("Circle1","Platinum",16.8),new Circle("Circle2","White",25.5),
                new Triangle("Triangle1","Rose",12.5,9.5,9.5),new Triangle("Triangle2","Silver",12,54,54.5)};


        for(Shape b: arr){

            b.draw();

        }

        System.out.println("******************************");
        Rectangle rect1 = new Rectangle("Rectangle1","Blue",14,25);
        Rectangle rect2 = new Rectangle("Rectangle2","White",14,25);

        System.out.println(rect1.compareTo(rect2));

        System.out.println("*******************************");
        Rectangle[]arr2 = {new Rectangle("Rectangle","black",12.0,20.0),new Rectangle("Rectangle2","black",12.0,25.0),
                new Rectangle("Rectangle3","black",22.0,45.0), new Rectangle("Rectangle4","black",20.0,40.0), new Rectangle("Rectangle5","black",25.0,60.0),
                new Rectangle("Rectangle6","black",20.0,80.0)};

        Arrays.sort(arr2);

        for(Rectangle m:arr2){
            m.draw();
        }

    }
}
