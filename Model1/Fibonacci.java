/*

  * Add variables
  * Make a sequence of Fibonacci [F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1]
  * Print the out put

*/

public class Fibonacci {

    public static void main(String[] args) {

        int n1, /* n1 is the frist number in the Fibonacci sequence */
            n2, /* n2 is the second number in the Fibonacci sequence */
            count, /* this variable will start at 0 until 20 in the while statement */
            sequence /* will be the variable to send output */;

        n1 = 1;
        n2 = 1;
        count = 0;

        System.out.print(n1 + " " + n2);

        while (count <= 20) {

            sequence = n1 + n2;  
            System.out.print(" " + sequence);  
            n1 = n2;  
            n2 = sequence;
            count += 1;

        }

    }
    
}
