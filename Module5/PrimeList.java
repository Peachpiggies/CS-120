/*
 * import Scanner to collect information from keyboard
 * then make 2 methods one for input and one for checking the input
 * the first method use for loop and if statement to print the number from 0 to upper bound
 * also print out the calculation

 * the second methoid use to check that it's a prime
 * if statement to check the number then use for loop and if to check is it prime.
*/

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {

        int upperBound, countPrimes;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an upper bound : ");
        upperBound = in.nextInt();
        
        countPrimes = 0;
        System.out.println("List of primes:");
        for (int i = 1; i <= upperBound; i++) {

            if (isPrime(i)) {

                countPrimes++;
                System.out.print(i + "\n");

            }

        }
        
        double percentage = 100.0 * countPrimes / (upperBound - 1);
        System.out.printf("[%d primes found  %.2f%%]\n", upperBound, percentage);

        in.close();

    }
    
    public static boolean isPrime(int posInt) {

        if (posInt <= 1) {

            return false;

        }
        
        for (int i = 2; i <= Math.sqrt(posInt); i++) {

            if (posInt % i == 0) {

                return false;

            }

        }
        
        return true;

    }

}
