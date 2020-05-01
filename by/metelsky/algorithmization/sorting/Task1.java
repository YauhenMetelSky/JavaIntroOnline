package by.metelsky.algorithmization.sorting;
/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,4,5,6,7,8,9};
        int[] arrayTwo = {11,12,13,14,15};
        int k = 3;
        int[] joinedArray = joinTwoArraysFromAnyPosition(arrayOne,arrayTwo,k);
        printArray(arrayOne,"array One");
        printArray(arrayTwo, "Array Two");
        System.out.println("number k =" + k);
        printArray(joinedArray,"Joined Array");


    }
    static int[] joinTwoArraysFromAnyPosition(int[]arr1, int[]arr2, int position){
        int size = arr1.length+arr2.length;
        int[] joinedArray = new int[size];
        for (int i = 0; i <position ; i++) {
            joinedArray[i] = arr1[i];
        }
        for (int i = position; i <(position+arr2.length) ; i++) {
            joinedArray[i] = arr2[i-position];
        }
        for (int i = position+arr2.length; i <joinedArray.length ; i++) {
              joinedArray[i] = arr1[i-arr2.length];
        }
        return joinedArray;
    }
    static void printArray(int[] array, String s) {
           System.out.println(s);
             for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
