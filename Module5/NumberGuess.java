/*

 * import scanner to get input
 * make a while loop

*/

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        int secret_number = (int)(Math.random() * 100),
        number;

        Scanner input = new Scanner(System.in);
        System.out.print("Key in your guess");
        number = input.nextInt();

        while (number != secret_number) {

            if (number > secret_number) {

                System.out.print("Try lower...");
                break;

            }

            else if (number < secret_number) {

                System.out.print("Try higher...");
                break;

            }
            else {

                System.out.print("you got it");
                break;

            }

        }

    }
    
}
