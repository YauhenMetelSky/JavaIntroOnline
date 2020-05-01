package by.metelsky.algorithmization.onedimensionalarray;
/*
Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        double z =12.5;
        int n = 25;
        double[] randomArray;
        int countReplace;
        randomArray = createArray(n);
        initializeArray(randomArray);
        printArray(randomArray);
        countReplace = replaceNumber(randomArray,z);
        System.out.println("Количество замен = "+ countReplace);
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
    static int replaceNumber(double[] arr, double z) {
        int count = 0;
        for (int i = 0; i<arr.length;i++ ) {
            if(arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        return count;
    }
    static void printArray(double[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }
}
