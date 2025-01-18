package baiTap;

public class Bai14 {
  // Viết chương trình in ra tổng 1+3+5….+n nếu n là số chẵn, 2+4+6+….n nếu n là
  // số lẻ. Giá trị n được nhập vào từ tham số command line
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int sum = 0;

    if (n % 2 != 0) {
      for (int i = 1; i <= n; i += 2)
        sum += i;

      System.out.println("Tổng 1+3+5+...+" + n + " là: " + sum);
    } else {
      for (int i = 2; i <= n; i += 2)
        sum += i;

      System.out.println("Tổng 2+4+6+...+" + n + " là: " + sum);
    }

  }
}
