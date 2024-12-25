public class app {
    public static void main(String[] args) {
        People p1 = new People(1, "John", 20);
        p1.display();

        Worker w1 = new Worker(2, "Alice", 25, "Engineer");
        w1.display();
        w1.do_work();

        Student s1 = new Student(3, "Bob", 18, "High School");
        s1.display();
        s1.study();
    }
}

class People {
    int id;
    String name;
    int age;

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }

}

class Worker extends People {
    String job;

    public Worker(int id, String name, int age, String job) {
        super(id, name, age);
        this.job = job;
    }

    public void do_work() {
        System.out.println("Worker " + name + " is working as " + job);
    }
}

class Student extends People {
    String school;

    public Student(int id, String name, int age, String school) {
        super(id, name, age);
        this.school = school;
    }

    public void study() {
        System.out.println("Student " + name + " is studying at " + school);
    }
}