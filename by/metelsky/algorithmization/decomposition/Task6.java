package by.metelsky.algorithmization.decomposition;
/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 13;
        int c = 5;
        boolean coprime = isNumbersCoprime(a,b,c);

      if(coprime){
          System.out.println("Numbers " + a +", " + b +", "+ c + " are coprime");
      } else {
          System.out.println("Numbers " + a +", " + b +", "+ c + "  don't coprime");
      }

    }
    static boolean isNumbersCoprime(int first, int second, int third){
        int tmp = findGCD(first,second);
        int gcd = findGCD(tmp,third);
        if (gcd == 1){
            return true;
        } else {
            return false;
        }
    }
    //greatest common divisor
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
