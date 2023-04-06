/*

    - prompts user for a radius (in double) and compute the area and circumference of the circle rounded to 2 decimal places.

    - import scaner for recieving data from key board
    - also form a variable for radius
    - make a circle area and circumference formular then use %.2f to get only the hundreth of the product.
    - print the output using printf

*/

import java.util.Scanner;

public class CircleComputation {

    public static void main(String[] args) {

        float radius;
        final double π = 22/7, area, circumference;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        radius = in.nextFloat();

        area = π * radius * radius;
        circumference = 2 * π * radius;

        System.out.printf("The area is :  %.2f \nThe circumference is : %.2f", area, circumference);

        in.close();

    }
    
}