package by.metelsky.algorithmization.decomposition;
/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task15 {
    public static void main(String[] args) {
        int n =4;
       printIncreasingSequence(n);
    }
    static void printIncreasingSequence(int n){
        int start = startNumber(n);
        int end = endNumber(n);
        int[] numberToDigits;
        for (int i = start; i <=end ; i++) {
            numberToDigits = numberToDigits(i);
            if(isSequenceIncreasing(numberToDigits)){
                System.out.println(i);
            }
        }
    }
    static int[] numberToDigits (int number){
        int digits = howManyDigits(number);
        int[] arrDigits = new int[digits];
        for (int i = 0; i <digits ; i++) {
            arrDigits[i] = onlyTheFirsDigit(number);
            number = minusFirstDigit(number);
        }
        return arrDigits;
    }
    static int startNumber(int n){
        int startNumber = (int) Math.pow(10,n-1);
        return startNumber;
    }
    static int endNumber(int n){
        int number = (int) Math.pow(10,n)-1;
        return number;
    }
    static int minusFirstDigit(int number){
        int digits = howManyDigits(number);
        //Проверка, что разрядов больше одного
        if(digits>0) {
            int restOfNumber = number % (int) (Math.pow(10, digits - 1));
            return restOfNumber;
        } else {
            return number;
        }
    }
    static int onlyTheFirsDigit(int number){
        int digits = howManyDigits(number);
        if (digits>0) {
            int restOfNumber = minusFirstDigit(number);
            number = (number - restOfNumber) / (int) (Math.pow(10, digits - 1));
            return number;
        } else {
            return number;
        }
    }
    static int howManyDigits(int number){
        int digitCounter =0;
        while (number!=0){
            number /=10;
            digitCounter++;
        }
        return digitCounter;
    }
    static boolean isSequenceIncreasing(int[] sequence){
        boolean flag = true;
        for (int i = 0; i <sequence.length-1 ; i++) {
            if (sequence[i]>=sequence[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
