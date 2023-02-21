/*

    - Start with adding variables
    - make loop
    - Compute π

*/ 

public class ComputePI {

    public static void main(String[] args) {

        float denominator1, denominator2, PI, π /* result that will be print off */,
         value1, value2;

        denominator1 = 1;
        denominator2 = 3;

        value1 = 1;
        value2 = 1;

        PI = 500000; 

        while (denominator1 <= PI) {

            denominator1 += 4;
            value1 += 1/denominator1;

        };

        while (denominator2 <= PI) {

            denominator2 += 4;
            value2 += 1/denominator2;

        };

        π = 4 * (value1 - value2);

        System.out.println(π);

    }

}