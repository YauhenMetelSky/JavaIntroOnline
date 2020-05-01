package by.metelsky.algorithmization.multidimensionalarray;
/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix;
        int line=5;
        int column=9;
        matrix = createMatrix(line,column);
        initializeMatrix(matrix);
        printMatrix(matrix);
        checkConditionsAndPrint(matrix);
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
            // т.к. у нас матрица. т.е длины строк равны, можно использовать длину одной строки как условие в цикле
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void checkConditionsAndPrint(int[][] matrix){
        for (int i = 0; i < matrix[0].length ; i++) {
            if((i+1)%2 !=0 && matrix[0][i]>matrix[matrix.length-1][i]) {
                System.out.println("Column " + (i+1));
                for (int j = 0; j <matrix.length; j++) {
                    System.out.println(matrix[j][i]);
                }
            }

        }
    }
}
