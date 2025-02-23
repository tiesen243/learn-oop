public class Main {

  public static void main(String[] args) {
    A a1 = new A(2, 3);
    a1.show();

    A a2 = new A();
    a2.show();
  }
}

class A {

  private Integer x;
  private Integer y;

  private A(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  public A() {
    this(6, 8);
  }

  public void show() {
    System.out.println(x + y);
  }
}
