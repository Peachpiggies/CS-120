public class Arithmetic2 {
	public static void main(String[] args){
		int operand1, operand2;
		char theOperator;
		operand1 = Integer.parseInt(args[0]); //Convert String to int
		operand2 = Integer.parseInt(args[1]); //Convert String to int
		theOperator = args[2].charAt(0);  //Grab the first character of arg 3 (should only be 1).

		System.out.print(args[0] + args[2] + args[1] + "=");  //print out the equation minus the answer
		
		switch (theOperator) {

			case '+' : System.out.println(operand1 + operand2);
				break;

			case '-' : System.out.println(operand1 - operand2);
				break;

			case '*' : System.out.println(operand1 * operand2);
				break;

			case '/' : System.out.println(operand1 / operand2);
				break;

			default : System.out.print("Ah");
				break;

		}

	}

}
			