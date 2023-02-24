/*
  
 * Start with reading the insturction from the document
 * Adding variables
 * do what the document said to do witch is
   - prints the numbers 1 to 110, 11 numbers per line.
   - The program shall print "Coza" in place of the numbers which are multiples of 3
   - "Loza" for multiples of 5
   - "Woza" for multiples of 7
   - "CozaLoza" for multiples of 3 and 5, and so on. 
  
*/

public class CozaLozaWoza {

    public static void main(String[] args) {

        int num, three, five;

        three = 0;
        five = 0;
        num = 1;

        while (num <= 999) {

            System.out.print(num + " ");
            
            num += 1;
            // three = num % 3;
            // five = num % 5;

            if ((num % 5 == five) && (num % 3 == three)) {

                System.out.print("CozaLoza");

            }

            else if (num % 3 == three) {

                System.out.print("Coza");

            }

            else if (num % 5 == five) {

                System.out.print("Loza");

            }
        
        }

    }

}