/*

    - Start with adding variables
    - make loop
    - Compute π

*/ 

public class ComputePI {

    public static void main(String[] args) {

        float denominator1, denominator2, Pie, π /* result that will be print off */,
         /*Trueπ, */ value1, value2;

        //double PI;

        denominator1 = 1;
        denominator2 = 3;

        //PI = Math.PI;

        value1 = 1;
        value2 = 1;

        Pie = 900000; 

        while (denominator1 <= Pie) {

            denominator1 += 4;
            value1 += 1/denominator1;

        };

        while (denominator2 <= Pie) {

            denominator2 += 4;
            value2 += 1/denominator2;

        };

        π = 4 * (value1 - value2);
        //Trueπ = π/(PI * 100);

        System.out.println(π);

    }

}