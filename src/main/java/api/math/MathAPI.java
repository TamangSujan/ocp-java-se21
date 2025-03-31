package api.math;

import java.math.BigDecimal;
import java.util.Random;

public class MathAPI {
    public static void main(String[] args) {
        floor();
        ceil();
        random();
        others();
    }

    private static void floor(){
        double notFloor = Math.floor(3.14);
        double floor = Math.floor(-3.00001);

        System.out.println(notFloor);
        System.out.println(floor);

        /*
        * Floor in math api removes numbers after decimal dot
        * For positive number, it removes fraction part and set it 0
        * For negative number, if fraction is not 0 then it will add value 1 to original number and set 0 to fraction
        */
    }

    private static void ceil(){
        double notCeil = Math.ceil(3.00001);
        double ceil = Math.ceil(-3.54);

        System.out.println(notCeil);
        System.out.println(ceil);

        /*
         * Ceil in math api removes numbers after decimal dot
         * For positive number, if fraction is not 0 then it will add value 1 to original number and set 0 to fraction
         * For negative number, it removes fraction part and set it 0
         */
    }

    private static void random(){
        double random = Math.random();
        int randomInt = new Random().nextInt();
        double randomDouble = new Random().nextDouble();

        System.out.println(random);
        System.out.println(randomInt);
        System.out.println(randomDouble);
    }

    private static void others(){
        BigDecimal add = BigDecimal.ONE.add(BigDecimal.valueOf(2.0));
        System.out.println(add);

        int overflow = Integer.MAX_VALUE + 1;
        System.out.println(overflow); // If overflow occurs on positive number then sign bit will be incremented where negative number is seen

        int throwsIntegerOverflow = Math.addExact(Integer.MAX_VALUE, 1);
        System.out.println(throwsIntegerOverflow);
    }
}
