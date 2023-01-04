package LR1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Surname: ");
        String name1 = in.nextLine();

        System.out.print("Name: ");
        String name2 = in.nextLine();

        System.out.print("Patronymic: ");
        String name3 = in.nextLine();
        System.out.printf("Hello, %s %s %s!\n", name1,name2,name3);

        in.close();


    }
}
// 1. Напишите программу, в которой Пользователь вводит сначала фамилию,
//затем имя, затем отчество. После ввода программа выводит сообщение «Hello
//<фамилия, имя, отчество>».