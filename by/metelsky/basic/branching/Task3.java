package by.metelsky.basic.branching;
/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
        boolean pointsOnOneLine;
        pointsOnOneLine = isPointsOnOneLine(-2,5,4,3,16,-1);
        if(pointsOnOneLine) {
            System.out.println("Данные точки расположены на одной прямой");
        } else {
            System.out.println("Данные точки не расположены на одной прямой");
        }



    }
    public static boolean isPointsOnOneLine (int x1, int y1, int x2, int y2, int x3, int y3){
        int result;
        result = ((y3-y1) *(x2-x1))-((y2-y1)*(x3-x1));

        if (0 == result){
            return true;
        } else {
            return false;
        }



    }
}
