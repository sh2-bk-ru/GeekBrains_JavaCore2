package ru.geekbrains.JavaCore2.lesson2.add;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        DayOfWeek day;
        int i; // порядковый номер дня недели при счете с нуля
        int n; // количество элементов в перечислении
        DayOfWeek[] daysOfWeek; //массив из значений перечисления

        day = DayOfWeek.THURSDAY ;// здесь можно будет интерактивно подавать на вход день недели
        i = day.ordinal();
        daysOfWeek = DayOfWeek.values();
        n = daysOfWeek.length;

        System.out.println("порядковый номер дня недели " + day.getRussianWeekDayName() + " есть " + (i+1));
        System.out.println("количество дней в неделе " + n);
        System.out.println("в начале дня в "+ day.getRussianWeekDayName() + " до конца рабочей недели остаётся " + day.getRemainingWeekWorkingHours() + " рабочих часов");

    }

}
