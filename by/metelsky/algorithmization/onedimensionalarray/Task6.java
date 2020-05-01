package by.metelsky.algorithmization.onedimensionalarray;

import java.util.Scanner;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        int n ;
        double[] randomArray;
        double sumNumbers;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число(размер массива, минимально возможное число 3) ");
        n = sc.nextInt();
        if(n >= 3) {
           randomArray = createArray(n);
           initializeArray(randomArray);
            printArray(randomArray);
           sumNumbers = sumOfNumbers(randomArray);
           System.out.println("Сумма чисел порядковые номера которых");
           System.out.println("являются простыми числами = " + sumNumbers);

        } else {
            System.out.println("Данное число некорректно (меньше чем 3)");
        }
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
    static double sumOfNumbers(double[] arr){
        double sum = 0;
        for (int i =0; i<arr.length; i++){
            if (isIndexPrime(i)){
                sum+=arr[i];
                System.out.println(i + " простое число");
            }
        }
        return sum;
    }
    // метод проверяет является ли число простым
    static boolean isIndexPrime(int index) {
        boolean flag = false;
        //наименьший делитель не превышает целой части квадратного корня делимого числа
        int smallDivider = (int) Math.sqrt(index);
        if(index==2 || index ==3){
            flag=true;
            return flag;
            //четные числа деляться на два и нам не интересны
        } else if(index%2==0){
            flag=false;
            return flag;
        }
        //если не сработали предыдущие условия приступаем к перебору делителей
        for (int i = 2; i<=smallDivider; i++) {
            if(index%i != 0 ) {
                flag= true;
                //если хотя бы раз сработал else значит число составное, можно начинать следующую итерацию
            } else {
                flag= false;
                break;
            }
        }
        return flag;
    }
    static void printArray(double[] arr) {
        System.out.println("array size = " + arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + " element = " + arr[i]);
        }
    }
}
