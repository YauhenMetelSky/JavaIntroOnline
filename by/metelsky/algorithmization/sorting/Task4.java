package by.metelsky.algorithmization.sorting;

/*
Сортировка обменами. Дана последовательность чисел a1<=a2..<=an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1) . Если ai>a(i+1), то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5,1,2,9,15,28,36};
        int counterIterations = bubbleSort(sequence);
        printArray(sequence,"Sorted sequence");
        System.out.println("Number of iterations = "+ counterIterations);


    }
    static int bubbleSort(int[] sequence){
        int counter =0;
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            for (int i = 0; i <sequence.length-1 ; i++) {
                if(sequence[i]>sequence[i+1]){
                    swap(sequence,i,i+1);
                    counter++;
                    needIteration = true;
                }

            }
        }
        return counter;
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
