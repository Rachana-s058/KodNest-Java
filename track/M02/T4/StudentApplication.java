
import java.util.Scanner;

public class ObjectClass {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class StudentApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "Rachana";
        s2.height = 5.5;
        System.out.println(s1.roll);
        System.out.println("s1.name");
        System.out.println("s1.height");

        s1.run();

        Student s2 = new Student();
        s2.roll = 13;
        s2.name = "Shwetha";
        s2.height = 5.7;
        s2.sleep();
    }
}
