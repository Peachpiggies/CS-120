/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */
public class RunningNumberSum5 {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
      int lowerbound = 1;      // Store the lowerbound
      int upperbound = 10;   // Store the upperbound
      int product = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatitively sum from the lowerbound to the upperbound
      int number = lowerbound;
      while (number <= upperbound) {
         product = product * number;  // Accumulate number into sum
         number++;            // Next number
      }
      // Print the result
      System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
   }
}