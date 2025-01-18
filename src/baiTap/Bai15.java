package baiTap;

public class Bai15 {
  // Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá
  // trị user đã nhập vào từ tham số command line.
  public static void main(String[] args) {
    int max = Integer.parseInt(args[0]);
    int min = Integer.parseInt(args[0]);

    for (int i = 1; i < args.length; i++) {
      int value = Integer.parseInt(args[i]);
      if (value > max)
        max = value;
      if (value < min)
        min = value;
    }

    System.out.println("Giá trị lớn nhất là: " + max);
    System.out.println("Giá trị nhỏ nhất là: " + min);
  }
}
