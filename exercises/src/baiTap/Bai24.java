package baiTap;

import java.util.Scanner;

public class Bai24 {
  // Viết chương trình tính tổng N số nguyên.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập số nguyên N: ");
    int n = scanner.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print("Nhập số nguyên thứ " + i + ": ");
      sum += scanner.nextInt();
    }

    System.out.println("Tổng " + n + " số nguyên là: " + sum);
    scanner.close();
  }
}
