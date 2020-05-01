package by.metelsky.algorithmization.multidimensionalarray;
/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int lines = 10;
        int columns = 20;
        int[] numbersRows = new int[lines];
        randomMatrix = createMatrix(lines,columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix, "Сформированная матрица: ");
        findRows(randomMatrix,numbersRows);
        printArray(numbersRows,"Номера строк в которых цифра 5 встречается 3 и более раз: ");

    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j< matrix[0].length ; j++) {
                matrix[i][j] = (int)(Math.random()*16);;
            }
        }
    }
    static void findRows(int[][] matrix, int[] arr){
        for (int i = 0, arrayIndex = 0; i <matrix.length ; i++) {
            int counterFrequencyNumber =0;
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] == 5) {
                    counterFrequencyNumber++;
                }
            }
            if (counterFrequencyNumber > 2) {
                arr[arrayIndex] = i+1;
                arrayIndex++;
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
