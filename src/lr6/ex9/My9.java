package lr6.ex9;

public class My9 {
    public static char[] GetArr(char[] inarr) {
        char item;
        for (int i = 0; i < inarr.length/2; i++) {
            item = inarr[inarr.length - 1 - i];
            inarr[inarr.length - 1 - i] = inarr[i];
            inarr[i] = item;
        }
        return inarr;
    }

}
