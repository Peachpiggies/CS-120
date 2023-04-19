/*

 * Start with import scanner
 * also make for loop to recieve 3 input from keyboard
 * and another for loop to print the output that get calculate from 24hour-clock to 12hour-clock
 
*/

import java.util.Scanner; // Start here

public class Program1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 24hour-clock time : ");
        System.out.println(" ");
        int[] hours = new int[3];
        
        for (int i = 0; i < 3; i++) {

            hours[i] = in.nextInt();

        }

        System.out.println("The following output in 12hour-clock are : ");
        
        for (int i = 0; i < 3; i++) {

            int hour = hours[i];
            String suffix = hour >= 12 ? "pm" : "am";
            
            if (hour == 0) {

                hour = 12;

            }
            
            else if (hour > 12) {

                hour -= 12;

            }
            
            System.out.println(hour + suffix);

        }

        in.close();

    }

}
