package lr4;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {

        int l = 5;
        int h = 6;
        int i, j;
        int[][] arr1 = new int[l][h];

        Random random = new Random();

        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(10);
            }
        }

        System.out.println("исходная матрица:");
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                System.out.printf("%3d", arr1[i][j]);
            }
            System.out.println();
        }

        int row = random.nextInt(l);
        int col = random.nextInt(h);

        System.out.println("Удаляем строку " + (row + 1) + " и столбец " + (col + 1));

        int[][] arr2 = new int[l - 1][h - 1];

        int a = 0, b = 0;
        for (i = 0; i < arr1.length; i++) {
            if (i != row) {
                b = 0;
                for (j = 0; j < arr1[i].length; j++) {
                    if (j != col) {
                        arr2[a][b] = arr1[i][j];
                        b++;
                    }
                }
                a++;
            }
        }

        System.out.println();
        System.out.println("Измененная матрица: ");
        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2[i].length; j++) {
                System.out.printf("%3d", arr2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

    }
}
// Напишите программу, в которой создается и инициализируется
// двумерный числовой массив. Затем из этого массива удаляется строка и
// столбец (создается новый массив, в котором по сравнению с исходным
// удалена одна строка и один столбец). Индекс удаляемой строки и индекс
// удаляемого столбца определяется с помощью генератора случайных чисел.
