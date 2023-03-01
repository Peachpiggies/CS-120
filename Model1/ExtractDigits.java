/*

 * Make a variable
 * Make a sequence acording to the assignment
   [ extract each digit from an int, in the reverse order. ]
 * Print the variable out

*/


public class ExtractDigits {
    
    public static void main(String[] args) {

        int number, number_1;

        number = 24094;

        while (number > 0) {

            number_1 = number % 10;
            System.out.print(number_1 + " ");
            number = number / 10;

        }

    }

}
