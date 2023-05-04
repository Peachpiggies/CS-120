/* 

    * reads in n grades(of int between 0 and 100, inclusive) and displays the average, minimum, and maximum. Display the floating-point values up to 2 decimal places.

    * import Scanner to recieve input from the keyboard
    * make 4 methods for collecting data from the scanner, another one use for calculating the grades total,
      next one is for calculating the minimum, and the last one for maximum
    * also make for loop to recieve the input and if/else to detect the input
    * then print the average, maximum, minimum output from the other method that use to calculate the average grades, maximum grades, and minimum grades

 */

 import java.util.Scanner;

 public class GradesStatistics {
 
     public static void main(String[] args) {
 
         int numStudents;
         double[] Grade;
 
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the number of students : ");
         numStudents = in.nextInt();
 
         Grade = new double[numStudents];
         for (int i = 0; i < numStudents; i++) {
 
             System.out.print("Enter the grade for student " + (i + 1) + " : ");
             Double GetGrade = in.nextDouble();
 
             if (GetGrade > 100 || GetGrade < 0) {
 
                 System.out.print("Invalid grade, try again...\n");
                 System.out.print("Enter the grade for student " + (i + 1) + ": ");
                 Grade[i] = in.nextInt();
 
             }
             
             Grade[i] = GetGrade;
 
         }
 
         double average = CalGradeAvg(Grade), minimum = CalGradeMin(Grade), maximum = CalGradeMax(Grade);

         System.out.println("The average is : " + average);
         System.out.println("The minimum is : " + minimum);
         System.out.println("The maximum is : " + maximum);
 
         in.close();
 
     }
 
     public static double CalGradeAvg(double[] Grade) {
 
         double GradesAverage = 0;
 
         for (int i = 0; i < Grade.length; i++) {

             GradesAverage += Grade[i];

         }
 
         return GradesAverage / Grade.length;
 
     }

     public static double CalGradeMin(double[] Grade) {

        double GradeMin = 0;

        for (int i = 1; i < Grade.length; i++) {

            if (Grade[i] < GradeMin) {

                GradeMin = Grade[i];

            }

        }

        return GradeMin;
    }
    
    public static double CalGradeMax(double[] Grade) {

        double GradeMax = 0;

        for (int i = 1; i < Grade.length; i++) {

            if (Grade[i] > GradeMax) {

                GradeMax = Grade[i];

            }
        }

        return GradeMax;
    }
     
 }
 