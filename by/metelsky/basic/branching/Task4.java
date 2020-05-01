package by.metelsky.basic.branching;
/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println(isToLarge(7,4,8, a, b));

    }
    public static boolean isToLarge( int x, int y, int z, int a, int b) {

        boolean conditionA;
        boolean conditionB;
        boolean conditionC;

        conditionA = sizeCheck(x, y, a, b);
        conditionB = sizeCheck(x, z, a, b);
        conditionC = sizeCheck(y, z, a, b);

        if (conditionA || conditionB || conditionC){
            return true;
        } else {
            return false;
        }
    }

    public static boolean sizeCheck(int x, int y, int a, int b) {

        if((x<a && y< b) || (y< a && x < b)) {
            return true;
        } else {
            return false;
        }
    }


}

