package baiTap;

public class Bai26 {
  // Tính tổng N số nguyên tố đầu tiên
  private int n;
  private int sum;

  public Bai26(int n) {
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  private boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  private int sumPrime() {
    int count = 0;
    int i = 2;
    while (count < n) {
      if (isPrime(i)) {
        sum += i;
        count++;
      }
      i++;
    }
    return sum;
  }

  public void show() {
    System.out.println("Tổng " + n + " số nguyên tố đầu tiên là: " + sumPrime());
  }

}
