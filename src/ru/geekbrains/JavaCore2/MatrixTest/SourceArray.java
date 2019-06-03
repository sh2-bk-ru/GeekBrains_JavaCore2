package ru.geekbrains.JavaCore2.MatrixTest;

import static java.lang.Math.pow;
/* это - "змейка", которая будет вкручиваться в двумерную матрицу
        количество элементов здесь равно количеству элементов в матрице hsize*vsize
*/

public class SourceArray {
    private int hSize;
    private int vSize;

    public static double[] generate(int hSize, int vSize){
        //метод для заполнения данными змейкы
        int sourceArrayLength = hSize * vSize;
        double[]  elements = new double[sourceArrayLength];
        for (int i = 0; i < sourceArrayLength; i++) {
//            elements[i] = i + 1; // целыми числами по возрастанию от 1 до hsize*vsize
            //elements[i] = pow(2 ,i); //  заполняем степенями двойки
            elements[i] = i * 2 + 1;
            // можно заполнить и длугими значения - числами фибоначчи, прогрессией или например последовательность-ключиком
        }
        return elements ;
    }
}
