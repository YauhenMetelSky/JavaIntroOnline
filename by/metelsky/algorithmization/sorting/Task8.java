package by.metelsky.algorithmization.sorting;
/*
Даны дроби(p1/q1),(p2/q2),...(pn/qn) (pi , qi - натуральные).
Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] numerators = {2,4,8,7,3};
        int[] denominators= {15,7,9,13,8};
        int lcm = findLCMToSequence(denominators);
        printArray(numerators,"numerators in start:");
        printArray(denominators,"denominators in start:");
        System.out.println("lowest common multiple= "+ lcm);
        numeratorToCommonDenominators(numerators,denominators,lcm);
        bubbleSort(numerators,false);
        printArray(numerators,"sorted numerators with common denominator:");
    }
    static void numeratorToCommonDenominators(int[] numerators, int [] denominators, int lcm){
        for (int i = 0; i < numerators.length ; i++) {
            numerators[i] = numerators[i]*(lcm/denominators[i]);
        }
    }
    //method to find lcm(lowest common multiple) to sequence
    static int findLCMToSequence(int[] arr){
        int lcm;
        int[] sequence = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            sequence[i] = arr[i];
        }
        bubbleSort(sequence,true);
        lcm = findLCM(sequence[0],sequence[1]);
        for (int i = 2; i < sequence.length-1 ; i++) {
            lcm = findLCM(lcm,sequence[i]);
        }

        return lcm;
    }
    //sorting from big - to small(howToSort = true), else small - to big
    static void bubbleSort(int[] sequence, boolean howToSort){
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            if (howToSort) {
                for (int i = 0; i < sequence.length - 1; i++) {
                    if (sequence[i] < sequence[i + 1]) {
                        swap(sequence, i, i + 1);
                        needIteration = true;
                    }
                }
            } else {
                for (int i = 0; i < sequence.length - 1; i++) {
                    if (sequence[i] > sequence[i + 1]) {
                        swap(sequence, i, i + 1);
                        needIteration = true;
                    }
                }
            }
        }
    }
    static void swap(int[]sequence, int index1, int index2){
        int tmp = sequence[index1];
        sequence[index1] = sequence[index2];
        sequence[index2] = tmp;
    }
    //find lcm to 2 numbers
    static int findLCM(int firstNumber, int secondNumber){
        int gcd = findGCD(firstNumber,secondNumber);
        int lcm = (firstNumber*secondNumber)/gcd;
        return lcm;
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
    public static void printArray(int[] array, String s) {
        System.out.println(s);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
