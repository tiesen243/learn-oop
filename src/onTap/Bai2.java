package onTap;

public class Bai2 {
    int n;

    public Bai2(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int calculateSquare(int n) {
        return n * n;
    }

    private int calculateCube(int n) {
        return n * n * n;
    }

    public void show() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Binh phuong cua " + i + " là: " + calculateSquare(i));
            System.out.println("Lap phuong cua " + i + " là: " + calculateCube(i));
        }
    }
}
