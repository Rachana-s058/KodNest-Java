
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store both parameters in the instance variables
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and salary
        String nameInput = scanner.nextLine();
        double salaryInput = scanner.nextDouble();

        // Create one Employee object
        Employee employee = new Employee();

        // Call setDetails() and displayDetails()
        employee.setDetails(nameInput, salaryInput);
        employee.displayDetails();
    }
}
