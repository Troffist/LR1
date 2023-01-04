package LR2;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = in.nextDouble();
        int num2 = (int)((num % 10000)/1000);
        System.out.printf("Result: %d ",num2);
        in.close();
    }
}
//Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).