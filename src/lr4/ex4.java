package lr4;

public class ex4 {
    public static void main(String[] args) {
        int l = 10;
        int h = 7;
        int i, j;
        int[][] arr = new int[l][h];

        for (i = 0; i < arr.length; i++) {
            if (i < arr[i].length) {
                for (j = 0; j <= i; j++) {
                    arr[i][j] = 2;
                }
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (i < arr[i].length) {
                for (j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
//Напишите программу, в которой создается двумерный массив,
//который выводит прямоугольный треугольник;