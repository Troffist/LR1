package LR1;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        double num1 = in.nextDouble();
        double num2 = num1 - 1;
        double num3 = num1 + num2;
        double num4 = (num1 + num2 + num3)*(num1 + num2 + num3);

        System.out.printf("Result: %.1f; %.1f; %.1f; %.1f.\n", num1,num2,num3,num4);
        in.close();
    }
}

//Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//меньше введённого, введенное число и число, на единицу больше введенного.
//Четвертое число должно быть квадратом суммы первых трех чисел