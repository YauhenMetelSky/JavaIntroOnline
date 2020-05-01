package by.metelsky.algorithmization.sorting;
/*
Сортировка вставками. Дана последовательность чисел a1, a2...an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2...ai - упорядоченная последовательность, т. е.
a1<=a2...<=an . Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] sequence = {2,5,9,11,10,8,1,0,3,7,4,6};
        sortSequence(sequence,4);
        printArray(sequence,"sorted sequence");
    }
    static void sortSequence(int[] sequence, int sortFrom){
        //циклом проходим от числа сразу за отсортированной частью и до конца массива
        for (int i = sortFrom; i <sequence.length ; i++) {
            int numberToSearch = sequence[i];
            //вызываем метод бинарного поиска, куда передаем, последовательность, число для поиска, и верхнюю границу
            int indexToInsert = binarySearch(sequence,numberToSearch,i);
            //сдвигаем все элементы массива с индексом большим, чем идекс из бинарного поиска
            for (int j = i; j >indexToInsert; j--) {
                sequence[j] = sequence[j-1];
            }
            sequence[indexToInsert] = numberToSearch;
        }
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
