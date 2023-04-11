/*

  * Modify the above exercise. The program shall repeatedly prompt for the radius, until the user enters -1.

  - import scaner for recieving data from key board
  - also form a variable for radius
  - make a circle area and circumference formular then use %.2f to get only the hundreth of the product.
  - make a while loop until -1 will be enter in the input
  - print the output using printf

*/

import java.util.Scanner;

public class CircleComputation2 {

    public static void main(String[] args) {

        double radius, π = 22/7, area, circumference;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        radius = in.nextDouble();

        area = π * radius * radius;
        circumference = 2 * π * radius;

        while (radius != -1) {

            System.out.printf("The area is :  %.2f \nThe circumference is : %.2f", area, circumference);

            System.out.println("\n\nEnter the radius : ");
            radius = in.nextDouble();

            area = π * radius * radius;
            circumference = 2 * π * radius;

        }

        in.close();

    }
    
}