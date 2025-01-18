package baiTap;

public class Bai13 {
  // Viết chương trình in ra tổng 1+2+3….+n với n được nhập từ tham số command
  // line
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int sum = 0;

    for (int i = 1; i <= n; i++)
      sum += i;

    System.out.println("Tổng 1+2+3+...+" + n + " là: " + sum);
  }
}
