package lr3;

public class ex7 {

    public static void main(String[] args) {

        int num = 10;

        System.out.print("Рвзмер массива: "+ num + "\n");

         if(num < 0) {
             System.out.println("Введен некоректный размер массива!");
             System.exit(0);
         }
       char[] arr = new char[num];

         int j = 0;
         char val = 'a';
         int num1 = 1;
         while (j < num) {
             if(num1 >= 1) {
                 arr[j] = val;
                 num1 = 0;
                 j++;
             }else {
                 num1++;
             }
             val++;
         }

             System.out.printf("Массив: ");
             for (int item:arr) {System.out.printf("%c",item);}

             System.out.print("\n");

                 System.out.printf("обратный массивЖ ");

             for (int i = arr.length-1; i >= 0; i--) {
                     System.out.printf("%c ", arr[i]);
                 }

    }

    }


// Напишите программу, в которой создается одномерный
// символьный массив из 10 элементов. Массив заполняется буквами «через
// одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
// ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
// порядке. Размер массива задается переменно