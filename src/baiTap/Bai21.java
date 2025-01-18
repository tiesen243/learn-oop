package baiTap;

import java.util.StringTokenizer;

public class Bai21 {
  // Viết hàm tách chuỗi gốc thành chuỗi khác (dùng StringTokenizer).
  // VD: chuỗi gốc S = “Bai Tap Mon Lap Trinh Java”, chuỗi sau khi tách là
  // “Bai
  // Tap
  // Mon
  // Lap
  // Trinh
  // Java”

  private String[] tokens;

  public String[] getTokens() {
    return tokens;
  }

  public String[] splitString(String s) {
    StringTokenizer stringTokenizer = new StringTokenizer(s);
    tokens = new String[stringTokenizer.countTokens()];

    int i = 0;
    while (stringTokenizer.hasMoreTokens()) {
      tokens[i] = stringTokenizer.nextToken();
      i++;
    }

    return tokens;
  }
}
