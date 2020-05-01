package by.metelsky.algorithmization.decomposition;
/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Sum factorials of odd numbers from 1 to 9: "+ findSumFactorialOddNumbers(1,9));

    }
    static int findSumFactorialOddNumbers(int firstNumber, int lastNumber) {
        if(firstNumber%2 == 0){
            firstNumber++;

        }
        if (lastNumber%2 == 0){
            lastNumber--;
        }
        int sum = 0;
        for (int i = 1; i <= lastNumber ; i+=2) {
            sum = sum+ findFactorial(i);
        }
        return sum;
    }
    static int findFactorial(int number) {
        int result =1;
        for (int i = 2; i <=number ; i++) {
            result = result*i;
        }
        return result;
    }
}
