package by.metelsky.algorithmization.multidimensionalarray;
/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args) {
    int[][]randomMatrix;
    int size = 8;
    int[] positiveValuesMainDiagonal = new int[size];
    randomMatrix = createMatrix(size,size);
    initializeMatrix(randomMatrix);
    printMatrix(randomMatrix, "Исходная матрица: ");
    findPositiveValues(randomMatrix,positiveValuesMainDiagonal);
    printArray(positiveValuesMainDiagonal,"Положительные значения главной диагонали: ");
    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j< matrix[0].length ; j++) {
                matrix[i][j] = (int)((Math.random()-0.5)*10);
            }
        }
    }

    static void findPositiveValues(int[][] matrix, int[] arr){
        for (int i = 0, j = 0; i <matrix.length ; i++) {
            if (matrix[i][i] > 0) {
             arr[j] = matrix[i][i];
             j++;
            }
        }
    }
    static void printMatrix(int[][] matrix, String s) {
        System.out.println(s);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] >= 0){
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    static void printArray(int[] arr, String s) {
        System.out.println(s);
        for (int i = 0; i < arr.length ; i++) {
        //выводим в консоль только положительные значения, игнорируя нули
            if(arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
}
