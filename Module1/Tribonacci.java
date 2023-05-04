/*

  * Add variables
  * Make a sequence of Tribonacci [T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2]
  * Print the out put

*/

public class Tribonacci {

    public static void main(String[] args) {

        int n1, // n1 is first number in the Tribonacci
            n2, // n2 is second number in the Tribonacci
            n3, // n3 is third number in the Tribonacci
            count, /* this variable will start at 0 until 20 in the while statement */
            sequence /* will be the variable to send output */;

        n1 = 1;
        n2 = 1;
        n3 = 2;
        count = 0;

        System.out.print(n1 + " " + n2 + " " + n3);

        while (count <= 20) {

            sequence = n1 + n2 + n3;  
            System.out.print(" " + sequence);  
            n1 = n2;  
            n2 = n3;
            n3 = sequence;
            count += 1;

        }

    }
    
}
