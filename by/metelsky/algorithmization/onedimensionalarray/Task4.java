package by.metelsky.algorithmization.onedimensionalarray;
/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
    public static void main(String[] args) {
        double[] randomArray;
        int indexMinElement;
        int indexMaxElement;
        int sizeArray=10;
        randomArray = createArray(sizeArray);
        initializeArray(randomArray);
        printArray(randomArray);
        indexMaxElement = foundIndexMaxElement(randomArray);
        indexMinElement = foundIndexMinElement(randomArray);
        System.out.println("Индекс максимального элемента массива = " + indexMaxElement);
        System.out.println("Индекс минимального элемента массива = " + indexMinElement);
        replaceMaxMinElements(randomArray,indexMinElement,indexMaxElement);
        printArray(randomArray);
    }
    static double[] createArray (int size) {
        double [] arr = new double[size];
        return arr;
    }
    static double[] initializeArray(double[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Math.random()*200 -100;
        }
        return arr;
    }
    static int foundIndexMaxElement(double[] arr) {
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
    static int foundIndexMinElement(double[] arr) {
        double minElement = arr[0];
        int indexMinElement = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(minElement > arr[i]) {
                minElement = arr[i];
                indexMinElement = i;
            }
        }
        return indexMinElement;
    }
    static void replaceMaxMinElements (double[] arr, int indexMin, int indexMax) {
        double intermediateNumber;
        intermediateNumber= arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = intermediateNumber;
    }
    static void printArray(double[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Элемент массива с индексом "+ i +" = " + arr[i]);

        }
    }

}
