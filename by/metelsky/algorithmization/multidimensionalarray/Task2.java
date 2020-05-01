package by.metelsky.algorithmization.multidimensionalarray;
/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task2 {
    public static void main(String[] args) {
        int[][] squareMatrix;
        int line = 10;
        int columns = 10;
        squareMatrix = createMatrix(line,columns);
        initializeMatrix(squareMatrix);
        printMatrix(squareMatrix);
        printDiagonal(squareMatrix);

    }
    static int[][] createMatrix(int line, int column) {
        int[][] matrix = new int[line][column];
        return matrix;
    }

    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void printDiagonal(int[][] matrix){
        System.out.println("Элементы матрицы стоящие на диагонали: ");
        for (int i = 0; i <matrix.length ; i++) {
            System.out.print(matrix[i][i] + " ");

        }
    }
}
