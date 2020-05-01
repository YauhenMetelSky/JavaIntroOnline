package by.metelsky.basic.linear;
/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Task5 {
    public static void main(String[] args) {
        long time = 3581363413L;
        printFormattedTime(time);
    }

    public static void printFormattedTime(long time) {
        long hours;
        long minutes;
        long seconds;
        hours = time / 3600;
        minutes = (time - hours * 3600) / 60;
        seconds = time - hours * 3600 - minutes * 60;
        System.out.println(formatTime(hours) + "ч " + formatTime(minutes)+"мин "+ formatTime(seconds)+ "с");

    }

    public static String formatTime(long time) {
        String formattedTime;
        if (time < 10) {
            formattedTime = 0 + Long.toString(time);
        }
        else {
            formattedTime = Long.toString(time);
        }
        return formattedTime;
    }
}

