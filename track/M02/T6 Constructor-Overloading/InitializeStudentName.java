
import java.util.Scanner;

class InitializeStudentName {

    String name;

    InitializeStudentName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();
        // Create one Student object
        InitializeStudentName s1 = new InitializeStudentName(name);
        // Call display()
        s1.display();

    }
}
