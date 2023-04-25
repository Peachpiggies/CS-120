/*

 * Start with import a scanner to get information from keyboard
 * also make a boolean to check if it's a palindrome
 * and prints ""xxx" is|is not a palindrome" this as an output
 
*/

import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter a String : ");
        text = in.next().toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {

                isPalindrome = false;
                break;

            }

        }

        if (isPalindrome) {

            System.out.println("\"" + text + "\" is a palindrome.");

        }

        else {

            System.out.println("\"" + text + "\" isn't a palindrome.");

        }

        in.close();

    }
    
}