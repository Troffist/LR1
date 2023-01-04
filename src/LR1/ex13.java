package LR1;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number1: ");
        int num1 = in.nextInt();
        System.out.print("Input number2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.printf("Result: %d.\n", sum);
        in.close();
    }
}

 //Напишите программу для вычисления суммы двух чисел. Оба числа
//вводятся пользователем. Для вычисления суммы используйте оператор +.