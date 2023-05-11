/*
 * I guess I have to import Scanner
 * 
*/

import java.util.Scanner;

public class Paper {

    public static void main(String[] args) {

        int fold = 0,
            width,
            length;

        float thickness;

        Scanner input = new Scanner(System.in);
        System.out.println("Input the width : ");
        width = input.nextInt();

        System.out.println("Input the length : ");
        length = input.nextInt();

        System.out.println("Input the thickness : ");
        thickness = input.nextFloat();

        while (fold != 7) {

            if (width > length) {

                width = width / 2;
                thickness = thickness * 2;
                fold++;

            }

            else if (length > width)  {

                length = length / 2;
                thickness = thickness * 2;
                fold++;

            }

            //else if () {}

        }

        System.out.print(fold);
         
    }
    
}
