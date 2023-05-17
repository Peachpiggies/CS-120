/*
 * import Scanner 8 input
 * make if else statement to check the year corresponds to the dictionary.
 * then calculate the year and then return the year.
*/

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year");
        int year1 = input.nextInt(),
            year2 = input.nextInt(),
            year3 = input.nextInt(),
            year4 = input.nextInt(),
            year5 = input.nextInt(),
            year6 = input.nextInt(),
            year7 = input.nextInt(),
            year8 = input.nextInt(),
            year = 0;

        while (year != 8) {

            if ( year1 == 1984 || year1 == 1996 || year1 == 2008 ||
                 year2 == 1984 || year2 == 1996 || year2 == 2008 ||
                 year3 == 1984 || year3 == 1996 || year3 == 2008 ||
                 year4 == 1984 || year4 == 1996 || year4 == 2008 ||
                 year5 == 1984 || year5 == 1996 || year5 == 2008 ||
                 year6 == 1984 || year6 == 1996 || year6 == 2008 ||
                 year7 == 1984 || year7 == 1996 || year7 == 2008 ||
                 year8 == 1984 || year8 == 1996 || year8 == 2008 ) {

                System.out.print("Rat");
                year++;

            }

            else if (year1 == 1985 || year1 == 1997 || year1 == 2009 ||
                     year2 == 1985 || year2 == 1997 || year2 == 2009 ||
                     year3 == 1985 || year3 == 1997 || year3 == 2009 ||
                     year4 == 1985 || year4 == 1997 || year4 == 2009 ||
                     year5 == 1985 || year5 == 1997 || year5 == 2009 ||
                     year6 == 1985 || year6 == 1997 || year6 == 2009 ||
                     year7 == 1985 || year7 == 1997 || year7 == 2009 ||
                     year8 == 1985 || year8 == 1997 || year8 == 2009 ) {

                System.out.print("Ox");
                year++;

            }

            else if ( year1 == 1986 || year1 == 1998 || year1 == 2010 ||
                      year2 == 1986 || year2 == 1998 || year2 == 2010 ||
                      year3 == 1986 || year3 == 1998 || year3 == 2010 ||
                      year4 == 1986 || year4 == 1998 || year4 == 2010 ||
                      year5 == 1986 || year5 == 1998 || year5 == 2010 ||
                      year6 == 1986 || year6 == 1998 || year6 == 2010 ||
                      year7 == 1986 || year7 == 1998 || year7 == 2010 ||
                      year8 == 1986 || year8 == 1998 || year8 == 2010 ) {

                System.out.print("Tiger");
                year++;

            }

            else if ( year1 == 1987 || year1 == 1999 || year1 == 2011 ||
                      year2 == 1987 || year2 == 1999 || year2 == 2011 ||
                      year3 == 1987 || year3 == 1999 || year3 == 2011 ||
                      year4 == 1987 || year4 == 1999 || year4 == 2011 ||
                      year5 == 1987 || year5 == 1999 || year5 == 2011 ||
                      year6 == 1987 || year6 == 1999 || year6 == 2011 ||
                      year7 == 1987 || year7 == 1999 || year7 == 2011 ||
                      year8 == 1987 || year8 == 1999 || year8 == 2011 ) {

                System.out.print("Rabbit");
                year++;

            }

        }

    }
    
}
