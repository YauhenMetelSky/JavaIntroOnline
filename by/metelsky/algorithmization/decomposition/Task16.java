package by.metelsky.algorithmization.decomposition;
/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
    public static void main(String[] args) {
        int n = 4;
        int[] numbers = {1234, 2222, 11, 357, 3251, 1111, 624, 2468,1357, 12, 3366, 8248, 123,0,5964};
        int sumOfNumbersOddDigits = sumOfNumbersOddDigits(numbers,n);
        int numberEvenDigits = howManyEvenDigits(sumOfNumbersOddDigits);
        System.out.println("Сумма чисел содержащих только нечетные числа = "+ sumOfNumbersOddDigits);
        System.out.println("Количество четных цифр в найденной сумме = "+ numberEvenDigits);

    }
    static int sumOfNumbersOddDigits(int[] numbers, int numberStandard){
        int sum =0;
        for (int i = 0; i <numbers.length ; i++) {
            if(isNumberGoToSum(numberStandard, numbers[i])){
                sum = sum+ numbers[i];
            }
        }
        return sum;
    }
    static int howManyEvenDigits(int number){
        int counter =0;
        while (number>0){
           if(number%2==0){
               counter++;
           }
           number = number/10;
       }
       return counter;
    }
    static boolean isNumberGoToSum (int numberOfDigitsStandart, int number){
        if(!isNumberOfDigitsOk(numberOfDigitsStandart,number)){
            return false;
        } else if(!isNumberOdd( number)){
            return false;
        }        else if(allDigitsOdd(number)){
            return true;
        }
        return false;

    }
    static boolean allDigitsOdd(int number){
        while (number>0){
            if(number%2!=0){
               number = number/10;
            } else {
                return false;
            }
        }
        return true;
    }
    static boolean isNumberOdd(int Number){
        if(Number%2!=0){
            return true;
        }
        return false;
    }
    static boolean isNumberOfDigitsOk(int numberOfDigitsStandard, int number){
        int numberOfDigits = howManyDigits(number);
        if(numberOfDigitsStandard == numberOfDigits){
           return true;
        }
        return false;
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
