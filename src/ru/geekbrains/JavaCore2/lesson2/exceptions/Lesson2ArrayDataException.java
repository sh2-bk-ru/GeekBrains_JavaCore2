package ru.geekbrains.JavaCore2.lesson2.exceptions;

public class Lesson2ArrayDataException extends Exception {

    public Lesson2ArrayDataException(int i, int j, String value, Throwable caused) {
        super(String.format("Некорректное значение %s в ячейка [%d][%d]", value, i, j), caused);
    }
}
