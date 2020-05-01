package by.metelsky.string.stringasobject;
/*
 * 3.Проверить, является ли заданное слово палиндромом.
 */


public class Task3 {
    public static void main(String[] args) {
        String word = "Tenet";
        System.out.println(isWordPalindrome(word.toLowerCase()));

    }

    public static boolean isWordPalindrome(String word) {
        boolean flag = false;
        String reverseWord;

        StringBuilder tempString = new StringBuilder(word);
        tempString.reverse();
        reverseWord = tempString.toString();

        if (word.equals(reverseWord)) {
            flag = true;
        }
        return flag;

    }
}
