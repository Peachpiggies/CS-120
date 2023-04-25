/*

    - Start with adding variables
    - Make an if / else statement
    - print output

*/

public class CheckPassFail {

    public static void main(String[] args) {

        float mark1;

        mark1 = 70;

        if (mark1 >= 50) {

            System.out.println("Pass");

        }

        else if (mark1 <= 50) {

            System.out.println("Fail");

        }

        else if (mark1 > 100) {

            System.out.println("System don't recognize that");

        }

        System.out.println("<<< DONE >>>");

    }

}