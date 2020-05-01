package by.metelsky.algorithmization.sorting;
/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Образовать из них новую
последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] firstSequence = {1,2,3,4,5,6,7,8,9,10,11};
        int[] secondSequence = {5,7,9,11,13,15};
        int[] joinedSequence = joinTwoSequence(firstSequence,secondSequence);
        sortSequence(joinedSequence);
        printArray(joinedSequence,"Joined sequence ");
    }
    static int[] joinTwoSequence(int[] sequence1, int[] sequence2){
        int size = sequence1.length+ sequence2.length;
        int[] joinedSequence = new int[size];
        for (int i = 0; i <sequence1.length ; i++) {
            joinedSequence[i] = sequence1[i];
        }
        for (int i = sequence1.length; i <joinedSequence.length ; i++) {
           joinedSequence[i] = sequence2[i-sequence1.length];
        }
        return joinedSequence;
    }
    static void sortSequence(int[] sequence) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < sequence.length-1; i++) {
                if (sequence[i] > sequence[i+1]) {
                    swap(sequence, i, i+1);
                    needIteration = true;
                }
            }
        }
    }
    static void swap(int[]sequence, int index1, int index2){
        int tmp = sequence[index1];
        sequence[index1] = sequence[index2];
        sequence[index2] = tmp;
    }
    static void printArray(int[] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
