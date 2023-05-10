/*

 * import scanner to get input
 * make a if-else statement in the while loop to check & count the number
 * use if statements to check the number variable that is correct with the secret_number variable
   then print out the counter variable that have count from the if-else statement from the while loop

*/

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        int secret_number = (int)(Math.random() * 100),
            number,
            counter = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Key in your guess : ");
        number = input.nextInt();

        while (number != secret_number) {

            if (number > secret_number) {

                System.out.print("Try lower...\n");
                number = input.nextInt();
                counter += 1;
                //break;

            }

            else if (number < secret_number) {

                System.out.print("Try higher...\n");
                number = input.nextInt();
                counter += 1;
                //break;

            }

        }

        if (number == secret_number) {

            System.out.printf("You got it in %d trials!", counter);

        }

    }
    
}
