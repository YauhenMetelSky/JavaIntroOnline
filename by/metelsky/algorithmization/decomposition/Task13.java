package by.metelsky.algorithmization.decomposition;
/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

public class Task13 {
    public static void main(String[] args) {
        int [] array =randomArray(40);
        int n =12;
        printArray(array,"Random array: ");
        findAndPrintAllTwins(array,n);
    }
    static void findAndPrintAllTwins(int[] array, int start){

        for (int i = start; i <start*2 ; i++) {
            for (int j = start; j <start*2 ; j++) {
              if(isTwins(array[i],array[j])){
                  System.out.println(array[i]+ " " + array[j]);
              }
            }
        }
    }

    static int[] randomArray(int size){
        int[] randomArray = new int[size];
        for (int i = 0; i <randomArray.length ; i++) {
            randomArray[i] =(int) (Math.random()*40);
        }
        return randomArray;
    }
    static boolean isTwins(int firstNumber, int secondNumber){
        if(Math.abs(firstNumber - secondNumber) == 2) {
            return true;
        }
        return false;
    }
    static void printArray(int [] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
