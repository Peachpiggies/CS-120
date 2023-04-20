import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] args){

		int operand1, operand2, result = 0;
		char theOperator;

		Scanner in = new Scanner(System.in);
		
		operand1 = Integer.parseInt(args[0]); //Convert String to int
		operand2 = Integer.parseInt(args[1]); //Convert String to int
		theOperator = args[-1].charAt(0);  //Grab the first character of arg 3 (should only be 1).

        switch (theOperator) {
            case '+':
                result = operand1 + operand2;
                System.out.printf("%d+%d=%d\n", operand1, operand2, result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.printf("%d-%d=%d\n", operand1, operand2, result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.printf("%dx%d=%d\n", operand1, operand2, result);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: division by zero");
                    break;
                }
                result = operand1 / operand2;
                System.out.printf("%d/%d=%d\n", operand1, operand2, result);
                break;

			}

	}

}
			