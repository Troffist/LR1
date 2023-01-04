package lr5.ex4;

public class Task4 {
    private int num;
    private char ch;

    public Task4() {
        this.num = 0;
        this.ch = (char) 1;
    }

    public void SetVals1(int num, char ch) {
        this.num = num;
        this.ch = ch;
    }

    public void SetVals2(double db) {
        this.num = (int) db;
        this.ch = (char) ((int) ((db - (double) this.num) * 100));
    }

    public String toString() {
        return "num = " + this.num + ", sym = " + this.ch + ", code = " + (int) this.ch;

    }
}
