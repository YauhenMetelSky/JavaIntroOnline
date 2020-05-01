package by.metelsky.string.stringasobject;
import java.util.Scanner;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 *  Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Task7 {
    public static void main(String[] args) {
        String str;
        str = getString();

        str = deleteSpaces(str);

        str = deleteRepeatedSymbols(str);
        System.out.println(str);

    }

    public static String getString() {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи любую строку >>");
        str = sc.nextLine();
        return str;

    }

    public static String deleteSpaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static String deleteRepeatedSymbols(String str) {
        String result = "";
        boolean flag;
        for (int i = 0; i < str.length(); i++) {
            flag = true;

            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    flag = false;
                    break;
                }
            }
            if (flag) {
                result = result + str.charAt(i);
            }

        }
        return result;
    }
}
