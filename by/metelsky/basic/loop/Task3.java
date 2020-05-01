package by.metelsky.basic.loop;
/*
Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int sumOfNumbers = sumOfNumbersInPow(start,end);

        System.out.println(sumOfNumbers);
    }
    public static int sumOfNumbersInPow(int start, int end) {
        int result = 0;
        for(int i = start; i<= end;i++) {
            result +=Math.pow(i,2);
        }
        return result;

    }

}
