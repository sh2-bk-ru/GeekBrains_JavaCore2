package ru.geekbrains.JavaCore2.MatrixTest;

public class FillMatrix {

    private int hSize;
    private int vSize;

    public static double [][] fillUp(int vSize, int hSize, double[] sa) {

        double[][] matrix = new double [vSize][hSize];
        int sourceArrayLength = vSize * hSize;
        int direction =0 ;
        int iteration =0 ;
        //int step = 0;
        int step = 0;

        for (int n = 0; step < sourceArrayLength; n++) {
            direction = n % 4 ;
            iteration = n / 4 ;

            switch (direction){
                case 0:
                    for (int j = iteration; j < hSize - iteration; j++, step++) {
                        matrix[iteration][j] = sa[step];
//                        matrix[iteration][j] = step;
                    }
                    break;

                case 1:
                    for (int i = iteration + 1; i < vSize - iteration; i++ , step++) {
                        matrix[i][hSize - iteration - 1] = sa[step];
//                        matrix[i][hSize - iteration - 1] = step;
                    }
                    break;

                case 2:
                    for (int j = hSize - iteration - 2; j >= iteration ; j--, step++){
                        matrix[vSize - iteration -1][j] = sa[step];
//                        matrix[vSize - iteration -1][j] = step;
                    }
                    break;

                case 3:
                    for (int i = vSize - iteration - 2; i > iteration; i--, step++){
                        matrix[i][iteration] = sa[step];
//                        matrix[i][iteration] = step;
                    }
                    break;
            }
        }
        return matrix;
    }




}
