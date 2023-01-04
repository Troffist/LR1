package lr5.ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Task3 task3 = new Task3();

        Scanner in = new Scanner(System.in);

        System.out.println("«значение переменных: " + task3.toString());

        System.out.print("ведите число 1: ");

        int num1 = in.nextInt();

        task3.SetNum1(num1);

        System.out.println("«значение переменных: " + task3.toString());

        System.out.print("ведите число 2: ");

        int num2 = in.nextInt();

        task3.SetNum2(num2);

        System.out.println("«значение переменных: " + task3.toString());

        System.out.print("ведите число 1: ");
        num1 = in.nextInt();

        System.out.print("ведите число 2: ");
        num2 = in.nextInt();

        task3.SetNums(num1,num2);
        System.out.println("«значение переменных: " + task3.toString());

        in.close();

    }


    }

// Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать
// объекты без передачи аргументов, с передачей одного аргумента и с передачей
// двух аргументов
