package baiTap;

public class Bai12 {
  // Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++)
      if (i % 7 == 0)
        sum += i;

    System.out.println("Tổng các số là bội số của 7 từ 1 đến 100 là: " + sum);
  }
}
