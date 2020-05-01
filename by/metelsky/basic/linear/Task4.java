package by.metelsky.basic.linear;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {
    public static void main(String[] args) {

        changePlaces(124.692);
    }

    public static void changePlaces(double num) {
        int integerPart;
        double doublePart;
        int doubleToInt;
        double intToDouble;
        double reversNumber;
        // приводим к типу int, выделяем целую часть

        integerPart = (int)num;
// отнимаем от переданного числа целую часть, получаем дробную часть числа
        doublePart = num - (double)integerPart;
        // переводим целую часть числа в дробную

        intToDouble = (double) integerPart/1000;
        // переводим дробную часть числа в целую и округляем (из-за особенностей хранения цифр)

        doubleToInt = (int) Math.round(doublePart*1000);
        // складывая целую и дробную части получаем перевернутое число

        reversNumber = intToDouble + doubleToInt;

        System.out.println("Веденное число: " + num);
        System.out.println("Перевернутое чиcло: " + reversNumber);


    }
}

