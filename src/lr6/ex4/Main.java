package lr6.ex4;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Введите количество элементов: ");
        int num = in.nextInt();

        if (num <= 0 ) {
                System.out.println("Количество элементов должно быть больше нуля!");
                System.exit(0);
        }

       My4.CountFact1(num);
        System.out.println("Расчет двойного факториала без рекурсии: " + My4.str1 + "= " + My4.fact1);

        My4.CountFact2(num);
        System.out.println("Расчет двойного факториала с рекурсией: " + My4.str2 + "= " + My4.fact1);

    }


}

// Напишите программу, в которой описан статический метод для вычисления
// двойного факториала числа, переданного аргументом методу. По определению, двойной
// факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
// больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
// нечетного п и равен 2 для четного n).
// Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.