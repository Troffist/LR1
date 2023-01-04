package lr4;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");

        String s = in.nextLine();

        System.out.print("Введите ключ шифрования: ");

        int shift = in.nextInt();

        s = getEncryptString(s, shift);

        System.out.println("Текст после шифрования: " + s);
        in.nextLine();

        boolean lock = false;

        while (!lock) {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            String key = in.nextLine();
            switch (key) {
                case "y", "д": {
                    s = getDencryptString(s, shift);
                    System.out.println("Текст после дешифрования: " + s);
                    lock = true;
                    break;
                }
                case "n", "н": {
                    System.out.println("До свидания!");
                    lock = true;
                    break;
                }
                default: {
                    System.out.println("Введите корректный ответ.");
                }
            }

        }

        in.close();
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];

        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + shift;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }

        encryptString = new String(ArrayCharNew);
        return encryptString;
    }

    public static String getDencryptString(String dencryptString, int shift) {
        char[] ArrayChar = dencryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];

        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] - shift;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }

        dencryptString = new String(ArrayCharNew);
        return dencryptString;

    }
}
// Напишите программу «Шифр Цезаря», которая зашифровывает
// введенный текст. Используете кодовую таблицу символов. При запуске
// программы в консоль необходимо вывести сообщение: «Введите текст для
// шифрования», после ввода текста, появляется сообщение: «Введите ключ».
// После того как введены все данные, необходимо вывести преобразованную
// строку с сообщением «Текст после преобразования : ». Далее необходимо
// задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
// если пользователь вводит «y», тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До
// свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
// то программа ему выводит сообщение: «Введите корректный ответ».