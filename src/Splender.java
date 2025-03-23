class Bike {
  protected void run() {
    System.out.println("running");
  }
}

public class Splender extends Bike {
  @Override
  public void run() {
    System.out.println("running safely with 100km");
  }

  public void run(int a) {
    System.out.println("running safely with 60km");
  }

  public void run1() {
    System.out.println("running safely with 69km");
  }

  public static void main(String[] args) {
    Bike a = new Bike();
    a.run();

    Bike b = new Splender();
    b.run();

    Splender c = new Splender();
    c.run();
    c.run(60);
    c.run1();
  }
}
