package by.metelsky.string.stringasaaray;
/*
В строке найти количество чисел.
 */

public class Task4 {
    public static void main(String[] args) {

        String str = "Strin123g to 4ind num028bers 451 12 09783";
        char[] arrayToFindNumbers = stringToCharArray(str);
        int numbersCounter = findAndCountNumbers(arrayToFindNumbers);
        System.out.println("In string there are: " + numbersCounter + " numbers.");


    }
    static int findAndCountNumbers(char[] arr){
        int numbersCounter = 0;
        for (int i = 0; i <arr.length ; i++) {
           if(isDigit(arr[i]) && !isDigit(arr[i-1])){
               numbersCounter++;
           }
        }
        return numbersCounter;
    }
    static boolean isDigit(char ch){
        char[] digits ={'0','1','2','3','4','5','6','7','8','9'};
        boolean flag = false;
        for (int i = 0; i <digits.length ; i++) {
            if (ch == digits[i]){
                flag =true;
                break;
            }
        }
        return flag;
    }

    static char[] stringToCharArray(String st){
        char[] chArr = st.toCharArray();
        return chArr;
    }
}
