package by.metelsky.algorithmization.decomposition;
/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array = {5,8,65,9,3,18,99,54,28,15,2};
        int indexMaxElement = foundIndexMaxElement(array);
        System.out.println("Max element is: "+ array[indexMaxElement]);
        System.out.println("Second max element is: " + array[foundIndexSecondMaxElement(array,indexMaxElement)]);
    }
  static int foundIndexMaxElement(int[] arr) {
        int maxElement = arr[0];
        int indexMaxElement = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(maxElement < arr[i]) {
                maxElement = arr[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }
   static int foundIndexSecondMaxElement(int[] arr,int indexMax) {
        int maxElement = arr[indexMax];
        int secondMaxElement = arr[0];
        int indexSecondMaxElement = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(secondMaxElement < arr[i] && arr[i] < maxElement) {
                secondMaxElement = arr[i];
                indexSecondMaxElement = i;
            }
        }
        return indexSecondMaxElement;
    }
}
