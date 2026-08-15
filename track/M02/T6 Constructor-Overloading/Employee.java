
import java.util.Scanner;

class Employee {

    String name;
    String role;

    // No-argument constructor to set default role
    Employee() {
        this.role = "Trainee";
    }

    // Method to display profile details
    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create exactly one object using new Employee()
        Employee e1 = new Employee();

        // Read the employee name and store in object's name field
        e1.name = scanner.next();

        // Call displayProfile()
        e1.displayProfile();
    }
}
