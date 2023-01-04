package LR1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.nextLine();

        System.out.println("Input date: ");
        int dt = in.nextInt();

        in.nextLine();

        System.out.println("Input month: ");
        String mn = in.nextLine();

        System.out.printf("Day: %s Date: %d Month: %s.\n", day,dt, mn);
        in.close();
    }
}
//Напишите программу, в которой Пользователь последовательно вводит
//название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

