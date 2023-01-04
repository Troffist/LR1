package lr4;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        int l = 5;
        int h = 3;
        int i, j;
        int[][] arr1 = new int[l][h];
        int[][] arr2 = new int[h][l];

        Random random = new Random();

        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходная матрица:");
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                System.out.printf("%3d",arr1[i][j]);
            }
            System.out.println();
        }

        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }

        System.out.println();

        System.out.println("Транспонированная матрица:");
        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2[i].length; j++) {
                System.out.printf("%3d",arr2[i][j]);


            }
            System.out.println();
        }

        System.out.println();

    }
}
// Напишите программу, в которой создается двумерный
// целочисленный массив. Он заполняется случайными числами. Затем в этом
// массиве строки и столбцы меняются местами: первая строка становится первым
// столбцом, вторая строка становиться вторым столбцом и так далее. Например,
// если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем
// массив из 5 строк и 3 столбцов.
