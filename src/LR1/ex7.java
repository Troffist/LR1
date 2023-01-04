package LR1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("input age: ");
        int age = in.nextInt();

        System.out.printf("Name: %s Age: %d. \n", name,age);
        in.close();
    }
}

//Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.
