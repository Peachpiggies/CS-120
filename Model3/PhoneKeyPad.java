/*

 * On your phone keypad, the alphabets are mapped to digits as follows: 
    ABC(2), 
    DEF(3), 
    GHI(4), 
    JKL(5), 
    MNO(6), 
    PQRS(7), 
    TUV(8), 
    WXYZ(9).
   Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.

 * import scanner
 * make for loop to recieve keypad digits as long as possible
 * also make a switch case like the following example in the assignment
 * then print the output out from the switch case
 
*/

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {

        String pad;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password : ");
        pad = in.next().toLowerCase();

        for (int i = 0; i < pad.length(); i++) {

            char ch = pad.charAt(i);

            switch (ch) {

                case 'a' : case 'b' : case 'c' :
                    System.out.print(2); break;

                case 'd' : case 'e' : case 'f' :
                    System.out.print(3); break;

                case 'g' : case 'h' : case 'i' :
                    System.out.print(4); break;
                
                case 'j' : case 'k' : case 'l' :
                    System.out.print(5); break;
                
                case 'm' : case 'n' : case 'o' :
                    System.out.print(6); break;
                
                case 'p' : case 'q' : case 'r' : case 's' :
                    System.out.print(7); break; 
                
                case 't' : case 'u' : case 'v' :
                    System.out.print(8); break; 
                
                case 'w' : case 'x' : case 'y' : case 'z' :
                    System.out.print(9); break;

            }

        }

        in.close();

    } 

}
