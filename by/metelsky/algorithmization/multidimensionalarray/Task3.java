package by.metelsky.algorithmization.multidimensionalarray;
/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int line = 5;
        int column = 7;
        int lineToPrint =3;
        int columnToPrint = 7;
        randomMatrix = createMatrix(line, column);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix);
        printMatrixLine(randomMatrix,lineToPrint);
        System.out.println("");
        printMatrixColumn(randomMatrix,columnToPrint);

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
        System.out.println("Исходная матрица: ");
        for (int i = 0; i <matrix.length ; i++) {
            // т.к. у нас матрица. т.е длины строк равны, можно использовать длину одной строки как условие в цикле
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void printMatrixLine(int[][] matrix, int line){
        System.out.println("Строка матрицы номер " + line +":");
        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.print(matrix[line-1][i]+ " ");
        }

    }
    static void printMatrixColumn(int[][] matrix, int column){
        System.out.println("Столбец матрицы номер " + column +":");
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(matrix[i][column-1]);
        }

    }
}
