package lr3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int num = in.nextInt();

        if (num > 0) {

            int[] arr1 = GetArrFor(num);

            int sum1 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
            }

            System.out.print("Результат  при делении на 5 (for): ");
            for (int i : arr1) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            System.out.println("Cумма элементов (for): " + sum1);

            int[] arr2 = GetArrWhile(num);

            int sum2 = 0;
            int j = 0;
            while(j < arr2.length) {
                sum2 += arr2[j];
                j++;
            }

            System.out.print("Результат при делении на 3 (while): ");
            for (int i : arr2) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            System.out.println("Cумма элементов (while): " + sum2);

        }

        in.close();
    }

    public static int[] GetArrFor(int num) {
        int[] arr = new int[num];
        int val = 0;
        int num1 = 0;
        int num2 = 0;
        int j = 0;
        int max = num;
        for (int i = 0; i < max; i++) {
            num1 = i % 5;
            num2 = i % 3;
            if ((num1 == 2) && (num2 == 1)) {
                arr[j] = i;
                j++;
            } else {
                max++;
            }
        }
        return arr;
    }

    public static int[] GetArrWhile(int num) {
        int[] arr = new int[num];
        int j = 0;
        int val = 0;
        int num1 = 0;
        int num2 = 0;
        while (j < num) {
            num1 = val % 5;
            num2 = val % 3;
            if ((num1 == 2) && (num2 == 1)) {
                arr[j] = val;
                j++;
            }
            val++;
        }
        return arr;
    }
}

// Напишите программу, в которой вычисляется сумма чисел,
// удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
// вводится пользователем. Программа отображает числа, которые
// суммируются, и значение суммы. Предложите версии программы,
// использующие разные операторы цикла
