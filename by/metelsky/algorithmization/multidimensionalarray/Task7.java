package by.metelsky.algorithmization.multidimensionalarray;
/*
    Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin{(I*I - J*J)/N}
    и подсчитать количество положительных элементов в ней.
     */
public class Task7 {
    public static void main(String[] args) {
        double[][] squareMatrix;
        int n = 6;
        int positiveNumbers;
        squareMatrix = createMatrix(n);
        initializeMatrix(squareMatrix);
        printMatrix(squareMatrix);
        positiveNumbers = countPositiveNumbers(squareMatrix);
        System.out.println("Количество позитивных элементов в матрице = " + positiveNumbers);

    }
    static double[][] createMatrix(int n) {
        double[][] matrix = new double[n][n];
        return matrix;
    }
    static void initializeMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/matrix.length);
            }
        }
    }
    static void printMatrix(double[][] matrix) {
        System.out.println("Сформированная матрица: ");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static int countPositiveNumbers(double[][] matrix) {
        int counterPositiveNumbers =0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] > 0){
                    counterPositiveNumbers++;
                }
            }
        }
        return counterPositiveNumbers;
    }


}
