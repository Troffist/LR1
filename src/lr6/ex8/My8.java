package lr6.ex8;

public class My8 {
    public static double mid;

    public static double GetMid(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            mid += arr[i];
        }
        mid = mid/arr.length;
        return mid;
    }
}

