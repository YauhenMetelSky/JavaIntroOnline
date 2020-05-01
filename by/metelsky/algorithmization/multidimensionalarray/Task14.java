package by.metelsky.algorithmization.multidimensionalarray;
/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        int [][] randomMatrix;
        //условие выполнимо только при количестве строк m >= (n -1) и m>0 и n>0 , поэтому
        // мы получаем 2 случайных целых числа до тех пор пока не выполнятся эти условия
        boolean flag = true;
        int m = 0;
        int n = 0;
        while (flag){
        m = (int)(Math.random()*10);
        n = (int)(Math.random()*10);
            if(m!=0 && n!=0&& m >= (n - 1)) {
            flag = false;
            }
        }

        randomMatrix = createMatrix( m, n);
        initializeMatrix(randomMatrix);
        printMatrix(randomMatrix, "Сформированная матрица размером " + m + "x" +n);

    }
    static int[][] createMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        return matrix;
    }
    static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i <matrix[0].length ; i++) {
            for (int j = 0; j< i ; j++) {
                boolean flag = true;
                while (flag) {
                    int index = (int) (Math.random() * (matrix.length));
                    if(matrix[index][i] == 0){
                    matrix[index][i] = 1;
                    flag = false;
                    }

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
