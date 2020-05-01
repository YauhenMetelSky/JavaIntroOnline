package by.metelsky.basic.loop;
/*
Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        num = sc.nextInt();
        if(num > 0) {
            for(int i = 0; i<= num; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 0 до "+ num + " составляет: " + sum);
        } else {
            System.out.println("Вы ввели некорректное число");
        }

    }
}
