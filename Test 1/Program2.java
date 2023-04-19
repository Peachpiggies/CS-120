/*

 * Start with added Scanner
 * also make a for loop to recive temp. and speed from keyboard
 * then make if-else statements in the for loop to compare data that recieve from input

*/

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hotThreshold = in.nextInt(),
            coldThreshold = in.nextInt(),
            fastThreshold = in.nextInt(),
            slowThreshold = in.nextInt(),
            hotFastCount = 0,
            hotSlowCount = 0,
            coldFastCount = 0,
            coldSlowCount = 0;

        System.out.println("Input");

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {

            int temperature = in.nextInt(),
                speed = in.nextInt();

            if (temperature > hotThreshold) {

                if (speed > fastThreshold) {

                    hotFastCount++;

                }
                
                else if (speed < slowThreshold) {

                    hotSlowCount++;

                }

            }
            
            else if (temperature < coldThreshold) {

                if (speed > fastThreshold) {

                    coldFastCount++;

                } else if (speed < slowThreshold) {

                    coldSlowCount++;

                }

            }

        }

        System.out.println("Output");

        System.out.println(hotFastCount);
        System.out.println(hotSlowCount);
        System.out.println(coldFastCount);
        System.out.println(coldSlowCount);

        in.close();

    }
    
}
