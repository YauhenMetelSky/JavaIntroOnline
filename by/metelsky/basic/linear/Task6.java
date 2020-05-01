package by.metelsky.basic.linear;
/*
Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */

public class Task6 {
    public static void main(String[] args) {
        boolean pointInArea;
        pointInArea = isPointInArea(-1,3);
        System.out.println(pointInArea);

    }
    public static boolean isPointInArea (int x, int y) {
        boolean isPointInSquareOne;
        boolean isPointInSquareTwo;
        boolean result;
        isPointInSquareOne = -2 <= x && x <=2 && 0< y && y <= 4;
        isPointInSquareTwo =-4 <= x && x <= 4 && -3 <= y && y <= 0;
        result = isPointInSquareOne||isPointInSquareTwo;
        return result;



    }
}

