package baiTap;

import java.util.Scanner;

public class Bai17 {
  // Viết chương trình đọc một giá trị nguyên từ bàn phím và in ra số đó là số
  // chẵn, lẻ hoặc zero
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập một số nguyên: ");
    int n = scanner.nextInt();

    if (n % 2 == 0)
      System.out.printf("%d là số chẵn\n", n);
    else if (n % 2 != 0)
      System.out.printf("%d là số lẻ\n", n);
    else
      System.out.printf("%d là số zero\n", n);

    scanner.close();

  }
}
