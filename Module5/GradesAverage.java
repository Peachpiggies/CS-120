/* 

    * prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numStudents. 
      It then prompts user for the grades of each of the students and saves them in an int array called grades.  
      Your program shall check that the grade is between 0 and 100.

    * import Scanner to recieve input from the keyboard
    * make 2 methods for collecting data from the scanner another one use for calculating the grades total
    * also make for loop to recieve the input and if/else to detect the input
    * then print the average output from the other method that use to calculate the average grades

 */

import java.util.Scanner;

public class GradesAverage {

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

        double average = CalGradeAvg(Grade);
        System.out.println("The average is : " + average);

        in.close();

    }

    public static double CalGradeAvg(double[] Grade) {

        double GradesAverage = 0;

        for (int i = 0; i < Grade.length; i++) {
            GradesAverage += Grade[i];
        }

        return GradesAverage / Grade.length;

    }
    
}
