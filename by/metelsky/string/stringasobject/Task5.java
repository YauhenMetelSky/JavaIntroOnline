package by.metelsky.string.stringasobject;
/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {
    public static void main(String[] args) {
        String str = "a We A are looking a a a for the letter \"a\".a";
        String letter = "a";

        int counter = letterCounter(str,letter);

        System.out.println("In string: " +str);
        System.out.println("There are "+ counter +" letter \""+ letter +"\".");

    }

    public static int letterCounter(String str, String letter) {
        int index = 0;
        int counter = 0;
        str = str.toLowerCase();

        while (index >= 0) {
            index = str.indexOf(letter, index);
            if (index >= 0) {
                counter++;
                index++;
            }

        }
        return counter;
    }
}
