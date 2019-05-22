package ru.geekbrains.JavaCore2.Lesson5Threads;

import java.util.Arrays;

public class MainTheadsClass {
    static final int SIZE = 10000000 ;
    static final int HALFSIZE = SIZE / 2 ;


    public static void main(String[] args) throws InterruptedException{
        float[] arrayToProcess = new float[SIZE] ;

        Arrays.fill(arrayToProcess, 1.0f);
        ArrProcessorUniThread.processing(arrayToProcess);

        Arrays.fill(arrayToProcess, 1.0f);
        ArrProcessor2Threads.processing2Threads (arrayToProcess);


    }

}
