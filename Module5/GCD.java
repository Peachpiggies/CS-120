/*

 * Start with import the Scanner, and then paste the hint from the assignment then arrange the code
 * then make 2 methods one for calculate another one for input and output

*/

import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float a, b;

        System.out.print("Enter the first number : ");
        a = in.nextFloat();

        System.out.print("Enter the second number : ");
        b = in.nextFloat();

    }

    public static float gcd(float a, float b) {

        if (b > a) {

            float temp = a;
            a = b;
            b = temp;

        }

        while (b != 0) {

            float temp = b;
            b = a % b;
            a = temp;

        }

        return a;

    }

}
