package by.metelsky.algorithmization.sorting;
/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
то продвигаются на один элемент вперед. Если a(i)>a(i+1) , то производится перестановка и сдвигаются
на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] array = {9,5,0,2,1,4,8,7,3,6};
        sortArray(array);
        printArray(array,"sorted array");
    }
    static void sortArray(int[] array){
        for (int i = 0; i <array.length-1 ;) {
            if(array[i]>array[i+1]){
                swap(array,i,i+1);
                if(i>0){
                   i--;
                }
            } else {
                i++;
            }
        }
    }
    static void swap(int[]sequence, int index1, int index2){
        int tmp = sequence[index1];
        sequence[index1] = sequence[index2];
        sequence[index2] = tmp;
    }
    public static void printArray(int[] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
