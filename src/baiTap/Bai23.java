package baiTap;

import java.util.Scanner;

public class Bai23 {
  // Viết chương trình tìm USCLN của 2 số nhập vào.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập số thứ nhất: ");
    int a = scanner.nextInt();
    System.out.print("Nhập số thứ hai: ");
    int b = scanner.nextInt();

    int uscln = 1;
    for (int i = 1; i <= a && i <= b; i++)
      if (a % i == 0 && b % i == 0)
        uscln = i;

    System.out.println("USCLN của " + a + " và " + b + " là: " + uscln);

    scanner.close();
  }
}
