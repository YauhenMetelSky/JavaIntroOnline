package by.metelsky.algorithmization.decomposition;
/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
элементов массива с номерами от k до m.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {2,7,9,58,24,36,558,8,57,1,0,845,3,-5,54,685};
        int[] sumArray =new int[3];
            sumArray[0] = sumThreeNumbers(array,1);
            sumArray[1] = sumThreeNumbers(array,3);
            sumArray[2]= sumThreeNumbers(array,4);
            printArray(sumArray,"Суммы элементов: ");
    }
    //не проверяем на выход за пределы массива
    static int sumThreeNumbers(int[] arr, int startIndex) {
        int sum =0;
        for (int i = startIndex; i <startIndex+3 ; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
    static void printArray(int [] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
