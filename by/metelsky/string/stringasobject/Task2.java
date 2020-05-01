package by.metelsky.string.stringasobject;
/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {

    public static void main(String[] args) {
        String text = "Text to change: an Apple, a bus, London is a Capital!";
        String symbol = "a";
        String symbolToAdd = "b";

        text = addSymbol(symbolToAdd, symbol, text);
        System.out.println(text);


    }

    public static String addSymbol(String symbolToAdd, String symbolAfterWhichWeAdd, String textToFind) {
        String str = textToFind;
        int index = 0;
        while (index >= 0) {
            index = findIndexOfSymbol(symbolAfterWhichWeAdd, index, textToFind);

            if (index > 0) {
                StringBuilder tempString = new StringBuilder(textToFind);

                tempString = tempString.insert(index + 1, symbolToAdd);

                textToFind = tempString.toString();

                index = index + 1;

            }

        }

        return textToFind;

    }

    public static int findIndexOfSymbol(String symbol, int indexToStart, String textToFindSymbol) {

        int indexOfSymbol = textToFindSymbol.indexOf(symbol, indexToStart);

        return indexOfSymbol;
    }
}
