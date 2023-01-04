package lr6.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyClass2 myClass2 = new MyClass2();

        Scanner in = new Scanner(System.in);

        System.out.println("Значение переменной: " + myClass2.toString());

        System.out.print("Введите число повторений: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print("Выполнен вызов статичесого метода. ");
            MyClass2.GetCount();
            System.out.println("Значение переменной: " + myClass2.toString());
        }

        in.close();

    }
}
// Напишите программу с классом, в котором есть закрытое статическое
// целочисленное поле с начальным нулевым значением. В классе должен быть описан
// статический метод, при вызове которого отображается текущее значение статического
// поля, после чего значение поля увеличивается на единицу.