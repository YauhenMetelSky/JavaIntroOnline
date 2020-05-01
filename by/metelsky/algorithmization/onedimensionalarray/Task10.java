package by.metelsky.algorithmization.onedimensionalarray;
/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
    public static void main(String[] args) {
        int n =20;
        int[] randomArray;
        randomArray = createArray(n);
        initializeArray(randomArray);
        printArray(randomArray);
        System.out.println("");
        compressArray(randomArray);
        printArray(randomArray);

    }
    static int [] createArray (int size) {
        int [] arr = new int[size];
        return arr;
    }
    static int[] initializeArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*20);
        }
        return arr;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void compressArray(int[] arr) {
        for (int i = 1; i <arr.length ; i+=2) {
            arr[i] = 0;

        }
    }
}
