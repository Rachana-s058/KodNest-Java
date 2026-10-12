
public class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();
    }
}
