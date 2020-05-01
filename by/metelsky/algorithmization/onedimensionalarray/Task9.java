package by.metelsky.algorithmization.onedimensionalarray;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */

public class Task9 {
    public static void main(String[] args) {
        int n=30;
        int[] randomArray;
        int[] arrayCounter;
        int maxFrequency;
        int minNumberMaxFrequency;

        randomArray = createArray(n);
        initializeArray(randomArray);
        printArray(randomArray);
        arrayCounter = createArrayRepeatCount(randomArray);
        maxFrequency =findMaxValue(arrayCounter);
        minNumberMaxFrequency=findMinValueMaxFrequency(arrayCounter,randomArray,maxFrequency);
        System.out.println("Min number with max frequency = " + minNumberMaxFrequency);

    }
    static int [] createArray (int size) {
        int [] arr = new int[size];
        return arr;
    }
    static int[] initializeArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*20);
        }
        return arr;
    }
    static int findMaxValue(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //создаем массив количества повторов значений
    static int[] createArrayRepeatCount(int[] arr){
        int[] arrCount = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int counter =0;
            for (int j = 0; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    counter++;
                }
            }
            arrCount[i] = counter;
        }
        return arrCount;
    }
    //метод поиска минимального значения наиболее часто повторяющегося числа
    static int findMinValueMaxFrequency(int[] frequencyArr, int[] numberArr, int maxFrequency) {
        int indexFirstNumberMaxFrequency =0;
        int minValue;
        // ищем индекс соответствующий первому максимально повторяющемуся числу
        for (int i = 0; i <frequencyArr.length ; i++) {
            if(maxFrequency == frequencyArr[i]){
                indexFirstNumberMaxFrequency = i;
                break;
            }
        }
        // ищем минимальное значение
        minValue = numberArr[indexFirstNumberMaxFrequency];
        for (int i = indexFirstNumberMaxFrequency; i <numberArr.length ; i++) {
            if(frequencyArr[i] == maxFrequency) {
                if(minValue> numberArr[i]){
                    minValue = numberArr[i];
                }
            }
        }
        return minValue;

    }
    static void printArray(int[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }

}
