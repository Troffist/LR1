package lr3;

public class ex8 {
    public static void main(String[] args) {

       int num = 10;
       System.out.print("Размер массива: " + num + "\n");

       if(num < 0) {
           System.out.println("Введен некорректный размер масссива!");
           System.exit(0);
       }

       char[] arr = new char[num];

       int j = 0;
       char val = 'a';
       while (j < num) {
           if((val != 'a') && (val !='e') && (val != 'i') && (val != 'o') && (val != 'u') && (val != 'y') ) {
               arr[j] = val;
               j++;
       }
           val++;

    }
       System.out.printf("Массив: ");
       for (int item:arr) {System.out.printf("%C ", item);}
    }
}
// Напишите программу, в которой создается символьный массив из
// 10 элементов. Массив заполнить большими (прописными) буквами
// английского алфавита. Буквы берутся подряд, но только согласные (то есть
// гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
// нужно пропустить). Отобразите содержимое созданного массива в консольном
// окне.