package by.metelsky.algorithmization.onedimensionalarray;
/*
Дана последовательность целых чисел  a1 ,a2 , ,an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1 ,a2 , ,an ).
 */

public class Task8 {
    public static void main(String[] args) {
        int n = 11;//размер массива
        int minValue;
        int[] randomArray;
        int[] arrayWithoutMin;
        int minValueCount;
        randomArray = createArray(n);
        initializeArray(randomArray);
        printArray(randomArray);
        minValue = findMinValue(randomArray);
        minValueCount = minValueCounter(randomArray,minValue);
        // размер создаваемого массива равен размеру исходного массива -(минус) количество повторов минимальных значений
        arrayWithoutMin= createArray(randomArray.length-minValueCount);
        fillInArrayWithoutMin(arrayWithoutMin,minValue,randomArray);
        printArray(arrayWithoutMin);
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
    static int findMinValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //метод для подсчета количества значений равных минимуму в последовательности
    static int minValueCounter(int[] arr, int minVal){
        int counter = 0;
        for (int element: arr) {
            if(minVal == element){
                counter++;
            }
        }
        return counter;
    }
    static int[] fillInArrayWithoutMin(int[] arrNew, int minVal,int [] oldArr){

        int j = 0;
        for (int i = 0; i <oldArr.length ; i++) {
            if(oldArr[i] != minVal){
                arrNew[j] = oldArr[i];
                j++;
            }
        }
        return arrNew;
    }
    static void printArray(int[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }
}
