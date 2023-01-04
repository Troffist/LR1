package lr6.ex7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int num = in.nextInt();

        if(num < 0) {
            System.out.println("Количество элементов должно быть больше нуля!");
            System.exit(0);
        }

        String strarr1 = "";
        char[] arr1 = new char[num];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) ('a' + i);
            strarr1 = strarr1 + " " + arr1[i];
        }

        System.out.println("Исходный массив: " + strarr1);

        int[] arr2 = My7.GetArr(arr1);
        String strarr2 = "";
        for (int i = 0; i < arr2.length; i++) {
            strarr2 = strarr2 + " " + arr2[i];
        }

        System.out.println("Измененный массив: " + strarr2);

        in.close();
    }


}


// Напишите программу со статическим методом, аргументом которому передастся
// символьный массив, а результатом возвращается ссылка на целочисленным массив,
// состоящий из кодов символов из массива- аргумента.