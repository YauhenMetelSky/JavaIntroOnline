package by.metelsky.basic.branching;
/*
Вычислить значение функции: если х<=3 F(x)=x*x -3*x +9; Если x>3 F(x) = 1/(Math.pow(x,3)+6
 */

public class Task5 {
    public static void main(String[] args) {

        System.out.println(functionResult(8));

    }
    public static double functionResult(double x) {

        double result;

        if(x<= 3) {
            result =Math.pow(x,2) - 3*x +9;
        } else {
            result = 1/(Math.pow(x,3)+6);
        }
        return result;
    }

}

