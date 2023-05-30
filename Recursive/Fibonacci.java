/*
 * Start with import Scanner
 * make a vriable to receive input
 * make another function to calculate the fibonacci
 * print the result in the main function
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Which Fibonacci number do you want to display?");
        int number = input.nextInt();

        System.out.println(calculate(number));

        input.close();

    }

    public static int calculate(int sequence) {

        if (sequence <=2){		//this is the base cases.  If they want the fibonacci value of 1 ro 2 it is 1.  We know this becuase fibonacci sequences starts 1, 1, 
			return 1;
		}
		else{	//if they want the fibonacci number of anything higher we return the 2 previous fibonacci numbers added together
			return calculate(sequence-1) + calculate(sequence-2);
		}

    }
    
}
