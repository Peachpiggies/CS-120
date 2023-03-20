/*

  * Make a bunch of variables
  * make a bunch of nested loop for 9 patterns

*/

public class PrintPattern {

    public static void main(String[] args) {

      int  row, col, size;

      for (row = 1; row <= 8; row++) {

          for (col = 1; col <= row; col++) {
            
            // col++;
            System.out.print("# ");

         }

         System.out.println();
          
      }

      System.out.println("(a)"); // finish (a)

      for (row = 8; row >= 1; row--) {

        for (col = 1; col <= row; col++) {
            
          System.out.print("# ");

       }

       System.out.println();

      }

      System.out.println("(b)"); // finish (b)

    }
    
}