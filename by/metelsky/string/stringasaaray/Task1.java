package by.metelsky.string.stringasaaray;
/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1 {
    public static void main(String[] args) {
        String[] variablesNames = {"varNumberOne", "variableTwo", "veryLongVariableCamelCase","TryThiS","nothingtodo"};
        printArray(variablesNames,"Variables names camelCase view: ");
        for (int i = 0; i <variablesNames.length ; i++) {
            variablesNames[i] = changeCamelToSnakeCase(variablesNames[i]);
        }
        printArray(variablesNames, "We change all names from camelCase to snake_case:");

    }
    static String changeCamelToSnakeCase(String camelCase){
        String snakeCase;
        char[] charArray = stringToCharArray(camelCase);
        snakeCase = charArrayToString(charArray);
        return snakeCase;

    }
    // как вариант можно использовать StringBuilder
    static String charArrayToString(char[] chArray){
        String str = "";
        for (int i = 0; i <chArray.length ; i++) {
            if(findUpperCase(chArray[i])) {
                if(i!=0&& i!=chArray.length-1) {
                    str = str +"_"+ Character.toLowerCase(chArray[i]);
                } else {
                    str = str + Character.toLowerCase(chArray[i]);
                }
            } else {
                str = str + chArray[i];
            }
        }
        return str;
    }

    static boolean findUpperCase(char ch){
        if(Character.isUpperCase(ch)){
            return true;
        }
        return false;
    }
    static char[] stringToCharArray(String s){
        char[] arrayOfChars = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
          arrayOfChars[i] = s.charAt(i);
        }
        return arrayOfChars;
    }
    static void printArray(String [] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
                System.out.println(array[i]);
        }
        System.out.println("");
    }


}

