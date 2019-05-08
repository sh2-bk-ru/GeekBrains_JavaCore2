package ru.geekbrains.JavaCore2.lesson2;

public class MyArrayExceptionMain {
    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива: " + ArrayCheck.sumCalc(TestArray.testArray4));
        } catch (Lesson2ArraySizeException | Lesson2ArrayDataException ex) {
            System.out.println(ex);
        }

    }
}
