package by.metelsky.string.stringasaaray;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task5 {
    public static void main(String[] args) {
        String testOne = "   String     to find   spaces  and remove    extra    one ";

        char[] arrayOfChar = stringToCharArray(testOne);
        printArray(arrayOfChar, "Start array: ");

        char[] withoutStartSpace = cutTheStartSpace(arrayOfChar);
        printArray(withoutStartSpace, "Array without start spaces: ");

        char[] withoutEndSpace = cutTheEndSpace(withoutStartSpace);
        printArray(withoutEndSpace, "Array without end spaces");

        char[] withoutMiddleSpace = cutTheMiddleSpace(withoutEndSpace);
        printArray(withoutMiddleSpace, "Array without extra spaces");

    }

    static char[] stringToCharArray(String st) {
        char[] chArr = st.toCharArray();
        return chArr;
    }

    static void printArray(char[] array, String s) {
        System.out.println(s);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    // Добавить проверку строки на состав из одних пробелов без символов.
    static char[] cutTheStartSpace(char[] array) {
        char[] withoutSpace;
        int spaceCounter = 0;
        int counter = 1;
        if (array[0] == ' ') {
            spaceCounter++;
            while (array[counter] == ' ') {
                spaceCounter++;
                counter++;
            }
            withoutSpace = new char[array.length - spaceCounter];
            for (int i = 0; i < withoutSpace.length; i++) {
                withoutSpace[i] = array[i + spaceCounter];
            }
        } else
            return array;

        return withoutSpace;

    }

    static char[] cutTheEndSpace(char[] array) {
        char[] withoutSpace;
        int spaceCounter = 0;
        int counter = array.length - 2;
        if (array[array.length - 1] == ' ') {
            spaceCounter++;

            while (array[counter] == ' ') {
                spaceCounter++;
                counter--;
            }
            withoutSpace = new char[array.length - spaceCounter];
            for (int i = 0; i < withoutSpace.length; i++) {
                withoutSpace[i] = array[i];
            }
        } else
            return array;

        return withoutSpace;
    }

    static char[] cutTheMiddleSpace(char[] array) {
        char[] testArray = new char[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == ' ' && array[i + 1] == ' ') {
                testArray[i] = array[i];
                i++;
                counter++;
                while (array[i + 1] == ' ') {
                    i++;
                    counter++;
                }

            } else {
                testArray[i - counter] = array[i];
            }

        }
        char[] withoutSpace = new char[array.length - counter];
        for (int i = 0; i < withoutSpace.length; i++) {
            withoutSpace[i] = testArray[i];
        }
        return withoutSpace;
    }

}
