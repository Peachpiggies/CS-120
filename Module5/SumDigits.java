/*
 * It's a command line so we don't have to worry about to import Scanner
 * make if statement to watch for text length
 * then make a while loop to calculate the number
 * lastly print the output
 */

public class SumDigits {
    public static void main(String[] args) {

        if (args.length != 1) {

            System.out.println("---Error---");
            return;

        }

        int number = Integer.parseInt(args[0]);
        int sum = 0;
        String digits = "";

        while (number > 0) {

            int digit = number % 10;
            sum += number % 10;
            digits = digit + " + " + digits;
            number /= 10;

        }

        digits = digits.substring(0, digits.length()-3);

        System.out.println("The sum of digits = " + digits + " = " + sum);

    }

}
