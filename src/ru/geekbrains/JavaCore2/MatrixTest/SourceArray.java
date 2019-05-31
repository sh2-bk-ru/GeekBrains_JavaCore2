package ru.geekbrains.JavaCore2.MatrixTest;

/* это - "змейка", которая будет вкручиваться в двумерную матрицу
        количество элементов здесь равно количеству элементов в матрице hsize*vsize
*/

public class SourceArray {
    private int hSize;
    private int vSize;

    public static int[] generate(int hSize, int vSize){
        //метод для заполнения данными змейкы
        int sourceArrayLength = hSize * vSize;
        int[]  elements = new int [sourceArrayLength];
        for (int i = 0; i < sourceArrayLength; i++) {
            elements[i] = i + 1; // целыми числами по возрастанию от 1 до hsize*vsize
            // можно заполнить и длугими значения - числами фибоначчи, прогрессией или например последовательность-ключиком
        }
        return elements ;
    }
}
