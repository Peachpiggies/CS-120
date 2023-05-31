/*
 * import Scanner to import data from keyboard
 * make a recursive function that calculate the Tribonacci
 * print out in the main function
*/

import java.util.Scanner;

public class Tribonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which Tribonacci number do you want to display?");
        int number = input.nextInt();

        System.out.println(calculate(number));

        input.close();

    }

    public static int calculate(int sequence) {

        if (sequence == 0) {

            return 0;

        }

        else if (sequence == 1 || sequence == 2) {

            return 1;

        }

        else {

            return calculate(sequence - 1) + calculate(sequence - 2) + calculate(sequence - 3);

        }

    }
    
}