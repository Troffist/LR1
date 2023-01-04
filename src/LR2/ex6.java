package LR2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = in.nextDouble();
        double res_num = num % 3;
        String res;
        if (res_num > 0) {
            res = "Нет, не делится";
        } else {
            res = "Да,число делится";
        }
        System.out.printf(res);
        in.close();

    }
}
// Напишите программу, которая проверяет, делится ли введенное
//пользователем число на 3;