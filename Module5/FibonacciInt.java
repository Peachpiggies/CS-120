/*
 * 
 * It's similar to the Fibonacci.java from the Module 1
 * but the loop inside have to be change
 * 
*/

public class FibonacciInt {

    public static void main(String[] args) {

        int n1 = 1, /* n1 is the frist number in the Fibonacci sequence */
            n2 = 1, /* n2 is the second number in the Fibonacci sequence */
            count = 2, /* this variable will start at 0 until 20 in the while statement */
            sequence, /* will be the variable to send output */ 
            i = 0,
            n = i;

        double  sum = 2; /* sum of first two numbers (1+1) */

        System.out.printf("f(%s) = %d\nf(%s) = %d", i, n1, n + 1, n2);

        while (Integer.MAX_VALUE - n1 > n2) {

            sequence = n1 + n2;

            System.out.printf("\nf(%s) = %d", n + 2, sequence);  
            n1 = n2;  
            n2 = sequence;
            count += 1;
            sum += sequence;
            n = n + 1;

        }

        System.out.printf("\nf(%s) is out of range.", n+2);

    }
    
}