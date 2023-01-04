package LR2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        double num = in.nextDouble();

        String res;

        if((num >= 5) && (num <= 10)) {
            res = "Число попадает ";
        } else {
            res = "Не попадает";
        }
        System.out.printf(res);
        in.close();
    }
}
// Напишите программу, которая проверяет, попадает ли введенное
//пользователем число в диапазон от 5 до 10 включительно.