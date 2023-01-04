package lr6.ex5;

public class My5 {
    public static int sum1;
    public static int sum2;
    public static String str1;
    public static String str2;

    public My5() {
        sum1 = 0;
        sum2 = 0;
    }

    public static void CountSum(int num) {
        str1 = "";
        sum1 = GetSum(num);
    }

    public static void CountSumRec(int num) {
        str2 = "";
        sum2 = GetSumRec(num);
    }

    private static int GetSum(int num) {
        int ret = 0;
        for (int i = num; i >= 1 ; i--) {
            ret = ret + i*i;
            str1 = str1 + i + "^2 ";
        }
        return ret;
    }

    private static int GetSumRec(int num) {
        int ret = 0;
        if (num < 1) {
            return ret;
        }
        str2 = str2 + num + "^2 ";
        ret = num*num + GetSumRec(num - 1);
        return ret;
    }

    public String toString() {

        return "sum1 = " + sum1 + ", sum2 = " + sum2;
    }

}
