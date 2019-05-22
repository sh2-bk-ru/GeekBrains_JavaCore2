package ru.geekbrains.JavaCore2.Lesson5Threads;

public class ArrProcessor2Threads  extends ArrProcessorUniThread implements Runnable{

    @Override
    public void run() {

        static void processing2Threads(float[] arr){
            // TODO здесь нужна проверка на четность. пока полагаем размер arr чётным
            int halfsize = (arr.length / 2); // длина половинного массива

            float[] a1 = new float[halfsize] ; //первый половинный массив
            float[] a2 = new float[halfsize] ; //второй половинный массив

            long a = System.currentTimeMillis(); // засекаем время начала обработки

            System.arraycopy(arr, 0, a1, 0, halfsize);
            System.arraycopy(arr, halfsize, a2, 0, halfsize);




            System.arraycopy(a1, 0, arr, 0, halfsize);
            System.arraycopy(a2, 0, arr, halfsize, halfsize);

            System.out.println("Время двухпоточного исполнения = " + (System.currentTimeMillis() - a));

    }
}
