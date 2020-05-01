package by.metelsky.algorithmization.onedimensionalarray;
/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
    public static void main(String[] args) {
        int sizeArray = 100;
        int[] randomArray;
        randomArray = createArray(sizeArray);
        initializeArray(randomArray);
        printArray(randomArray);
    }
    static int [] createArray (int size) {
        int [] arr = new int[size];
        return arr;
    }
    static int[] initializeArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            if(isNumberMoreIndex(arr[i],i)) {
                System.out.println("Элемент массива с индексом "+ i +" = " + arr[i]);
            }
        }
    }
    static boolean isNumberMoreIndex(int number, int index) {
        return number > index;
    }

}
