package baiTap;

public class Bai27 {
  // iết chương trình nhập vào số nguyên n và thực hiện:
  // Xuất ra màn hình n số đầu tiên của chuỗi Fibonaci (có hai giá trị đầu là 1 và
  // 1)

  private int n;

  public Bai27(int n) {
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  private int fibonaci(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return fibonaci(n - 1) + fibonaci(n - 2);
  }

  public void show() {
    for (int i = 0; i < n; i++)
      System.out.print(fibonaci(i) + " ");

    System.out.println();
  }

}
