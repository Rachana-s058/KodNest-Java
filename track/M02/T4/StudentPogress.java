
import java.util.Scanner;

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;
    int percentage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one StudentProgress object
        StudentProgress sp = new StudentProgress();

        // Read and store name, completed lessons and total lessons
        sp.name = scanner.next();
        sp.completedLessons = scanner.nextInt();
        sp.totalLessons = scanner.nextInt();

        // Calculate and store the completion percentage
        sp.percentage = sp.completedLessons * 100 / sp.totalLessons;

        // Print the progress card
        System.out.println("Student: " + sp.name);
        System.out.println("Progress: " + sp.completedLessons + "/" + sp.totalLessons);
        System.out.println("Completion: " + sp.percentage + "%");
    }
}
