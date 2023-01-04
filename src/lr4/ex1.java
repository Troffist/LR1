package lr4;

public class ex1 {
    public static void main(String[] args) {
        int l = 23;
        int h = 11;
        int i, j;

        for (i = 1; i <= l; i++) {
            System.out.print(i + " ");
            for (j = 1; j <= h; j++) {
                System.out.print(" +");
            }

            System.out.println();
            }
            System.out.print("   ");
            for (j = 1; j <= h; j++) {
                System.out.printf("%2d", j);
            }
            System.out.println();
            System.out.println("треугольник из символов 23х11");
    }
}

// Напишите программу, которая выводить в консольное окно
// прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
// строк;