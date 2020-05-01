package by.metelsky.basic.linear;
/*

Найти значение функции ( (sin x + cos y) / (cos x - sin y) ) * tg x * y
 */

public class Task3 {
    public static void main(String[] args) {
        double functionResult;
        //в качестве параметров передаем значение угла в радианах
        functionResult = functionTrigonometric(0.785,1.57); // 45 and 90 degrees
        System.out.println(functionResult);


    }
    public static double functionTrigonometric(double x, double y) {
        double result;
        result =((Math.sin(x) + Math.cos(y))/(Math.cos(x)- Math.sin(y)))* Math.tan(x * y);

        return result;

    }
}

