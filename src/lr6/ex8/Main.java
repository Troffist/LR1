package lr6.ex8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Количество элементов должно быть больше нуля!");
            System.exit(0);
        }

        String strarr1 = "";
        int[] arr1 = new int[num];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            strarr1 = strarr1 + " " + arr1[i];
        }

        System.out.println("Исходный массив: " + strarr1);

        double mid = My8.GetMid(arr1);
        System.out.printf("Среднее значение элементов массива: %.2f \n", mid);

        in.close();
    }
}
// Напишите программу со статическим методом, аргументом которому передается
// целочисленный массив, а результатом возвращается среднее значение для элементов
// массива (сумма значений элементов, деленная на количество элементов в массиве).