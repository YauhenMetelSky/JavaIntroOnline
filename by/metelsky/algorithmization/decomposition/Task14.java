package by.metelsky.algorithmization.decomposition;
/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.
 */

public class Task14 {
    public static void main(String[] args) {
        int k = 100000;
        int[] armstrongNumbers = findArmstrongNumbers(k);
        printArray(armstrongNumbers,"Числа армстронга из диапазона от 1 до " +k+ " :");

    }
    static int[] findArmstrongNumbers(int border){
        int[] armstrongNumbers = new int[88];
        int counter =0;
        for (int i = 1; i <=border ; i++) {
            if(isArmstrongNumber(i)){
                armstrongNumbers[counter] = i;
                counter++;
            }
        }
        return armstrongNumbers;
    }
    static boolean isArmstrongNumber(int number){
        if(number==sumOfNumbersPow(number)) {
            return true;
        }
        return false;

    }
    static int sumOfNumbersPow(int number){
        int sum =0;
        int numberIterations = howManyDigits(number);
        for (int i = 0; i <numberIterations ; i++) {
            sum = sum + (int) Math.pow(onlyTheFirsDigit(number),numberIterations);
            number = minusFirstDigit(number);
        }
        return sum;
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
    static void printArray(int [] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            //чтобы не выводить нули в массиве, т.к. мы находим не все числа армстронга
            if(array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
}
