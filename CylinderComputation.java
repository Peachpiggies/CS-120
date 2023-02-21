public class CylinderComputation {

    public static void main(String[] args) {

        // Set up the variables
        double radius, height, circle_area, surface_area, volume;
        final double PI = (22 / 7);

        // Plugs in the variables
        radius = 5;
        height = 10;

        // ------------------------------------------------------------------------

        // Calculate the Circle Area
        circle_area = PI * radius * radius;

        // Calculate the Volume
        volume = circle_area * height;

        // Calculate the Surface Area
        surface_area = (2 * PI * radius * height) + (2 * circle_area);

        // ------------------------------------------------------------------------

        // Print output

        System.out.print("The radius is : ");
        System.out.println(radius);
        System.out.println(" ");
        // Print radius

        System.out.print("The height is : ");
        System.out.println(height);
        System.out.println(" ");
        // Print length

        System.out.print("The surface area of the cylinder is : ");
        System.out.println(surface_area);
        System.out.println(" ");
        // Print surface area

        System.out.print("The volume of the cylinder is : ");
        System.out.println(volume);
        // Print volume

    }

}
