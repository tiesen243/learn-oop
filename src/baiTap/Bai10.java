package baiTap;

public class Bai10 {
  // Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for
  // hoặc while)
  public static void main(String[] args) {
    int res = 0;

    for (int i = 2; i <= 20; i += 2)
      res += i;

    System.out.println("Tổng của 10 số chẵn đầu tiên: " + res);
  }
}
