/*

  * Make a bunch of variables
  * make a bunch of nested loop for 9 patterns

*/

public class PrintPattern {

    public static void main(String[] args) {

      int  row, col, size1, size2, height1 = 8, height2 = 9;

      for (row = 1; row <= height1; row++) {

          for (col = 1; col <= row; col++) {
            
            // col++;
            System.out.print("# ");

         }

         System.out.println();
          
      }

      System.out.println("(a)"); // finish (a)

      for (row = height1; row >= 1; row--) {

        for (col = 1; col <= row; col++) {
            
          System.out.print("# ");

       }

       System.out.println();

      }

      System.out.println("(b)"); // finish (b)

      size1 = height1 - 1;

          for (row = 0; row < height1; row++) {

            for (col = 0; col < height1; col++) {

              if (col < size1) {

                System.out.print("  ");

              }

              else {

                System.out.print(" #");

              }

            }

            System.out.println();
            size1 = size1 - 1;

          }
        
      System.out.println("(c)");

      size2 = height2 - 1;

          for (row = height2; row > 0; row--) {

            for (col = 0; col < height2; col++) {

              if (col < size2) {

                System.out.print(" #");

              }

              else {

                System.out.print(" ");

              }

            }

            System.out.println();
            size2 = size2 - 1;

          }

      System.out.println("(d)");

    }
    
}