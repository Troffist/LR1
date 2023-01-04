package LR1;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex10 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
         int year1 = c.get(Calendar.YEAR);

         Scanner in = new Scanner(System.in);

         System.out.println("input year of birth: ");
         int year2 = in.nextInt();
         int age = year1 - year2;
         System.out.printf("Age: %d years old.\n", age);

         in.close();

    }
}
//. Напишите программу, в которой по году рождения определяется возраст
//пользователя.