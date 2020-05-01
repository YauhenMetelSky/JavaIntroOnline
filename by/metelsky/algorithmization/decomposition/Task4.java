package by.metelsky.algorithmization.decomposition;
/*
На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние. Указание.
 Координаты точек занести в массив.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] coordinatesX = {2,7,12,3,8,1,9,0};
        int[] coordinatesY ={5,8,3,6,5,9,0,7};
        double[] lineLength = findAllLength(coordinatesX,coordinatesY);
        printArray(lineLength,"length of lines:");
        System.out.println("Max length is " + lineLength[foundIndexMaxElement(lineLength)]);


    }
    static double[] findAllLength(int[] xCoordinnates, int[] yCoordinates){
        int combinationsNumber = combinationNumbers(xCoordinnates.length,2);
        double[] lineLengths = new double[combinationsNumber];
        int counter = 0;
        for (int i = 0; i <xCoordinnates.length-1 ; i++) {
            for (int j = xCoordinnates.length-1; j >i ; j--) {
                lineLengths[counter] = lengthLine(xCoordinnates[i],yCoordinates[i],xCoordinnates[j],yCoordinates[j]);
                counter++;
            }
        }
        return lineLengths;
    }
    public static int foundIndexMaxElement(double[] arr) {
        double maxElement = arr[0];
        int indexMaxElement = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(maxElement < arr[i]) {
                maxElement = arr[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }

    //https://en.wikipedia.org/wiki/Combination
    static int combinationNumbers(int elementsNumber, int combinationNumber){
        int combination =(findFactorial(elementsNumber))/((findFactorial(combinationNumber))*(findFactorial(elementsNumber-combinationNumber)));
        return combination;
    }
    static int findFactorial(int number) {
        int result =1;
        for (int i = 2; i <=number ; i++) {
            result = result*i;
        }
        return result;
    }
    static double lengthLine (int firstX, int firstY, int secondX, int secondY) {
        double length = Math.sqrt(Math.pow((firstX - secondX),2)+ Math.pow((firstY-secondY),2) );
        return length;
    }
    static void printArray(double[] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
