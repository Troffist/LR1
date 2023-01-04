package LR1;

import java.util.Calendar;
import  java.util.GregorianCalendar;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();
        int year1 = c.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);
        System.out.print("Input year of birth: ");

        System.out.print("Input age: ");

        int age = in.nextInt();
        int year2 = year1 - age;

        System.out.printf("Year of birth: %d.\n",year2);
         in.close();

    }

}
// Напишите программу, в которой по возрасту определяется год рождения.
