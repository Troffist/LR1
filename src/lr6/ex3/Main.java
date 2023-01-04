package lr6.ex3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        My3 my3 = new My3();

        Scanner in = new Scanner(System.in);

        System.out.println("Исходные данные: " + my3.toString());

        System.out.print("Введите размер массива: ");
        int num = in.nextInt();

        int[] arr = new int[num];

        Random random = new Random();

        System.out.print("Массив: ");
        for (int i = 0; i < num; i++) {
            arr[i] = random.nextInt(100);
            System.out.printf("%3d",arr[i]);
        }

        System.out.println("\n Выполнен статический метод");
        My3.GetVal(arr);
        System.out.println("Результат: " + my3.toString());

        in.close();
    }

}
// Напишите программу с классом, в котором есть статические методы, которым
// можно передавать произвольное количество целочисленных аргументов (или
// целочисленный массив). Методы, на основании переданных аргументов или массива,
// позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
// значение из набора чисел.
