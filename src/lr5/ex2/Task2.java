package lr5.ex2;

public class Task2 {

    char ch1;
    char ch2;

    public int getCh1() {
        return ch1;
    }

    public void setCh1(char ch) {
        this.ch1 = ch;
    }

    public int getCh2() {
        return ch2;
    }

    public void setCh2(char ch) {
        this.ch2 = ch;
    }

    public String toString() {
        char start = this.ch1;
        char end = this.ch2;
        if (this.ch2 < this.ch1) {
            start = this.ch2;
            end = this.ch1;
        }

        String str = "";

        for (char i = start; i <= end; i++) {
            str = str + i + " ";
        }

        return str;
    }

}
