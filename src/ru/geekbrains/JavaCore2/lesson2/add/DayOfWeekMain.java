package ru.geekbrains.JavaCore2.lesson2.add;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        DayOfWeek day;
        int i; // порядковый номер дны недели
        int n; // количество элементов в перечислении
        DayOfWeek[] daysOfWeek; //массив из значений перечисления

        day = DayOfWeek.SUNDAY ;// здесь можно будет интерактивно подавать на вход день недели
        i = day.ordinal();
        daysOfWeek = DayOfWeek.values();
        n = daysOfWeek.length;

        System.out.println("порядковый номер " + day.getRussianWeekDayName() + " есть " + i);
        System.out.println("количество элементов в перечислении " + n);
        System.out.println("в начале рабочего дня в "+ day.getRussianWeekDayName() + " до конца рабочей недели остаётся " + day.getRemainingWeekWorkingHours() + " часов");
//TODO
/*        сделать цикл for each для списка енума, который будет бежать от текущей позиции дня недели до конца недели и считать часы, оставшиеся до конца рабочей недели

 */
    }

}
