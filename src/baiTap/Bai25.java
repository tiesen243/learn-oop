package baiTap;

public class Bai25 {
  // Tính tổng các số nguyên tố nhỏ hơn N
  private int n;
  private int sum;

  public Bai25(int n) {
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  private boolean isPrime(int n) {
    if (n < 2)
      return false;

    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;

    return true;
  }

  private int sumPrime() {
    for (int i = 2; i < n; i++)
      if (isPrime(i))
        sum += i;

    return sum;
  }

  public void show() {
    System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + sumPrime());
  }

}
