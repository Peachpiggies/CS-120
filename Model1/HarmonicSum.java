/*

    - Start with adding variables for the loop
    - Make 2 while loop for left to right, and riglt to left
    - Print the output from both loop out

    :D

*/

public class HarmonicSum {

    public static void main(String[] args) {

        int numLR = 0, NLR = 50000, numRL = 50001, NRL = 1;
        double resultLR = 0.0, resultRL = 0.0;

        while (numLR < NLR) {

            numLR++;
            resultLR = resultLR + 1.0 / numLR;

        } // left to right

        while (numRL > NRL) {

            numRL--;
            resultRL = resultRL + 1.0 / numRL;

            System.out.println(numRL);

        } // right to left

        System.out.println("From left to right : " + resultLR);
        System.out.println("From right to left : " + resultRL);

    }
    
}
