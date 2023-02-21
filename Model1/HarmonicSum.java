/*

    - Start with adding variables
    - Make a loop
    - Print the output out

    :D

*/

public class HarmonicSum {

    public static void main(String[] args) {

        float num, 
            N,
            division;

        num = 2;
        N = 5000;
        division = 1;

        while (num <= N) {

            division = division + (1 / num);
            num += 1;
            
            System.out.println(num);

        }

        System.out.println(division);

    }
    
}
