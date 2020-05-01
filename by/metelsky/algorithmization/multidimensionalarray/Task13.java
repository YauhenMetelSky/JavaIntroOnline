package by.metelsky.algorithmization.multidimensionalarray;
/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int lines = 7;
        int columns = 10;
        randomMatrix = createMatrix(lines,columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix,"Исходная матрица: ");
        bubleSortAscending(randomMatrix);
        printMatrix(randomMatrix,"Матрица со столбцами отсортированными по возрастанию: ");
        bubleSortDescending(randomMatrix);
        printMatrix(randomMatrix,"Матрица со столбцами отсортированными по убыванию: ");

    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j< matrix[0].length ; j++) {
                matrix[i][j] = (int)(Math.random()*21);
            }
        }
    }

    static void bubleSortAscending(int [][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int j = 1; j < matrix.length; j++) {
                    if (matrix[j][i] < matrix[j-1][i]) {
                        swap(matrix, i, j, j - 1);
                        needIteration = true;
                    }
                }
            }
        }
    }
    static void bubleSortDescending(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int j = 1; j < matrix.length; j++) {
                    if (matrix[j][i] > matrix[j-1][i]) {
                        swap(matrix, i, j, j - 1);
                        needIteration = true;
                    }
                }
            }
        }
    }
    static void swap(int[][] matrix,int columnNumber, int index1, int index2){
        int temp = matrix[index1][columnNumber];
        matrix[index1][columnNumber] = matrix[index2][columnNumber];
        matrix[index2][columnNumber]=temp;

    }
    static void printMatrix(int[][] matrix, String s) {
        System.out.println(s);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] < 10){
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

}
