package by.metelsky.algorithmization.onedimensionalarray;
/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task3 {
    public static void main(String[] args) {
        int arraySize = 10;
        int positiveNumberCount = 0;
        int negativeNumberCount = 0;
        int nullNumberCount = 0;
        double[] randomArray = createArray(arraySize);
        initializeArray(randomArray);
        printArray(randomArray);
        for (double element: randomArray) {
            if(element > 0) {
                positiveNumberCount++;
            }
            if(element ==0) {
                nullNumberCount++;
            }
            if(element < 0) {
                negativeNumberCount++;
            }

        }
        System.out.println("Количество положительных чисел в массиве = " + positiveNumberCount);
        System.out.println("Количество нулевых чисел в массиве = " + nullNumberCount);
        System.out.println("Количество отрицательных чисел в массиве = " + negativeNumberCount);


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
    static void printArray(double[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }
}
