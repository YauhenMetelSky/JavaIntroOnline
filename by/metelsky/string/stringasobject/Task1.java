package by.metelsky.string.stringasobject;
/*
  1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {
    public static void main(String[] args) {
        String text = "   Text   to   find    spaces    ";
        String test = "Text";

        String pattern = " ";
        int consecutiveSpacesQuantity = mostNumberConsecutiveSpaces(pattern, text);
        System.out.println("Most number consecutive spaces is: " + consecutiveSpacesQuantity);

    }

    public static int mostNumberConsecutiveSpaces(String pattern, String text) {
        int maxQuantity = 0;
        String addToPattern = pattern;
        while (text.contains(pattern)) {
            maxQuantity++;
            pattern = pattern + addToPattern;

        }

        return maxQuantity;

    }
}
