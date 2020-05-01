package by.metelsky.algorithmization.multidimensionalarray;
/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int[] sumElementsColumns;
        int maxSum;
        int lines = 7;
        int columns = 10;
        randomMatrix = createMatrix(lines, columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix,"Исходная матрица: ");
        sumElementsColumns = new int[randomMatrix[0].length];
        sumOfColumns(randomMatrix,sumElementsColumns);
        printArray(sumElementsColumns, "Массив значений сумм столбцов: ");
        maxSum = maxValueFromArray(sumElementsColumns);
        System.out.println("Максимальное значение из сумм столбцов матрицы: " + maxSum);

    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j< matrix[0].length ; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }

    static void sumOfColumns (int[][] matrix, int[] arr) {
        for (int i = 0; i <matrix[0].length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                arr[i] = arr[i] +matrix[j][i];
            }
        }

    }
    static int maxValueFromArray(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(maxValue<arr[i]) {
              maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static void printMatrix(int[][] matrix, String s) {
        System.out.println(s);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void printArray(int[] arr, String s) {
        System.out.println(s);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
