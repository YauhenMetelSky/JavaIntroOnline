package by.metelsky.basic.branching;
/*
Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        int min1;
        int min2;
        int max;
        int a = 9;
        int b = 7;
        int c= 3;
        int d= 14;
        min1 = minValue(a,b);
        min2 = minValue(c,d);
        max = maxValue(min1, min2);
        System.out.println("Максимальное значение среди: " + min1 + " и " + min2 + " = " + max);

    }
    public static int minValue(int a, int b){
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
    public static int maxValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
