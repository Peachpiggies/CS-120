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

            else if ( year1 == 1988 || year1 == 2000 || year1 == 2012 ||
                      year2 == 1988 || year2 == 2000 || year2 == 2012 ||
                      year3 == 1988 || year3 == 2000 || year3 == 2012 ||
                      year4 == 1988 || year4 == 2000 || year4 == 2012 ||
                      year5 == 1988 || year5 == 2000 || year5 == 2012 ||
                      year6 == 1988 || year6 == 2000 || year6 == 2012 ||
                      year7 == 1988 || year7 == 2000 || year7 == 2012 ||
                      year8 == 1988 || year8 == 2000 || year8 == 2012 ) {

                System.out.print("Dragon");
                year++;

            }

            else if ( year1 == 1989 || year1 == 2001 || year1 == 2013 ||
                      year2 == 1989 || year2 == 2001 || year2 == 2013 ||
                      year3 == 1989 || year3 == 2001 || year3 == 2013 ||
                      year4 == 1989 || year4 == 2001 || year4 == 2013 ||
                      year5 == 1989 || year5 == 2001 || year5 == 2013 ||
                      year6 == 1989 || year6 == 2001 || year6 == 2013 ||
                      year7 == 1989 || year7 == 2001 || year7 == 2013 ||
                      year8 == 1989 || year8 == 2001 || year8 == 2013 ) {

                System.out.print("Snake");
                year++;
                
            }

            else if ( year1 == 1990 || year1 == 2002 || year1 == 2014 ||
                      year2 == 1990 || year2 == 2002 || year2 == 2014 ||
                      year3 == 1990 || year3 == 2002 || year3 == 2014 ||
                      year4 == 1990 || year4 == 2002 || year4 == 2014 ||
                      year5 == 1990 || year5 == 2002 || year5 == 2014 ||
                      year6 == 1990 || year6 == 2002 || year6 == 2014 ||
                      year7 == 1990 || year7 == 2002 || year7 == 2014 ||
                      year8 == 1990 || year8 == 2002 || year8 == 2014 ) {

                System.out.print("Horse");
                year++;

            }
            
            else if ( year1 == 1991 || year1 == 2003 || year1 == 2015 ||
                      year2 == 1991 || year2 == 2003 || year2 == 2015 ||
                      year3 == 1991 || year3 == 2003 || year3 == 2015 ||
                      year4 == 1991 || year4 == 2003 || year4 == 2015 ||
                      year5 == 1991 || year5 == 2003 || year5 == 2015 ||
                      year6 == 1991 || year6 == 2003 || year6 == 2015 ||
                      year7 == 1991 || year7 == 2003 || year7 == 2015 ||
                      year8 == 1991 || year8 == 2003 || year8 == 2015 ) {

                System.out.print("Goat");
                year++;

            }

            else if ( year1 == 1992 || year1 == 2004 || year1 == 2016 ||
                      year2 == 1992 || year2 == 2004 || year2 == 2016 ||
                      year3 == 1992 || year3 == 2004 || year3 == 2016 ||
                      year4 == 1992 || year4 == 2004 || year4 == 2016 ||
                      year5 == 1992 || year5 == 2004 || year5 == 2016 ||
                      year6 == 1992 || year6 == 2004 || year6 == 2016 ||
                      year7 == 1992 || year7 == 2004 || year7 == 2016 ||
                      year8 == 1992 || year8 == 2004 || year8 == 2016 ) {

                System.out.print("Rooster");
                year++;

            }

            else if ( year1 == 1982 || year1 == 1994 || year1 == 2006 ||
                      year2 == 1982 || year2 == 1994 || year2 == 2006 ||
                      year3 == 1982 || year3 == 1994 || year3 == 2006 ||
                      year4 == 1982 || year4 == 1994 || year4 == 2006 ||
                      year5 == 1982 || year5 == 1994 || year5 == 2006 ||
                      year6 == 1982 || year6 == 1994 || year6 == 2006 ||
                      year7 == 1982 || year7 == 1994 || year7 == 2006 ||
                      year8 == 1982 || year8 == 1994 || year8 == 2006 ) {

                System.out.print("Dog");
                year++;

            }

            else if ( year1 == 1983 || year1 == 1995 || year1 == 2007 ||
                      year2 == 1983 || year2 == 1995 || year2 == 2007 ||
                      year3 == 1983 || year3 == 1995 || year3 == 2007 ||
                      year4 == 1983 || year4 == 1995 || year4 == 2007 ||
                      year5 == 1983 || year5 == 1995 || year5 == 2007 ||
                      year6 == 1983 || year6 == 1995 || year6 == 2007 ||
                      year7 == 1983 || year7 == 1995 || year7 == 2007 ||
                      year8 == 1983 || year8 == 1995 || year8 == 2007 ) {

                System.out.print("Pig");
                year++;

            }

        } 

    }
    
}