/*

  * prompts user for a String, and prints the reverse of the String.

  - import java.util.Scanner to recive information from keyboard
  - make a string variable that recive data from keyboard input

*/

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String text, re_text = "";
        char ch;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String : ");
        text = in.next();

        for (int i = 0; i < text.length(); i++) {

            ch = text.charAt(i);
            re_text = ch + re_text;

        }

        System.out.printf("The reverse of the String \"%s\" is \"%s\"", text, re_text);

        in.close();

    }
    
}