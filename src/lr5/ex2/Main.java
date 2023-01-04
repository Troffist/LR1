package lr5.ex2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Task2 task2 = new Task2();

        Scanner in = new Scanner(System.in);

        System.out.print("Введите символ 1: ");

        char sym = in.nextLine().charAt(0);

        task2.setCh1(sym);

        System.out.print("Введите символ 2: ");

        sym = in.nextLine().charAt(0);

        task2.setCh2(sym);

        System.out.println("Ответ: " + task2.toString());

        in.close();

    }

    }
// Напишите программу с классом, у которого есть два символьных поля и
// метод. Он возвращает результат, и у него нет аргументов. При вызове метод
// выводит в консольное окно все символы из кодовой таблицы, которые
// находятся «между» символами, являющимися значениями полей объекта (из
// которого вызывается метод). Например, если полям объекта присвоены
// значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
// выводиться все символы от ‘A’ до ‘D’ включительно.