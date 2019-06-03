package ru.geekbrains.JavaCore2.MatrixTest;


import java.util.Arrays;
import java.util.Scanner;

public class MatrixMain {
    public static void main(String[] args) {

        // начальные условия
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер по горизонтали");
        int HSIZE = scan.nextInt();
        System.out.println("Введите размер по вертикали");
        int VSIZE = scan.nextInt();


        //final int HSIZE = 7; //горизонтальный размер матрицы для заполнения
        //final int VSIZE = 7; // вертикальный  размер матрицы для заполнения
        //final boolean DRECTION = true ; // направление "вкручивания" змейки true-по часовой, false -против часовой
        //final int STARTPOINT = 1 ; // положение головы змейки: 1-лев верх, 2-прав верх, 3 - левый ниж, 4-прав ниж, 5 -центр

        //создаем содержимое "змейки" sa для заполнения матрицы rm
        double [] sa = new double [(VSIZE * HSIZE)];
        sa = SourceArray.generate(VSIZE, HSIZE);
//        System.out.print(Arrays.toString(sa));
//        System.out.println();

        //заполняем результирующую матрицу rm  данными из "змейки" sa
        double [][] rm = new double [VSIZE][HSIZE];
        //rm = ResultMatrix.fillUp(VSIZE, HSIZE, sa, DRECTION, STARTPOINT);
        rm = FillMatrix.fillUp(VSIZE, HSIZE, sa);

        // выводим матрицу на консоль
        for (int i = 0; i < VSIZE; i++) {
            for (int j = 0; j < HSIZE ; j++) {
//                System.out.printf("%5d", rm[i][j]);
                if (rm[i][j] < 10000000) System.out.print("        ");
                System.out.print(rm[i][j] + " ");

            }
            System.out.println();
        }
    }
}
