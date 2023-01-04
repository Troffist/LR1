package lr4;

public class ex7 {
    public static void main(String[] args) {
        int r = 8;
        int c = 6;
        int i, j, k;
        int[][] arr1 = new int[r][c];

        int maxc = c - 1;
        int maxr = r - 1;

        int count = 0;
        for (i = 0; i < r; i++) {
            if (maxc >= 0) {
                for (j = 0; j <= maxc; j++) {
                    arr1[i][j] = count;
                    count++;
                }

                for (k = maxr; k > i; k--) {
                    arr1[k][maxc] = count;
                    count++;
                }
                maxc--;
            }

        }

        System.out.println("»сходна¤ матрица:");
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                System.out.printf("%4d", arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println();


    }
}
// Напишите программу, в которой создается двумерный числовой массив
// и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
// затем последний столбец (снизу вверх), вторая строка (слева направо) и так
// далее.