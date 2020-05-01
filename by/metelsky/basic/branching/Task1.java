package by.metelsky.basic.branching;
/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 и если да, то будет ли он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {
// в качестве параметров передаем значения углов в градусах
        isTriangleReal(90,88);


    }
    public static void isTriangleReal(double a, double b){

        double lastAngle;
        lastAngle = 180 - a - b;
        if(lastAngle > 0){
            System.out.println("Треугольник с углами: "+ a + " и " + b + " градусов существует.");
            if(a == 90 || b == 90 || lastAngle == 90) {
                System.out.println("Такой треугольник является прямоугольным");
            } else {
                System.out.println("Такой треугольник не является прямоугольным");
            }
        } else {
            System.out.println("Треугольник с углами: "+ a + " и " + b + " градусов не существует.");

        }


    }
}
