package baiTap;

public class Bai22 {
  // Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không

  public boolean isPrime(int n) {
    if (n < 2)
      return false;

    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;

    return true;
  }
}
