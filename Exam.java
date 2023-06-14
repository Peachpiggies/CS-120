// Start without using the scanner becuz I need the input on cmd
// make that the start and end from the cmd input should be 3 numbers apart
// print the number that we check that it's in the middle of the start and end as a ignore int
// print the sum of start and end

public class Exam {

    public static void main(String[] args) {

        /* String start = args[0];
           String end = args[-1];

           if ( int start + 3 == int end ) {} */ // not gonna work becuz we need int not string

        // get this method from the Arithmetic.java in folder "Module 4"
        int start = Integer.parseInt(args[0]),
            end = Integer.parseInt(args[-1]);

        if ( start + 3 == end + 1 ) {

            System.out.println("noice!");

        }
        

    }

}