package by.metelsky.algorithmization.decomposition;
/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {
    public static void main(String[] args) {
        int firstNumber = 128;
        int secondNumber =2844;
        switch (isMoreDigits(firstNumber,secondNumber)) {
            case 1:
                System.out.println("В числе " + firstNumber + " больше цифр чем в числе " + secondNumber);
                break;
            case 2:
                System.out.println("В числе " + firstNumber + " цифр столько же сколько и в числе " + secondNumber);
                break;
            case 3:
                System.out.println("В числе " + firstNumber + " цифр меньше чем в числе " + secondNumber);
                break;
        }


    }
    static int isMoreDigits(int firstNumber, int secondNumber){
        int firstNumberDigits = howManyDigits(firstNumber);
        int secondNumberDigits = howManyDigits(secondNumber);
        if (firstNumberDigits>secondNumberDigits){
            return 1;
        } else if(firstNumberDigits == secondNumberDigits){
            return 2;
        }
        return 3;
    }
    static int howManyDigits(int number){
        int digitCounter =0;
        while (number!=0){
            number /=10;
            digitCounter++;
        }
        return digitCounter;
    }
}
