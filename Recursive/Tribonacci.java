/*
 * import Scanner to import data from keyboard
 * make a recursive function that calculate the Tribonacci
 * print out in the main function
*/

import java.util.Scanner;

import javax.sound.midi.Sequence;

public class Tribonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which Tribonacci number do you want to display?");
        int number = input.nextInt();

        System.out.println(calculate(number));

        input.close();

    }

    public static int calculate(int number) {

        if (number == 0) {

            return 0;

        }

        else if (number == 1 || number == 2) {

            return 1;

        }

        else {

            return calculate(number - 1) + calculate(number - 2) + calculate(number - 3);

        }

    }
    
}