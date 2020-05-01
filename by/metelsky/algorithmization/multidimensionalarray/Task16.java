package by.metelsky.algorithmization.multidimensionalarray;
/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2^n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.Пример магического квадрата порядка 3:
                                          6 1 8
                                          7 5 3
                                          2 9 4
 */

public class Task16 {
        public static void main(String[] args) {
        int n = 8;
        int[][] magicSquare;
        int magicConstant = n*(n*n +1)/2;
        magicSquare = createMatrix(n);
      //Проверка какой именно тип квадрата будем строить
        if(n%2 ==0) {
            if(n%4==0){
                doublyEvenMagicSquare(magicSquare);
            } else {
                singlyEvenMagicSquare(magicSquare);
            }

        }else {
            oddMagicSquare(magicSquare, 1);
        }

        System.out.println("Магическая константа =" + magicConstant);
        printMatrix(magicSquare,"Магический квадрат: ");

    }
    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        return matrix;
    }
    //http://www.1728.org/magicsq3.htm

    static void singlyEvenMagicSquare(int[][] matrix){
        int[][] tempMatrix1 = new int[matrix.length/2][matrix.length/2];
        //количество цифр в квадранте
        int numberOfDigitsInTmpSquare = (matrix.length/2)* (matrix.length/2);
        oddMagicSquare(tempMatrix1,1);
        fillInTheMatrix(matrix,tempMatrix1,1);
        matrixToNull(tempMatrix1);
        oddMagicSquare(tempMatrix1, 1+numberOfDigitsInTmpSquare);
        fillInTheMatrix(matrix,tempMatrix1,4);
        matrixToNull(tempMatrix1);
        oddMagicSquare(tempMatrix1, 1+2*numberOfDigitsInTmpSquare);
        fillInTheMatrix(matrix,tempMatrix1,2);
        matrixToNull(tempMatrix1);
        oddMagicSquare(tempMatrix1,1+3*numberOfDigitsInTmpSquare);
        fillInTheMatrix(matrix,tempMatrix1,3);

        movingNumbers(matrix);

    }
    static void matrixToNull(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                matrix[i][j] =0;
            }
        }
    }
    static void movingNumbers(int[][] matrix){
        int numberOfColumnsToMoveRightSide = matrix.length/4-1;
        int numberOfColumnsToMoveLeftSide = matrix.length/4;
        int tmpNumber;
        for (int i = 0; i <numberOfColumnsToMoveLeftSide ; i++) {
            for (int j = 0; j <numberOfColumnsToMoveLeftSide ; j++) {
                tmpNumber = matrix[i][j];
                matrix[i][j] = matrix[i+matrix.length/2][j];
                matrix[i+matrix.length/2][j] = tmpNumber;
            }
        }
        for (int i = matrix.length/4+1; i < matrix.length/2 ; i++) {
            for (int j = 0; j < numberOfColumnsToMoveLeftSide ; j++) {
                tmpNumber = matrix[i][j];
                matrix[i][j] = matrix[i+matrix.length/2][j];
                matrix[i+matrix.length/2][j] = tmpNumber;
            }
        }
        for (int i = 1; i <numberOfColumnsToMoveLeftSide+1 ; i++) {
                    tmpNumber = matrix[matrix.length/4][i];
                matrix[matrix.length/4][i] = matrix[matrix.length/4+matrix.length/2][i];
                matrix[matrix.length/4+matrix.length/2][i] = tmpNumber;
        }
        for (int i = 0; i <matrix.length/2 ; i++) {
            for (int j = matrix.length - numberOfColumnsToMoveRightSide; j <matrix.length ; j++) {
                tmpNumber = matrix[i][j];
                matrix[i][j] = matrix[i+matrix.length/2][j];
                matrix[i+matrix.length/2][j] =tmpNumber;
            }
        }
    }
    static void fillInTheMatrix(int[][] toMatrix, int [][] fromMatrix, int kvadrant){
        int startRow =0;
        int endRow=0;
        int startColumn=0;
        int endColumn=0;
        switch (kvadrant){
            case 1: startRow =0;
                    endRow = toMatrix.length/2;
                    startColumn = 0;
                    endColumn = toMatrix.length/2;
                    break;
            case 2: startRow = 0;
            endRow = toMatrix.length/2;
            startColumn = toMatrix.length/2;
            endColumn = toMatrix.length;
            break;
            case 3: startRow = toMatrix.length/2;
            endRow = toMatrix.length;
            startColumn = 0;
            endColumn = toMatrix.length/2;
            break;
            case 4: startRow =toMatrix.length/2;
            endColumn = toMatrix.length;
            startColumn = toMatrix.length/2;
            endColumn = toMatrix.length;
            break;
        }
        for (int i = 0; i <fromMatrix.length ; i++) {
            for (int j = 0; j <fromMatrix.length ; j++) {
                toMatrix[i+startRow][j+startColumn] = fromMatrix[i][j];
            }
        }
    }
    static void doublyEvenMagicSquare(int[][] matrix){
        int sizeMatrix = matrix.length;
        //заполнили маркерами верхний левый квадрат матрицы(квадранта 1)
        //в правом верхнем квадранте нам необходимо зеркальное отражение, это делаем в этом же цикле
        //зеркальный индекс равен sizeMatrix-1-j
        for (int i = 0; i <sizeMatrix/2 ; i++) {
            for (int j = 0; j <sizeMatrix/2 ; ) {
                if(i ==0 || i%2==0) {
                    matrix[i][j] = -1;
                    matrix[i][sizeMatrix-1-j] = -1;
                    j+=2;
                } else { if(j>0 && j%2!=0) {
                    matrix[i][j] = -1;
                    matrix[i][sizeMatrix-1-j] = -1;
                }
                   j++;
                }
            }
        }

        //Перебираем все клетки матрицы там где стоит маркер -1 ставим N^2+1-counter, там где маркер
        //отсутствует очередной counter.
        int counter =1;
        for (int i = 0; i <sizeMatrix/2 ; i++) {
            for (int j = 0; j <sizeMatrix ; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j] = sizeMatrix*sizeMatrix+1-counter;
                    //вторая ячейка матрицы зеркально отражена от первой согласно центральной точки,
                    //поэтому индекс данной ячейки = size-i -1 и size - j -1
                    matrix[sizeMatrix -i - 1][sizeMatrix - j - 1] = counter;
                }
                if(matrix[i][j] == 0){
                    matrix[i][j] = counter;
                    matrix[sizeMatrix-i - 1][sizeMatrix - j -1] = sizeMatrix*sizeMatrix+1-counter;
                }
                counter++;
            }
        }
    }

// https://studfiles.net/preview/1702019/page:4/
      static void oddMagicSquare(int[][] matrix, int startNumber){
        int size = matrix.length;
        int valueOfIteration = size*size;
        int rowPosition = 0;//стартовые позиции
        int columnPosition = size/2;// стартовые позиции
          matrix[rowPosition][columnPosition] =startNumber;
          int counter = startNumber+1;
        for (int i = 0; i < valueOfIteration-1;i++) {
            rowPosition--;
            columnPosition++;
            //По диагонали
           if(rowPosition == -1&& columnPosition == size){
                rowPosition +=2;
                columnPosition --;
           }
            //Сверху
           if(rowPosition==-1){
               rowPosition = size-1;
           }
           //Сбоку
           if(columnPosition==size){

               columnPosition =0;
           }
           //Клетка занята
           if(matrix[rowPosition][columnPosition]!=0){

               columnPosition--;
               rowPosition+=2;
           }
            matrix[rowPosition][columnPosition] =counter;
           counter++;
        }
    }

    public static void printMatrix(int[][] matrix, String s) {
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
