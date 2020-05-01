package by.metelsky.basic.loop;
/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int startOfRange;
        int endOfRange;
        System.out.println("Введите число, начало промежутка");
        Scanner sc = new Scanner(System.in);
        startOfRange = sc.nextInt();
        System.out.println("Введите число, конец промежука");
        endOfRange = sc.nextInt();
       if(endOfRange > startOfRange) {
           for (int i = startOfRange; i<=endOfRange; i++) {
               for (int j = 2; j < i; j++){
                   if(foundDivider(i,j)) {
                       System.out.println("У числа " + i + " есть делитель " +j);
                   }
               }
           }

       } else {
           System.out.println("Введенные числа некорректны (конец диапазона меньше начала диапазона)");
       }

    }
    public static boolean foundDivider(int dividend, int divider) {
        if (dividend%divider == 0) {
            return true;
        } else {
            return false;
        }
    }
}
