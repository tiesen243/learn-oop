import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Hello");
    list.add("World");
    list.add("!");

    // addAll
    ArrayList<String> list2 = new ArrayList<String>();
    list2.addAll(list);

    // retainAll
    ArrayList<String> list3 = new ArrayList<String>();
    list3.add("Hello");
    list2.retainAll(list3);

    Iterator<String> it = list2.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
