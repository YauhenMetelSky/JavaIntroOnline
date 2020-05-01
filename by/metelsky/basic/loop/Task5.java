package by.metelsky.basic.loop;
/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
a(n) = 1/(2^n) + 1/(3^n)
 */

public class Task5 {
    public static void main(String[] args) {
        double sumOfValue;
        sumOfValue = sumFunctionValue(10,0.37);
        System.out.println(sumOfValue);

    }
    public static double sumFunctionValue(int n, double e) {
        double sum=0;

        for(int i=1; i<=n; i++) {
            double a;
            a = 1/(Math.pow(2,i)) + 1/(Math.pow(3,i));
            if(Math.abs(a) >= e) {
                sum += a;
            }
        }
        return sum;
    }
}
