package by.metelsky.algorithmization.multidimensionalarray;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 1 1 ... 1 1 1
 0 1 1 ... 1 1 0
 0 0 1 ... 1 0 0
 ...........
 0 1 1 ... 1 1 0
 1 1 1 ... 1 1 1
 */

public class Task6 {
    public static void main(String[] args) {
        int[][] squareMatrix;
        int n=16;
        squareMatrix =createMatrix(n);
        initializeMatrix(squareMatrix);
        printMatrix(squareMatrix);
    }
    static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        return matrix;
    }
    //т.к. матрица квадратная и n четное можно разбить заполнение матрицы на 4 разных части
    static void initializeMatrix(int[][] matrix) {
        int counter =0;
        //Заполняет левую верхнюю часть
        for (int i = 0; i <matrix.length/2 ; i++) {
            for (int j = i; j <matrix.length/2 ; j++) {
                matrix[i][j] = 1;
            }
        }
        //Заполняет правую верхнюю часть
        for (int i = 0; i <matrix.length/2 ; i++) {
            for (int j = matrix.length-1-i; j >=matrix.length/2 ; j--) {
                matrix[i][j] = 1;
            }
        }
        //Заполняет нижнюю левую часть
        for (int i = matrix.length-1; i > matrix.length/2-1 ; i--) {
            for (int j = counter; j < matrix.length/2 ; j++) {
                matrix[i][j] = 1;
            }
            counter++;
        }
        counter = 0;
        //Заполняет нижнюю правую часть
        for (int i = matrix.length-1; i > matrix.length/2-1 ; i--) {
            for (int j = matrix.length-1-counter; j >=matrix.length/2 ; j--) {
                matrix[i][j] = 1;
            }
            counter++;
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
