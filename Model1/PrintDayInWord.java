/*

    - Start with adding variables
    - Make a switch statement
    - print output

*/

public class PrintDayInWord {

    public static void main(String[] args) {

        int day;

        day = 3; // because I like number 3 if it's a whole number. :D

        switch (day) {

            case 1:
                System.out.println(">>> Sunday <<<");
                break;

            case 2:
                System.out.println(">>> Monday <<<");
                break;

            case 3:
                System.out.println(">>> Tuesday <<<");
                break;

            case 4:
                System.out.println(">>> Wednesday <<<");
                break;

            case 5:
                System.out.println(">>> Thursday <<<");
                break;

            case 6:
                System.out.println(">>> Friday <<<");

            case 7:
                System.out.println(">>> Saturday <<<");
                break;

            case 8:
                System.out.println("!!! Not a valid day !!!");

        }

    }

}
