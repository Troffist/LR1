package LR2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = in.nextDouble();

        double res_num_1 = num % 5;
        double res_num_2 = num % 7;

        String res;

         if ((res_num_1 == 2 ) && (res_num_2 == 1)) {
            res = "Удовлетворяет";
         } else {
           res = "Не удовлетворяет";
         }
         System.out.printf(res);
         in.close();

    }


}
//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1