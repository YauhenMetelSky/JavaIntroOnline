package by.metelsky.algorithmization.multidimensionalarray;
/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int lines = 5;
        int columns = 6;
        int replaceableColumn;
        int replacingColumn;
        String firstLine = "Введите номер заменяемого столбца( число столбцов ";
        String secondLine = "Введите номер столбца на который хотите заменить( число столбцов ";
        randomMatrix = createMatrix(lines, columns);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix,"Изначальная матрица : ");

        Scanner sc = new Scanner(System.in);
        replaceableColumn = keyboardCheckedInput(sc,firstLine,columns) - 1;
        replacingColumn = keyboardCheckedInput(sc,secondLine,columns) - 1;
        changeColumns(randomMatrix,replaceableColumn,replacingColumn);
        printMatrix(randomMatrix, "Сформированная матрица : ");

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
    //Проверяем ввод с клавиатуры число должно быть больше нуля, целым, и не больше числа столбцов в матрице
    static int keyboardCheckedInput(Scanner sc, String line, int columns) {
        int columnFromKeyboard;
        do {
            System.out.println(line + columns + ")");
            while (!sc.hasNextInt()) {
                System.out.println(" Введите целое число");
                sc.next();
            }
            columnFromKeyboard = sc.nextInt();
        } while (columnFromKeyboard < 1 || columnFromKeyboard >columns);
        return columnFromKeyboard;

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
    static void changeColumns(int[][] matrix, int replaceable, int replacing) {
        int intermediateNumber;
        for (int i = 0; i < matrix.length ; i++) {
            intermediateNumber = matrix[i][replaceable];
            matrix[i][replaceable] = matrix[i][replacing];
            matrix[i][replacing] = intermediateNumber;
        }
    }
}
