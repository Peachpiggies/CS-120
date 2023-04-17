/*

  * prompts the user for a String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints the counts and the percentages (with 2 decimal digits)
  
  - import java.util.Scanner to recive information from keyboard
  - use in.next().toLowerCase() to convert the input String to lowercase
  - count variables use for count the String by useing if-selse condition
  - percent variables use for calcutate the percentage of both vowels and digits

*/

import java.util.Scanner;

public class CheckVowelsDigits {

    public static void main(String[] args) {

        String text;
        int count_vowel = 0,
            count_digit = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String : ");
        text = in.next().toLowerCase();

        for (int n = 0; n < text.length(); n++) {
            char c = text.charAt(n);
            if (c >= '0' && c <= '9') {

                count_digit++;

            }
            
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
 
                count_vowel++;

            }

        }

        double percen_vowel = (double) count_vowel / text.length() * 100;
        double percen_digit = (double) count_digit / text.length() * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", count_vowel, percen_vowel);
        System.out.printf("Number of digits: %d (%.2f%%)", count_digit, percen_digit);

        in.close();

    }

}