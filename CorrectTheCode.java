public class CorrectTheCode {
   public static void main(String[] args) {

      int sum = 0;
      double average;
      int lowerbound = 1;
      int upperbound = 100;
      double count = 0;

      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;
         count++;
      }

      average = sum / count;

      System.out.println("The Sum is " + sum);
      System.out.println("The Average is " + average);
   }

}