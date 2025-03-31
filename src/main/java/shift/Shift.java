package shift;

public class Shift {
    public static void main(String[] args) {
        int doubleShiftPositive = 1;
        int doubleShiftNegative = -1;

        int tripleShiftPositive = 1;
        int tripleShiftNegative = -1;

        doubleShiftPositive >>= 2;
        doubleShiftNegative >>= 2;
        tripleShiftPositive >>>= 2;
        tripleShiftNegative >>>= 2;

        /*
        * Double shift only works with positive value
        * Triple shift works with both positive and negative value but,
        * If value is positive it will not be negative as it is only shifting where shifted bits are lost
        * It value is negative, it will shift 32th bit which is sign bit by treating as number bit
        * so 11111111111111111111111111111111 which is -1 if we used 2's complement
        * first and second bit are lost and rest are shifted towards right along with sign bit
        * it becomes 00111111111111111111111111111111 which is a positive number as 32bit which is sign bit is positive
        */

        System.out.println(doubleShiftPositive);
        System.out.println(doubleShiftNegative);
        System.out.println(tripleShiftPositive);
        System.out.println(tripleShiftNegative);

        System.out.println(0b11111111111111111111111111111111 + " Triple Shifted by 2 = " + 0b00111111111111111111111111111111);
    }
}
