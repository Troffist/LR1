package lr3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int num = in.nextInt();

        String result = "";

        switch (num){
            case 1: {
                result = "понедельник";
                break;
            }
            case 2: {
                result = "вторник";
                break;
        }
            case 3: {
            result = "среда";
            break;
            }
            case 4: {
                result = "четверг";
                break;
            }
            case 5: {
                result = "пятница";
                break;
            }
            case 6: {
                result = "суббота";
                break;
            }
            case 7: {
                result = "воскресенье";
                break;
            }
            default: result = "Не праввильное число! Введите от 1 до 7. ";

        }

        System.out.printf("Result: %s \n",result);

        in.close();





    }
}


// Напишите программу, в которой пользователь вводит целое число
// в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
// Если введенное пользователем число выходит за допустимый диапазон,
// выводится сообщение о том, что введено некорректное значение. Используйте
// оператор выбора switch.