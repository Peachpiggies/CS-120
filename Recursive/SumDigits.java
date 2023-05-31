/*
 * import Scanner
 * make a recursive function that calculate, but before that have to check the digits befor calculated
 * in the calculate function I use if-else aubeously it's recursive function 1st if check it's only a digit
 * and the else it use for calculate
 * print the output in main function
*/

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number to sum the digits of :");
        long number = input.nextLong(),
            sum = calculate(number);

        System.out.printf("The sum of the digits %s is %s", number, sum);

        input.close();

    }

    public static long calculate(long number) {

        if (number < 10) {

            return number; // Base case: single-digit number

        } 
        
        else {

            long lastDigit = number % 10, // Get the last digit
                remainingDigits = number / 10; // Remove the last digit

            return lastDigit + calculate(remainingDigits);

        }

    }
    
}