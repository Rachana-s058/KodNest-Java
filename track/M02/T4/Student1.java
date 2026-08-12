
import java.util.Scanner;

class Student1 {

    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        Student1 firstStudent = new Student1();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        Student1 secondStudent = new Student1();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();
        Student1 selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (selectedId == firstStudent.registrationId) {
            selectedStudent = firstStudent;
        } else if (selectedId == secondStudent.registrationId) {
            selectedStudent = secondStudent;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");
    }
}
