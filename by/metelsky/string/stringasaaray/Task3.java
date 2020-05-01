package by.metelsky.string.stringasaaray;
/*
В строке найти количество цифр.
 */

public class Task3 {
    public static void main(String[] args) {
        char[] digits ={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String str = "9 Strin3g 4 find 29 digits 1 2 3";
        char[] arrayToFindDigits = stringToCharArray(str);
        int digitalsCounter = findAndCountDigits(arrayToFindDigits,digits);
        System.out.println("In string there are: " + digitalsCounter + " digits.");
    }
    static int findAndCountDigits(char[] arr, char[] digits){
        int digitsCounter = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <digits.length ; j++) {
                if (arr[i] == digits[j]){
                    digitsCounter++;
                    break;
                }
            }
        }
        return digitsCounter;
    }

    static char[] stringToCharArray(String st){
        char[] chArr = st.toCharArray();
        return chArr;
    }


}
