package by.metelsky.string.stringasobject;
/*
 * 4. С помощью функции копирования и операции конкатенации составить
 * из частей слова “информатика” слово “торт”.
 */

public class Task4 {
    public static void main(String[] args) {

        String str = "информатика";
        String s = "";
        s = s + str.charAt(7) + str.charAt(3) + str.charAt(4) + str.charAt(7);
        System.out.println(s);

    }
}
