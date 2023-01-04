package lr5.ex3;

public class Task3 {

    private int num1;
    private int num2;

    public Task3() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void SetNum() {
        this.num1 = 1;
        this.num2 = 2;
    }

    public void SetNum1(int num) {
        this.num1 = num;
    }

    public void SetNum2(int num) {
        this.num2 = num;
    }

    public void SetNums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public String toString() {
        return "num1 = " + this.num1 + ", num2 = " + this.num2;
    }

}

