package by.metelsky.algorithmization.multidimensionalarray;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
   1   2     3  ...n
   n (n-1) (n-2)...1
   1   2     3  ...n
   n (n-1) (n-2)...1
   ................
   n (n-1) (n-2)...1
 */

public class Task4 {
    public static void main(String[] args) {
        int[][] squareMatrix;
        int n = 8;
        squareMatrix = createMatrix(n);
        initializeMatrix(squareMatrix);
        printMatrix(squareMatrix);
    }
    static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            if((i+1)%2 !=0){
                for (int j = 0; j <matrix[0].length ; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j <matrix[0].length ; j++) {
                    matrix[i][j] = matrix[0].length-j;
                }
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
