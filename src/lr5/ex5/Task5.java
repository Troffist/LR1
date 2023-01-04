package lr5.ex5;

public class Task5 {

    private int num;

    public Task5() {
        this.num = -2;
    }

    public void SetNum() {
        this.num = 0;
    }

    public void SetNum(int num) {
        if (CheckNum(num)) {
            num = 100;
        }
        this.num = num;
    }

    private boolean CheckNum(int num) {
        boolean ret = false;
        if (num > 100) {
            ret = true;
        }
        return ret;
    }

    @Override
    public String toString() {
        return "num = " + this.num;


    }
}
