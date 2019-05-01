package ru.geekbrains.JavaCore2.lesson2.add;

public enum DayOfWeek {
    MONDAY("Понедельник", 8, 40), TUESDAY("Вторник", 8, 32), WEDNESDAY("Среда", 8, 24), THURSDAY("Четверг",8, 16), FRIDAY("Пятница", 8, 8), SATURDAY ("Суббота", 0, 0), SUNDAY("Воскресенье", 0, 0);
    private String russianWeekDayName;
    private int dayWorkingHours;
    private int remainingWeekWorkingHours;

    public String getRussianWeekDayName() {
        return russianWeekDayName;
    }

    public int getDayWorkingHours() {
        return dayWorkingHours;
    }

    public int getRemainingWeekWorkingHours() {
        return remainingWeekWorkingHours;
    }

    DayOfWeek(String russianWeekDayName, int dayWorkingHours, int remainingWeekWorkingHours) {
        this.russianWeekDayName = russianWeekDayName;
        this.dayWorkingHours = dayWorkingHours;
        this.remainingWeekWorkingHours = remainingWeekWorkingHours;
    }
}
