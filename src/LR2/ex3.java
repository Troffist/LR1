package LR2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        double num = in.nextDouble();

        double res_num_1 = num % 4;
        String res;

        if ((res_num_1 == 0) && (num >= 10)) {
            res = "Удовлетворяет";
        } else {
            res = "Не удовлетворяет";
        }
        System.out.printf(res);
        in.close();
    }
}
// Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10