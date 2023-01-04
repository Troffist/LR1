package lr5.ex6;

public class Task6 {
    private int min;
    private int max;

    public Task6() {
        this.min = 0;
        this.max = 100;
    }

    public void SetNum(int num) {
        CheckNum(num);
    }

    public void SetNums(int num1, int num2) {
        if (num1 > num1) {
            this.max = num1;
            this.min = num2;
        } else {
            this.max = num2;
            this.min = num1;
        }
    }

    private void CheckNum(int num) {
        int res1 = Math.abs(this.min - num);
        int res2 = Math.abs(this.max - num);
        if (res1 >= res2) {
            this.max = num;
        } else {
            this.min = num;
        }
    }

    public String toString() {
        return "min = " + this.min + ", max = " + this.max;

    }
}