package ru.geekbrains.JavaCore2.lesson2;

public class ArrayCheck {

    private final static int SIZE = 4;

    public static int sumCalc(String[][] arr) throws Lesson2ArraySizeException, Lesson2ArrayDataException {
        int res = 0;

        if (arr.length != SIZE) {
            throw new Lesson2ArraySizeException();
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new Lesson2ArraySizeException();
            }

            for (int j=0; j<arr[i].length; j++) {
                try {
                    res += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new Lesson2ArrayDataException(i, j, arr[i][j], ex);
                }
            }
        }

        return res;
    }
}
