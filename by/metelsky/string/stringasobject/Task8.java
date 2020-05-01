package by.metelsky.string.stringasobject;
import java.util.Scanner;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово
 *  и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Task8 {
    public static void main(String[] args) {
        String str;
        String biggestWord;

        str = getString();
        biggestWord = findBiggestWord(str);

        System.out.println("The biggest word in the string is: " + biggestWord);


    }

    public static String getString() {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи любую строку >>");
        str = sc.nextLine();
        return str;

    }
    public static String findBiggestWord(String str) {
        String word ="";
        for(String tempWord : str.split(" ")) {
            if(tempWord.length()>word.length()) {
                word = tempWord;
            }
        }
        return word;
    }

}
