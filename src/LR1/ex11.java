package LR1;

import java.util.Scanner;
import java.util.Calendar;
import  java.util.GregorianCalendar;

public class ex11 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        int year1 = c.get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year of birth: ");
        int year2 = in.nextInt();
        int age = year1 - year2;

        System.out.printf("Name: %s Age: %d.\n", name,age);
        in.close();





    }
}
//Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его
//возраст.