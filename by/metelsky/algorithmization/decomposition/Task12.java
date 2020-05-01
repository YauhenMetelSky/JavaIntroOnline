package by.metelsky.algorithmization.decomposition;
/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {
    public static void main(String[] args) {
        int k = 23;
        int n = 10000;
        int[] array = createArray(k,n,20);
        printArray(array,"Массив элементами которого являются числа, сумма цифр которых равна "+k+ " и которые не большее " + n+" :");

    }
    static int[] createArray(int k, int n, int arraySize){
        int [] array = new int[arraySize];
        int randomNumber;
        for (int i = 0; i <arraySize ; ) {
            randomNumber = randomNumber(n);
            if(isSumGood(randomNumber,k)){
                array[i] = randomNumber;
                i++;
            }
        }
        return array;
    }
    static int randomNumber(int n){
        int randomNumber =(int) (Math.random() * n);
        return randomNumber;
    }
    static boolean isSumGood(int number, int k){
        if(k==sumOfNumbers(number)){
            return true;
        }
        return false;
    }
    static int sumOfNumbers(int n){
        int sum =0;
        int numberIterations = howManyDigits(n);
        for (int i = 0; i <numberIterations ; i++) {
            sum = sum + onlyTheFirsDigit(n);
            n = minusFirstDigit(n);
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
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
