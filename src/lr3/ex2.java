package lr3;

import java.io.ObjectInputStream;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели: ");

        String day = in.nextLine();

        int result1 = GetDaySwitch(day);

        if(result1 == 0) {
            System.out.println("Ошибка ввода названия недели (switch)!");
        }else {
            System.out.printf("Номер дня недели (switch): %d \n",result1);
        }

        int res2 = GetDayIf(day);
        if(res2 == 0) {
            System.out.println("Ошибка ввода названия дня недели  (if)!");
        }else {
            System.out.printf("Номер дня недели  (if): %d \n",res2);
        }

        in.close();
    }

    public static int GetDaySwitch(String day) {
        int res = 0;
        switch (day) {
            case "понедельник": {
                res = 1;
                break;
            }
            case "вторник": {
                res = 2;
                break;
            }
            case "среда": {
                res = 3;
                break;
            }
            case "четверг": {
                res = 4;
                break;
            }
            case "пятница": {
                res = 5;
                break;
            }
            case "суббота": {
                res = 6;
                break;
            }
            case "воскресенье": {
                res = 7;
                break;
            }
            default:
                res = 0;
        }
        return res;
    }

    public static int GetDayIf(String day) {
        int res = 0;
        if(day.equals("понедельник")) {
            res = 1;
        } else if (day.equals("вторник")) {
            res = 2;
        } else if (day.equals("среда")) {
            res = 3;
        } else if (day.equals("четверг")) {
            res = 4;
        } else if (day.equals("пятница")) {
            res = 5;
        } else if (day.equals("суббота")) {
            res = 6;
        } else if (day.equals("воскресенье")) {
            res = 7;
        } else {
            res = 0;
        }
        return res;
    }
}

//  Напишите программу, в которой пользователю предлагается
//  ввести название дня недели. По введенному названию программа определяет
//  порядковый номер дня в неделе. Если пользователь вводит неправильное
//  название дня, программа выводит сообщение о том, что такого дня нет.
//  Предложите версию программы на основе вложенных условных операторов и
//  на основе оператора выбора switch