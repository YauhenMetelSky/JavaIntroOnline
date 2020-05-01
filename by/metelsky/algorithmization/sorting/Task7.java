package by.metelsky.algorithmization.sorting;
/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...bm,
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm  в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {
    public static void main(String[] args) {
        int[] sequence = {0,2,4,6,8,10};
        int[] anotherSequence = {1,3,5,7,9};
        int[] joinedSequence = joinSequence(sequence,anotherSequence);
        printArray(joinedSequence,"joined sequence");
    }
    static int[] joinSequence(int[] sequence, int[] anotherSequence){
        int[] joinedSequence = new int[sequence.length+anotherSequence.length];
        for (int i = 0; i <sequence.length ; i++) {
            joinedSequence[i] = sequence[i];
        }
        for (int i =0 ; i <anotherSequence.length ; i++) {
            int numberToSearch = anotherSequence[i];
            int indexToInsert = binarySearch(joinedSequence,numberToSearch,joinedSequence.length);
                   for (int j = joinedSequence.length-1; j >indexToInsert; j--) {
                joinedSequence[j] = joinedSequence[j-1];
            }
            joinedSequence[indexToInsert] = numberToSearch;
        }
        return joinedSequence;
    }
    static int binarySearch(int[] arr, int numberToSearch, int upperBound){
        int low = 0;
        int high = upperBound-1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (numberToSearch >arr[middle]) {
                low = middle+1;
            } else if (numberToSearch < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }
    static void printArray(int[] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
