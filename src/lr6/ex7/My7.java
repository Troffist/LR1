package lr6.ex7;

public class My7 {
    public static int[] arr;

    public static int[] GetArr(char[] inarr) {
        arr = new int[inarr.length];
        for (int i = 0; i < inarr.length; i++) {
            arr[i] = (int) inarr[i];
        }
        return arr;
    }
}
