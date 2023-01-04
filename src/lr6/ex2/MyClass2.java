package lr6.ex2;

public class MyClass2 {
    private static int count;

    public MyClass2() {
        count = 0;
    }

    public static void GetCount() {
        count++;
    }

    public String toString() {
        return "count = " + count;
    }
}
