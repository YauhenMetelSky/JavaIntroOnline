package by.metelsky.basic.loop;
/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int numberOne= 12345;
        int numberTwo= 20279858;
        int restOfNumberOne;
        int restOfNumberTwo;
        int numberForLoop;
       while (numberOne!=0) {
           restOfNumberOne = numberOne%10;
           numberOne/=10;
           numberForLoop = numberTwo;
           while(numberForLoop!=0) {
               restOfNumberTwo = numberForLoop%10;
               numberForLoop/=10;
               if(restOfNumberOne == restOfNumberTwo) {
                   System.out.println(restOfNumberOne +" Данное число входит в запись как первого так и второго числа");
                   break;
               }
           }

       }

    }

}
