/*
 * import a Scanner 
 * make if else statement to check the year corresponds to the dictionary, that loop in a for loop then print out the zodiac animal.
 * then calculate the year and then return the year, also print out the zodiac animal.
*/

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int count_year = 0;
        int[] years = new int[8];
		//String[] comp = new String[4];

        System.out.println("Enter 8 years:");
        for (int i = 0; i < 8; i++) {

            years[i] = input.nextInt();

        }
		int max, min;  //declare variables max and min
		for (int i = 0, j = 0; i<8; i+=2, j++){	//loop through your array, increasing by 2 each time.  Increase by 2 as you are looking at the pairs (2) each time through.
			
			for (int x = 0; x < 2; x++){

				int year = years[i+x];

            if (year == 1984 || year == 1996 || year == 2008) {

                System.out.print("Rat ");

            }
            
            else if (year == 1985 || year == 1997 || year == 2009) {

                System.out.print("Ox ");

            } 
            
            else if (year == 1986 || year == 1998 || year == 2010) {

                System.out.print("Tiger ");

            } 
            
            else if (year == 1987 || year == 1999 || year == 2011) {

                System.out.print("Rabbit ");

            } 
            
            else if (year == 1988 || year == 2000 || year == 2012) {

                System.out.print("Dragon ");

            } 
            
            else if (year == 1989 || year == 2001 || year == 2013) {

                System.out.print("Snake ");

            }
            
            else if (year == 1990 || year == 2002 || year == 2014) {

                System.out.print("Horse ");

            }
            
            else if (year == 1991 || year == 2003 || year == 2015) {

                System.out.print("Goat ");

            }
            
            else if (year == 1992 || year == 2004 || year == 2016) {

                System.out.print("Monkey ");
            
            }
            
            else if (year == 1993 || year == 2005 || year == 2017) {

                System.out.print("Rooster ");
            
            } 
            
            else if (year == 1982 || year == 1994 || year == 2006) {

                System.out.print("Dog ");
            
            }
            
            else if (year == 1983 || year == 1995 || year == 2007) {

                System.out.print("Pig ");

            }

		    }
            //count_year++;
			
			
			
			max = (years[i] > years[i+1]) ? years[i] : years[i+1]; //compare years[i] and years[i+1].  Put the largest value into max.
			min = (years[i] > years[i+1]) ? years[i+1] : years[i]; //compare years[i] and years[i+1].  Put the smallest value into min.
			
			if ( max == min ) {	//if the 2 years are the same they are not determined.

				System.out.println( "not determined");

			}
            
            else if ( (max-min) % 4 == 0 ) { //if the 2 years are 4 steps apart (subtract them and check for mod 4) then they are compatible.
				
                System.out.println("compatible");

			}
            
            else if ( (max - min) % 6 == 0 ) { //if the 2 years are 6 steps apart (subtract them and check for mod 6) then they are not compatible.
				
                System.out.println("not compatible");

			}
            
            else { //anything else and they are not determined.

				System.out.println("not determined");
                
			}
			
        }

        input.close();
		
		/*
		int max, min;  //declare variables max and min
		for (int i = 0, j = 0; i<8; i+=2, j++){	//loop through your array, increasing by 2 each time.  Increase by 2 as you are looking at the pairs (2) each time through.
			max = (years[i] > years[i+1]) ? years[i] : years[i+1]; //compare years[i] and years[i+1].  Put the largest value into max.
			min = (years[i] > years[i+1]) ? years[i+1] : years[i]; //compare years[i] and years[i+1].  Put the smallest value into min.
			
			if (max == min){	//if the 2 years are the same they are not determined.
				comp[j] = "not determined";
			}else if ((max-min)%4 == 0){ //if the 2 years are 4 steps apart (subtract them and check for mod 4) then they are compatible.
				comp[j] = "compatible";
			}else if ((max - min)%6 == 0){ //if the 2 years are 6 steps apart (subtract them and check for mod 6) then they are not compatible.
				comp[j] = "not compatible";
			}else{ //anything else and they are not determined.
				comp[j] = "not determined";
			}
		}
*/
    }

}
