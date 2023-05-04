/*

 * Start with import Arrays & Scanner
 * make 2 methods :
  - main : input array from keyboard, and also print the results
  - reverse : reverse the input array and return the result

*/

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How long is the array (-w-) : ");
        int length = in.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {

            array[i] = in.nextInt();

        }

        reverse (array);

        System.out.println(Arrays.toString(array));

        in.close();

    }

    public static void reverse(int[] array) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;

    }

    }
    
}