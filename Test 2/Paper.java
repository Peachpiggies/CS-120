/*
 * I guess I have to import Scanner
 * make a while loop to loop until the 7th fold
 * then use if-else statements to check the width and the length of the paper that get from scanner
 * finally print out the processed in the loop if-else
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

        System.out.println("");

        while (fold != 7) {

            if (width > length) {

                width = width / 2;
                thickness = thickness * 2;
                fold++;

                System.out.printf("width : %s\nlength : %s\nthickness : %s\n\n", width, length, thickness);

            }

            else if (length > width)  {

                length = length / 2;
                thickness = thickness * 2;
                fold++;

                System.out.printf("width : %s\nlength : %s\nthickness : %s\n\n", width, length, thickness);

            }

        }

        System.out.printf("times to fold the paper : %s",fold);

        input.close();
         
    }
    
}
