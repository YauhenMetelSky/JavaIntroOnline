package by.metelsky.algorithmization.decomposition;
/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 12;
        int b =5;
        int c =28;
        int d = 3;
        int gcd = findGCDFourNumbers(a,b,c,d);
        System.out.println("Greatest common denominator = " + gcd);

    }
    static int findGCDFourNumbers(int a, int b, int c, int d) {
        int[] sequence = {a,b,c,d};
        bubbleSort(sequence);
        int gcd = findGCD(sequence[0],sequence[1]);
        for (int i = 2; i <sequence.length-1 ; i++) {
            gcd = findGCD(gcd,sequence[i]);
        }
        return gcd;
    }
    static void bubbleSort(int[] sequence){
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            for (int i = 0; i < sequence.length - 1; i++) {
                    if (sequence[i] < sequence[i + 1]) {
                        swap(sequence, i, i + 1);
                        needIteration = true;
                    }
            }
        }
    }
    static void swap(int[]sequence, int index1, int index2){
        int tmp = sequence[index1];
        sequence[index1] = sequence[index2];
        sequence[index2] = tmp;
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
