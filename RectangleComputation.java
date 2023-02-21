public class RectangleComputation {

    public static void main(String[] args) {

        // Set up the variables
        double width, length, area, perimeter;

        // Plug in the variables
        width = 20;
        length = 40;

        // Calculate zone for area and perimeter.
        area = width * length;
        perimeter = (2 * width) + (2 * length);

        // Print the output.

        System.out.print("The width is : ");
        System.out.println(width);
        System.out.println(" ");
        // Print width

        System.out.print("The length is : ");
        System.out.println(length);
        System.out.println(" ");
        // Print length

        System.out.print("The area of the square / rectangle is : ");
        System.out.println(area);
        System.out.println(" ");
        // Print area

        System.out.print("The perimeter of the square / rectangle is : ");
        System.out.println(perimeter);

    }

}
