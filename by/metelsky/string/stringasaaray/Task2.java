package by.metelsky.string.stringasaaray;
/*
Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task2 {
    public static void main(String[] args) {
        String str = "Word is wOrd, and nothing else. Sword is not a word. (Edvard word).";
        char[] replaceWord = stringToCharArray("letter");
        char[] arrayToSearch = stringToCharArray(str);
        toLowerCase(arrayToSearch);
        arrayToSearch = changeWordToLetter(replaceWord,arrayToSearch);
        String stringWithoutWord = arrayOfCharsToString(arrayToSearch);
        System.out.println(stringWithoutWord);
    }

static char[] changeWordToLetter (char[] replaceWord, char[] arrayToSearch){
        //нет смысла искать слово если оно длиннее чем количество оставшихся в строке букв
    for (int i = 0; i <arrayToSearch.length-3 ; i++) {
        if( arrayToSearch[i] == 'w' && arrayToSearch[i+1] == 'o' && arrayToSearch[i+2] == 'r' && arrayToSearch[i+3] == 'd'){
            arrayToSearch = addSpaceToCharArray(arrayToSearch);
            replaceWordInArray(arrayToSearch,i,replaceWord);
        }

    }
    return arrayToSearch;
}
 static String  arrayOfCharsToString(char[] array) {
        String str = "";
     for (int i = 0; i <array.length ; i++) {
         str = str + array[i];

     }
     return str;
 }
static void replaceWordInArray(char[] array, int indexToStart, char[] replaceWord) {
    for (int i = array.length -1; i >indexToStart+1 ; i--) {
        array[i] = array[i-2];
    }
    for (int i = 0; i < 6 ; i++) {
        array[indexToStart + i] = replaceWord[i];
    }

}
    static char[] addSpaceToCharArray(char[] array){
        char[] largerArray = new char[array.length + 2];
        for (int i = 0; i <array.length ; i++) {
            largerArray[i] = array[i];
        }
        return largerArray;
    }
    static void toLowerCase(char[] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
    }
    static char[] stringToCharArray(String st){
        char[] chArr = st.toCharArray();
        return chArr;
    }

}
