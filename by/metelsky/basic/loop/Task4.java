package by.metelsky.basic.loop;
/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        int start = 1;
        int end = 200;
        int resultMultiplying;
        resultMultiplying = multipliedNumInPow(start, end);
        System.out.println(resultMultiplying);
    }

    public static int multipliedNumInPow (int start, int end) {
        int result = 1;
        for (int i = start; i<= end; i++) {
           result *= Math.pow(i,2);
        }
        return result;
    }
}
