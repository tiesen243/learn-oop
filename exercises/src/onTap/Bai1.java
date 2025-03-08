package onTap;

public class Bai1 {
    private int n;

    public Bai1(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int multiply(int n, int m) {
        return n * m;
    }

    public void show() {
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(i + " x " + j + " = " + multiply(i, j));
            }
        }

    }

}
