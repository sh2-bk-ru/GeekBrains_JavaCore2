package ru.geekbrains.JavaCore2.MatrixTest;

/* это - двумерная матрица,
в которую будет "вкручиваться" передаваемая сюда змейка
всё волшебство здесь!
*/

public class ResultMatrix {

    private int hSize;
    private int vSize;
    private boolean direction;
    private int startPoint;

    /* способ заполнения ячеек матрицы данными из змейки (потом) будет регулироваться переменными
        direction - направление true-по часовой, false - против часовой
        startPoint - положение головы змейки: 1-лев верх, 2-прав верх, 3 - левый ниж, 4-прав ниж, 5 -центр
     */
    public static int [][] fillUp(int hSize, int vSize, int[] sa, boolean direction, int startPoint){
        int[][]  matrix = new int [hSize][vSize];
        int sourceArrayLength = hSize * vSize;

        // TODO : здесь должно быть управление положением начала заполнения матрицы
        //  в зависимости от значения startPoint
        // сейчас делаем для startPoint = 1

        int startLine = 0;
        int endLine = hSize - 1 ;

        int startColumn = 0;
        int endColumn = vSize - 1;

        //step - текущий номер элемента змейки
        for (int step = 0; step < sourceArrayLength;  ){

            // проходим колонки одной строки между ограничителями и делаем ссылки из матрицы на соответствующий элемент змейки
            for (int i = startColumn; i <= endColumn ; i++) {
                matrix[startLine][i] = sa[step];
                step++;
            }
            startLine++;//сдвигаем вниз оверхний граничитель строки

            //проходим строчки в колонке
            for (int i = startLine; i <= endLine; i++){
                matrix[i][endColumn] = sa[step];
                step++;
            }
            endColumn--; //сдвигаем влево правый ограничитель столбца

            //проходим колонки в обратном порядке
            for (int i = endColumn; i >= startColumn ; i--) {
                matrix[endLine][i] = sa[step];
                step++;
            }
            endLine--; // сдвигаем вверх нижний ограничитель строки

            //проходим строчки в колонке в обратном порядке
            for (int i = endLine; i >= startLine ; i--) {
                matrix[i][startColumn] = sa[step];
                step++;
            }
            startColumn++; // сдвигаем вправо левый ограничитель столбца
        }
        return matrix;
    }
}
