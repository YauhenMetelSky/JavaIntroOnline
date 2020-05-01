package by.metelsky.string.stringasobject;
/*
 * 9. Посчитать количество строчных (маленьких)
 * и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
 */


public class Task9 {
    public static void main(String[] args) {
        String str = "WOrd is wOРд";
        int counterUpperCase;
        int counterLowerCase;

        counterUpperCase = counterUpperCaseLetter(str);
        counterLowerCase = counterLowerCaseLetter(str);

        System.out.println("Количество английских строчных букв в строке = "+ counterLowerCase );
        System.out.println("Количество английских прописных букв в строке = "+ counterUpperCase );


    }
    public static int counterUpperCaseLetter(String str) {
        int counter =0;
        for(int i =0; i<str.length();i++) {
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z') {
                counter++;
            }
        }
        return counter;

    }
    public static int counterLowerCaseLetter(String str) {
        int counter =0;
        for(int i =0; i<str.length();i++) {
            if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
                counter++;
            }

        }
        return counter;

    }
}
