/*
 * This code will need a lot of function and as follows
 
    •	Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and "red", respectively.
    •	Two overloaded constructors - a default constructor with no argument, and a constructor which takes a double argument for radius.
    •	Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.

*/

public class Circle {

    private double radius = 1.0;

    private String color = "red";

    public double getRadius () {

        return radius;

    }

    public double getArea () {

        return (Math.PI * radius * radius);

    }
    
}