/*
 * I copy and past the hints from Mr.Brown assignment and rearrange the hite and change some code
 * import scanner to recive input and collect it in variable x
 * then use for loop then if else statements for checking x is a perfect number
*/

import java.util.Scanner;

public class PerfectNumberTest {

    public static void main(String[] args) {

        int sum = 0, x;

        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        for (int i = 1; i < x; ++i) {

            if (x % i == 0) {

                System.out.printf("%d is a proper divisor\n", i);
                sum = i + sum;

            }

        }

        if (sum == x) {

            System.out.printf("------------------------------\n%d is a perfect number\n", x);

        }

        else {

            System.out.printf("\n%d is not a perfect number\n", x);

        }

        in.close();

    }
    
}
