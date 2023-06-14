// Start without using the scanner becuz I need 5 number for the input on cmd
// print the number exept start and stop as a ignore int
// print the sum of start and end

public class Exam {

    public static void main(String[] args) {

        /* String start = args[0];
           String end = args[-1];

           if ( int start + 3 == int end ) {} */ // not gonna work becuz we need int not string

        // get this method from the Arithmetic.java in folder "Module 4"
        int start = Integer.parseInt(args[0]),
            ignore1 = Integer.parseInt(args[1]),
            ignore2 = Integer.parseInt(args[2]),
            ignore3 = Integer.parseInt(args[3]),
            end = Integer.parseInt(args[4]),
            sum = start + end;

        // also use printf that we learn in "Module 3"
        System.out.printf("The start is %d and end is %d.\n The number in the middle that we ignore is %d, %d, and %d. \nAlso the sum of the start and end is %d"
        , start, end, ignore1, ignore2, ignore3, sum);
        
    }

}