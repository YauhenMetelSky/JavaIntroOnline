package by.metelsky.algorithmization.multidimensionalarray;
/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {
    public static void main(String[] args) {
        int [][] randomMatrix;
        int line = 7;
        int columns =8;
        int maxValue;
        randomMatrix = createMatrix(line, columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix,"Изначальная матрица: ");
        maxValue = findMaxElement(randomMatrix);
        System.out.println("Наибольший элемент матрицы = "+ maxValue);
        replaceOddNumbers(randomMatrix, maxValue);
        printMatrix(randomMatrix, "Преобразованная матрица: ");


    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j< matrix[0].length ; j++) {
                matrix[i][j] = (int)(Math.random()*40);
            }
        }
    }
    static int findMaxElement(int[][] matrix){
        int maxValue = matrix[0][0];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
    static void replaceOddNumbers(int[][] matrix, int valueToReplace){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]%2 != 0){
                    matrix[i][j] = valueToReplace;
                }
            }
        }
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
