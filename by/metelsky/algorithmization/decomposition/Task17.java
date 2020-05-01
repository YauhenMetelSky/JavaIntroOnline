package by.metelsky.algorithmization.decomposition;
/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */

public class Task17 {
    public static void main(String[] args) {
        int number =1786538;
        int counterIterations = subtractionSumOfDigitsToNull(number);
        System.out.println("Чтобы получить нуль вычитая сумму его цифр из числа " + number+ " необходимо произвести "+ counterIterations +" действий");
    }
    static int subtractionSumOfDigitsToNull(int number){
        int counter =0;
        while (number>0){
            number=subtractSumOfDigits(number);
            counter++;
        }
        return counter;
    }
    static int subtractSumOfDigits(int number){
        number = number - sumOfDigits(number);
        return number;
    }
    static int sumOfDigits(int number){
        int sum =0;
        int[] digits = numberToDigits(number);
        for (int i = 0; i <digits.length ; i++) {
            sum = sum + digits[i];
        }
        return sum;
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

}
