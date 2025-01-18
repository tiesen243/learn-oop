package baiTap;

public class Bai28 {
  public void hinh1() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == 1 || i == 9 || j == 1 || j == i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public void hinh2() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i == 1 || i == 9 || j == 1 || j == 9 || i == j || i + j == 10) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public void hinh3() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i == 1 || i == 9 || j == 1 || j == 9 || i == j || i + j == 10) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

}
