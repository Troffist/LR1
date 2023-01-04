package lr6.ex5;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int num = in.nextInt();

        if(num <= 0) {
            System.out.println("Количество элементов должно быть больше нуля!");
            System.exit(0);
        }

        My5.CountSum(num);
        System.out.println("Расчет суммы квадратов без рекурсии: " + My5.str1 + "= " + My5.sum1);

        My5.CountSumRec(num);
        System.out.println("Расчет суммы квадратов с рекурсией: " + My5.str2 + "= " + My5.sum2);

        in.close();
    }

}


// Напишите программу со статическим методом, которым вычисляется сумма
// квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + п^2.Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=(n+l) (2n + 1)/6