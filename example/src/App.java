public class App {
  public static void main(String[] args) {
    Student a = new Student(1, "Alice", 20);
    Student b = new Student(2, "Bob", 21);
    Student c = new Student(3, "Charlie", 22);

    System.out.println("ID\tName\tAge");
    System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getAge());
    System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAge());
    System.out.println(c.getId() + "\t" + c.getName() + "\t" + c.getAge());
  }
}
