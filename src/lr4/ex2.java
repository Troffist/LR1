package lr4;

public class ex2 {
    public static void main(String[] args) {
        int l = 23;
        int h = 11;
        int i,j;

        for (i = 1; i <=l; i++) {
            System.out.print(i + " ");
            for (j = 1; j <+i; j++) {
                System.out.print(" +");
            }
            System.out.println();
        }
        System.out.print("   ");
        for (j = 1; j <= l; j++) {
            System.out.printf("%2d", j);
        }
        System.out.println();
        System.out.println("прямоугольный треугольник");


    }
}
// Напишите программу, которая выводит в консольное окно
// прямоугольный треугольник;