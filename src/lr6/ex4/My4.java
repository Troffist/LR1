package lr6.ex4;

public class My4 {
    public static int fact1;
    public static int fact2;
    public static String str1;
    public static String str2;

    public My4() {
        fact1 = 0;
        fact2 = 0;
    }

    public static void CountFact1(int num) {
        str1 = "";
        fact1 = GetFact(num);
    }

    public static void CountFact2(int num) {
        str2 = " ";
        fact2 = GetFactRec(num);
    }

    private static int GetFactRec(int num) {
        int ret = 0;
        if (num < 1) {
            return ret;
        }
        str2 = str2 + num + " ";
        ret = num * GetFactRec( num - 2);
        return ret;
    }

    private static int GetFact(int num) {
        int ret = 1;
        for (int i = num; i >= 1; i -= 2) {
            ret = ret * i;
            str1 = str1 + i + " ";
        }
        return ret;
    }

    public String toString() {
        return "fact1 = " + fact1 + ", fact2 = " + fact2;
    }

}
