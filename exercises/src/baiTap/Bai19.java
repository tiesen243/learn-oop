package baiTap;

import java.util.Scanner;

public class Bai19 {
  // Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập chuỗi: ");
    String str = scanner.nextLine();

    int count = 0;
    for (int i = 0; i < str.length(); i++)
      if (str.charAt(i) == 'a')
        count++;

    System.out.println("Số lần kí tự 'a' xuất hiện trong chuỗi là: " + count);

    scanner.close();
  }
}
