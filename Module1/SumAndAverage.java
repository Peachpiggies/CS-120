/*
  
 - adding the variable
 - make a calculation
 - print the output

*/

public class SumAndAverage {

    public static void main(String[] args) {

        int sum,
            lowerbound,
            number,
            upperbound;

        double average,
               count;

        sum = 0;
        lowerbound = 1;
        upperbound = 100;
        count = 0;
  
        for (number = lowerbound; number <= upperbound; ++number) {
           sum += number;
           count++;
        }
  
        average = sum / count;
  
        System.out.println("The Sum is " + sum);
        System.out.println("The Average is " + average);

     }
    
}
