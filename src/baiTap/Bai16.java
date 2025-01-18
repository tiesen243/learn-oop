package baiTap;

public class Bai16 {
  // Viết chương trình giải phương trình bậc 1 với hệ số a, b được nhập vào bởi
  // user từ tham số command line
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    if (a == 0) {
      if (b == 0) {
        System.out.println("Phương trình có vô số nghiệm");
      } else {
        System.out.println("Phương trình vô nghiệm");
      }
    } else {
      double x = -b / a;
      System.out.println("Nghiệm của phương trình là: " + x);
    }
  }
}
