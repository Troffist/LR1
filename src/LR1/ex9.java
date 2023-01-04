package LR1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input moth: ");
        String mn = in.nextLine();

        System.out.println("Input days: ");
        int days = in.nextInt();
        System.out.printf("There is %s day(s) in %s.\n", days,mn);
        in.close();
    }

}
//Напишите программу, в которой пользователю предлагается ввести
//название месяца и количество дней в этом месяце. Программа выводит
//сообщение о том, что соответствующий месяц содержит указанное количество
//дней.