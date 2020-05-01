package by.metelsky.algorithmization.decomposition;
/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(А,В) = (А*В)/(НОД(А,В)).
 */

public class Task1 {
    public static void main(String[] args) {
        int a = 14;
        int b = 18;
        int gcd = findGCD(a,b);
        int lcm = findLCM(a,b,gcd);
        System.out.println("GCD = "+ gcd);
        System.out.println("LCM = "+ lcm);

    }
    static int findLCM(int firstNumber, int secondNumber, int gcd){
        int lcm = (firstNumber*secondNumber)/gcd;
        return lcm;
    }
    static int findGCD(int firstNumber, int secondNumber){
        int gcd;
        if(firstNumber == 0){
            gcd =secondNumber;
        } else if (secondNumber==0){
            gcd = firstNumber;
        } else {
            gcd = evklidAlgo(firstNumber,secondNumber);
        }
        return gcd;
    }
    //Evklid algotithm
    static int evklidAlgo(int firstNumber, int secondNumber){
        while (firstNumber!=secondNumber){
            if(firstNumber<secondNumber){
                int tmp =firstNumber;
                firstNumber = secondNumber;
                secondNumber = tmp;
            } else {
                firstNumber = firstNumber-secondNumber;
            }
        }
        return firstNumber;
    }
}
