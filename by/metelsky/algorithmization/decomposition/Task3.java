package by.metelsky.algorithmization.decomposition;
/*
Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.
 */

public class Task3 {
    public static void main(String[] args) {
        double hexagonSquare;
        int side = 6;
        hexagonSquare = triangleSquare(side) * 6;
        System.out.println("Hexagon's with side " + side +"square = "  + hexagonSquare);

    }

    static double triangleSquare(int side){
        double square = (Math.sqrt(3)/4)*(Math.pow(side,2));
        return square;
    }
}
