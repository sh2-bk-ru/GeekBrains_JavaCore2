package ru.geekbrains.JavaCore2.Lesson5Threads;

public class ArrProcessorUniThread {

    static void processing(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время однопоточного исполнения = " + (System.currentTimeMillis() - a));
    }

}
