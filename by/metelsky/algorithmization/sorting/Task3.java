package by.metelsky.algorithmization.sorting;
/*
Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5,6,8,9,15,28,36};
        selectionSort(sequence);
        printArray(sequence,"Sorted sequence");
    }
    static void selectionSort(int[] sequence){
        for (int i = 0; i <sequence.length ; i++) {
            int max = sequence[i];
            int indexMax = i;
            for (int j = i; j <sequence.length ; j++) {
                if (max< sequence[j]){
                    max = sequence[j];
                    indexMax = j;
                }
            }
            if(indexMax != i) {
               swap(sequence,i,indexMax);
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
