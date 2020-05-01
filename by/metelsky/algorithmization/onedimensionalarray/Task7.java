package by.metelsky.algorithmization.onedimensionalarray;
/*
Даны действительные числа a1 ,a2 , ,a2n . Найти
max(a1+a2n , a2+a2n-1, ...., an+an+1)
 */

public class Task7 {
    public static void main(String[] args) {
        int n=20; //размер массива кратный 2(обязательно)
        double[] sumArray;
        double maxValue;
        double[] randomArray = createArray(n);
        initializeArray(randomArray);
        System.out.println("Изначальный массив:");
        printArray(randomArray);
        sumArray = createSumArray(randomArray);
        System.out.println("Массив сумм пар элементов:");
        printArray(sumArray);
        maxValue = findMaxValue(sumArray);
        System.out.println("Максимум из сумм пар элементов равен: " + maxValue);
    }
    static double[] createArray (int size) {
        double [] arr = new double[size];
        return arr;
    }
    static double[] initializeArray(double[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Math.random()*200 -100;
        }
        return arr;
    }
    static double[] createSumArray(double[] arr) {
        double[] sumArray = new double[arr.length/2];
        for (int i = 0; i <arr.length/2 ; i++) {
            sumArray[i] = arr[i] + arr[arr.length-1-i];

        }

        return sumArray;
    }
    static double findMaxValue(double[] arr){
        double maxVal = arr[0];
     for (int i = 0; i<arr.length; i++){
         if(maxVal < arr[i]) {
             maxVal = arr[i];
         }
     }
     return maxVal;
    }
    static void printArray(double[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }

}
