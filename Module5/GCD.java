/*

 * Start with import the Scanner, and then paste the hint from the assignment then arrange the code
 * then make 2 methods one for calculate another one for input and output

*/

import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b;

        System.out.println("Enter the first number : ");
        a = in.nextInt();

        System.out.println("Enter the second number : ");
        b = in.nextInt();

        int gcd = gcd(a, b);
        System.out.printf("GCD ( %d ,  %d ) =  %d ", a, b, gcd);

        in.close();

    }

    public static int gcd(int a, int b) {

        if (b > a) {

            int temp = a;
            a = b;
            b = temp;

        }

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;

        }

        return a;

    }

}
