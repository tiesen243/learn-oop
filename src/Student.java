public class Student {
  private String name;
  private Number age;

  public Student(final String name, final Number age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Number getAge() {
    return age;
  }

  public void setAge(final Number age) {
    this.age = age;
  }

  public void studying() {
    System.out.println("I fuk ur mum");
  }
}
