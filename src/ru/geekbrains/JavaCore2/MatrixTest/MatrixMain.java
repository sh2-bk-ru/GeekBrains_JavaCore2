package ru.geekbrains.JavaCore2.MatrixTest;


import java.util.Arrays;

public class MatrixMain {
    public static void main(String[] args) {

        // начальные условия
        final int HSIZE = 7; //горизонтальный размер матрицы для заполнения
        final int VSIZE = 7; // вертикальный  размер матрицы для заполнения
        final boolean DRECTION = true ; // направление "вкручивания" змейки true-по часовой, false -против часовой
        final int STARTPOINT = 1 ; // положение головы змейки: 1-лев верх, 2-прав верх, 3 - левый ниж, 4-прав ниж, 5 -центр

        //создаем содержимое "змейки" sa для заполнения матрицы rm
        int [] sa = new int [(HSIZE * VSIZE)];
        sa = SourceArray.generate(HSIZE, VSIZE);
        System.out.print(Arrays.toString(sa));
        System.out.println("");

        //заполняем результирующую матрицу rm  данными из "змейки" sa
        int [][] rm = new int [HSIZE][VSIZE];
        rm = ResultMatrix.fillUp(HSIZE, VSIZE, sa, DRECTION, STARTPOINT);

        // выводим матрицу на консоль
        for (int i = 0; i < VSIZE; i++) {
            for (int j = 0; j < HSIZE ; j++) {
                System.out.printf("%5d", rm[i][j]);
            }
            System.out.println("");
        }
    }
}
