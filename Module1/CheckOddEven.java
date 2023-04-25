/*

  - Start with adding variables
  - make a calculation section for checking variables
  - send the output to the therminal console

 */

public class CheckOddEven {

    public static void main(String[] args) {

        int number,
                OddEven;

        number = 26;

        OddEven = number % 2;

        if (OddEven == 0) {

            System.out.println(">>> Even number <<<");

        }

        else {

            System.out.println(">>> Odd number <<<");

        }

        System.out.println();
        System.out.println("BYE!");

    }

}
