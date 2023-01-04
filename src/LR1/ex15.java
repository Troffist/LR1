package LR1;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input number 1: ");
        double num1 =  in.nextDouble();
        System.out.print("Input number 2: ");
        double num2 = in.nextDouble();
        double num3 = num1 + num2;
        double num4 = num1 - num2;

        System.out.printf("Result: %.1f; %.1f.\n", num3,num4);

        in.close();
    }
}
//Напишите программу, в которой Пользователь вводит два числа, а
//программой вычисляется и отображается сумма и разность этих чисел