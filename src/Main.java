import onTap.*;

public class Main {

  public static void main(String[] args) {
    System.out.println("Bai 1");
    Bai1 b1 = new Bai1(9);
    b1.show();

    System.out.println("--------------------");
    System.out.println("Bai 2");
    Bai2 b2 = new Bai2(10);
    b2.show();

    System.out.println("--------------------");
    System.out.println("Bai 3");
    Bai3 b3 = new Bai3(new int[] { 3, 5, 1, 23, 51, 3, 56, 1 });
    b3.show();

    System.out.println("--------------------");
    System.out.println("Bai 4");
    Bai4 b4 = new Bai4();
    b4.show();
  }
}
