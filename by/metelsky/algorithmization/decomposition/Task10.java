package by.metelsky.algorithmization.decomposition;
/*
Дано натуральное число N. Написать метод(методы) для формирования массива,
 элементами которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 98765430;
      int [] arrayFromNumber = arrayFromNumber(n);
      printArray(arrayFromNumber,"Array from number "+ n+ " :");
    }
    static int[] arrayFromNumber(int numberToArray){
        int digits = howManyDigits(numberToArray);
        int[] arrayFromNumber = new int[digits];
        for (int i = 0; i <arrayFromNumber.length ; i++) {
            arrayFromNumber[i] = onlyTheFirsDigit(numberToArray);
            numberToArray = minusFirstDigit(numberToArray);
        }
        return arrayFromNumber;

    }
    static int howManyDigits(int number){
        int digitCounter =0;
        while (number!=0){
            number /=10;
            digitCounter++;
        }
        return digitCounter;
    }
    static int minusFirstDigit(int number){
        int digits = howManyDigits(number);
        //Проверка, что разрядов больше одного
        if(digits>0) {
            int restOfNumber = number % (int) (Math.pow(10, digits - 1));
            return restOfNumber;
        } else {
            return number;
        }
    }
    static int onlyTheFirsDigit(int number){
        int digits = howManyDigits(number);
        if (digits>0) {
            int restOfNumber = minusFirstDigit(number);
            number = (number - restOfNumber) / (int) (Math.pow(10, digits - 1));
            return number;
        } else {
            return number;
        }
    }
  static void printArray(int [] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }


}
