package lr5.ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task4 task4 = new Task4();

        Scanner in = new Scanner(System.in);

        System.out.println("«начение переменных: " + task4.toString());

        System.out.print("¬ведите число: ");
        int num = in.nextInt();

        in.nextLine();

        System.out.print("¬ведите символ: ");
        char ch = in.nextLine().charAt(0);

        task4.SetVals1(num, ch);
        System.out.println("«начение переменных: " + task4.toString());

        System.out.print("¬ведите число (double): ");

        double db = in.nextDouble();

        task4.SetVals2(db);

        System.out.println("«начение переменных: " + task4.toString());

        in.close();


    }
}

// Напишите программу с классом, у которого есть символьное и
// целочисленное поле. В классе должны быть описаны версии конструктора с
// двумя аргументами (целое число и символ – определяют значения полей), а
// также с одним аргументом типа double. В последнем случае действительная
// часть аргумента определяет код символа (значение символьного поля), а
// дробная часть (с учетом десятых и сотых) определяет значение
// целочисленного поля. Например, если аргументом передается число 65.1267,
// то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
// поле получит значение 12 (в дробной части учитываются только десятые и
// сотые).
