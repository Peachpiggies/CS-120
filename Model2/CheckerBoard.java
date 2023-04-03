/*
 
 * Make a variable for using with the for loop
 * Make a loop by using for loop
 * Displays the following n×n (n=7) checkerboard pattern using two nested for-loops
  
*/

public class CheckerBoard {

    public static void main(String[] args) {

     for (int row = 1; row <= 7; row++) {   //outerloop
		  
            if (row % 2 == 0) {

                System.out.print(" ");

            }

        for (int mark = 1; mark <= 7; mark++) {  //innerloop

            System.out.print("# ");
            //System.out.println();

        }
        
        //  System.out.print(" ");
         System.out.println();

      }

    }
    
}