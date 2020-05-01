package by.metelsky.algorithmization.multidimensionalarray;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     1   1   1  ...  1   1   1
     2   2   2  ...  2   2   0
     3   3   3  ...  3   0   0
     .........................
    n-1 n-1  0  ...  0   0   0
     n   0   0  ...  0   0   0
 */

public class Task5 {
    public static void main(String[] args) {
        int[][] squareMatrix;
        int n=8;
        squareMatrix =createMatrix(n);
        initializeMatrix(squareMatrix);
        printMatrix(squareMatrix);
    }
    static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = matrix[0].length-1-i; j >= 0 ; j--) {
                matrix[i][j] = i+1;
            }

        }
    }
    static void printMatrix(int[][] matrix) {
        System.out.println("Сформированная матрица: ");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
