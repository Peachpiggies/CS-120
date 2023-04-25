/*

    - Start with adding variables
    - make loop
    - Compute π

*/ 

public class ComputePI {

    public static void main(String[] args) {

        float denominator1, denominator2, Pie, π /* result that will be print off */,
         Trueπ, value1, value2;

        //double PI;

        denominator1 = 1;
        denominator2 = 3;

        //PI = Math.PI;

        value1 = 0;
        value2 = 0;

        Pie = 900000; 

        while (denominator1 <= Pie) {

            value1 += 1/denominator1;
            denominator1 += 4;

        };

        while (denominator2 <= Pie) {

            value2 += 1/denominator2;
            denominator2 += 4;

        };

        π = 4 * (value1 - value2);
        Trueπ = (π / (float) Math.PI) * 100;

        System.out.println("My π is :" + π);
        System.out.println("The system π is :" + Trueπ);

    }

}