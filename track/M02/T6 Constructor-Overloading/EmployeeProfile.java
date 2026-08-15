
import java.util.Scanner;

class EmployeeProfile {

    int id;
    String name;
    String department;

    // Parameterized constructor using this.id, this.name, and this.department
    EmployeeProfile(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to display stored details in the required format
    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee ID, name, and department
        int id = scanner.nextInt();
        String name = scanner.next();
        String department = scanner.next();

        // Create exactly one Employee object by passing inputs to constructor
        EmployeeProfile e1 = new EmployeeProfile(id, name, department);

        // Call displayProfile()
        e1.displayProfile();
    }
}
