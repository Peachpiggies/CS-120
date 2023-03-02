/*

    - Start with adding variables
    - Make 2 while statement
    - print out the product from 1 to 10 AND from 1 to 13

*/

public class Product1ToN {

    public static void main(String[] args) {

        float low1, low2, product1, product2, max1, max2;

        low1 = 1;
        
        max1 = 10;

        product1 = 1;

        float num1 = low1;

        while (num1 <= max1) {

            product1 = product1 * num1;
            num1 ++;

        };

        low2 = 1;

        max2 = 13;

        product2 = 1;

        float num2 = low2;

        while (num2 <= max2) {

            product2 = product2 * num2;
            num2++;
            
            //System.out.println(product2 + "*" + num2);
        }

        //System.out.println(num2);
        System.out.println("The product from " + low1 + " to " + max1 + " is " + product1);
        System.out.println("and");
        System.out.println("The product from " + low2 + " to " + max2 + " is " + product2);
        
    }
    
}
