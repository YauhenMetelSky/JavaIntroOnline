package by.metelsky.string.stringasobject;
/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        String stringToRepeat = repeatEverySymbolTwice(" Hello world!");
        System.out.println(stringToRepeat);

    }

    public static String repeatEverySymbolTwice(String str) {
        String result ="";

        for (int i = 0; i<str.length();i++) {
            result =result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }
}
