
import java.util.Scanner;

class StudentObject {

    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one Student object
        StudentObject s1 = new StudentObject();

        // Read and store all values in the object
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.course = scanner.next();
        s1.javaScore = scanner.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);
    }
}
