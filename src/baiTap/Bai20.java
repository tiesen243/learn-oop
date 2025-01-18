package baiTap;

public class Bai20 {
  // Viết hàm để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ
  // bàn phím. Dùng mã ASCII để kiểm tra hoặc dùng class Character:
  // Character.isDigit(ký tự) để kiểm ký tự có phải là số hay không .
  private int count = 0;

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int countDigits(String s) {
    for (int i = 0; i < s.length(); i++)
      if (Character.isDigit(s.charAt(i)))
        count++;

    return count;
  }
}
