package by.metelsky.algorithmization.onedimensionalarray;
/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array;
        int n =10;
        int divider = 3;
        int sum;
        array = createArray(n);
        initializeArray(array);
        printArray(array);
        sum = sumOfNumbers(array, divider);
        System.out.println("Сумма чисел кратных " + divider + " = " + sum);

    }
    static int[] createArray (int size) {
        int [] arr = new int[size];
        return arr;
    }
    static int[] initializeArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = 2 + i;
        }
        return arr;
    }
    static int sumOfNumbers (int[]arr, int divider) {
        int sum = 0;
        for (int element: arr) {
            if(isDivideByDivider(element,divider)) {
                sum +=element;
            }
        }
        return sum;

    }
    static boolean isDivideByDivider (int arrI, int divider) {
        boolean result;
        result = arrI%divider == 0;
        return result;
    }
    static void printArray(int[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }
}
