package by.metelsky.basic.linear;
/* Найдите значение функции z =((a-3)*b/2)+c

 */

public class Task1 {
    public static void main(String[] args) {

        System.out.println(task1(2.1, 3.0,2.37));

    }
    public static double task1 (double a, double b, double c) {

        double z;

        z =((a - 3)* b/2 )+ c;

        return z;
    }
}