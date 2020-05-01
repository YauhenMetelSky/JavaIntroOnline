package by.metelsky.algorithmization.multidimensionalarray;
/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int lines = 7;
        int columns = 10;
        randomMatrix = createMatrix(lines,columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix,"Исходная матрица: ");
        bubleSortAscending(randomMatrix);
        printMatrix(randomMatrix,"Матрица со строками отсортированными по возрастанию: ");
        bubleSortDescending(randomMatrix);
        printMatrix(randomMatrix,"Матрица со строками отсортированными по убыванию: ");

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
        for (int i = 0; i < matrix.length; i++) {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] < matrix[i][j - 1]) {
                        swap(matrix, i, j, j - 1);
                        needIteration = true;
                    }
                }
            }
        }
    }
    static void bubleSortDescending(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] > matrix[i][j - 1]) {
                        swap(matrix, i, j, j - 1);
                        needIteration = true;
                    }
                }
            }
        }
    }
    static void swap(int[][] matrix,int lineNumber, int index1, int index2){
        int temp = matrix[lineNumber][index1];
        matrix[lineNumber][index1] = matrix[lineNumber][index2];
        matrix[lineNumber][index2]=temp;

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
