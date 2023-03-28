/*

  * Add variables that will be very useful for while loop
  * And use those variables to make a sequence of Fibonacci [F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1] in while loop
  * Print the out put of the Fibonacci sequence with it's average value

*/

public class Fibonacci {

    public static void main(String[] args) {

        int n1, /* n1 is the frist number in the Fibonacci sequence */
            n2, /* n2 is the second number in the Fibonacci sequence */
            count, /* this variable will start at 0 until 20 in the while statement */
            sequence /* will be the variable to send output */ ;

        double  sum = 2, /* sum of first two numbers (1+1) */
                average /* this variable will be the one that keep the average */;

        n1 = 1;
        n2 = 1;
        count = 2;

        System.out.print(n1 + " " + n2);

        while (count < 20) {

            sequence = n1 + n2;

            System.out.print(" " + sequence);  
            n1 = n2;  
            n2 = sequence;
            count += 1;
            sum += sequence;

        }

        average = sum / 20;
        System.out.println("\nAverage of the first 20 Fibonacci numbers: " + average);

    }
    
}
