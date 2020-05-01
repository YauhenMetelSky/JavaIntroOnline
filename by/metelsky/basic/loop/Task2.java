package by.metelsky.basic.loop;
/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y= x, x>2
y =-x, x<=2
 */

public class Task2 {
    public static void main(String[] args) {
        functionResult(-11, 26, 3);

    }
    public static void functionResult(int a, int b, int h) {
        double result;

        for(int i =a; i<=b; i+= h) {
            result = i > 2 ? i: -i;
            System.out.println(result);
        }

    }
}
