
public class Student2 {

    String name;
    int age;
    double height;

    Student2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Raja", 19, 4.5);
        s1.display();

    }
}
