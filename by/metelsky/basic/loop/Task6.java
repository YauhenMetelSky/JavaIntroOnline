package by.metelsky.basic.loop;
/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {
        char charForPrint;
        int endRange = 65535; //Диапазон значений char от 0 до 65535
        for (int i =0;i<=endRange;i++) {
            charForPrint = (char) i;
            System.out.println(i+ " = " + charForPrint);
        }

    }

}
