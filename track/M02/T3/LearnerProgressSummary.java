
import java.util.Scanner;

public class LearnerProgressSummary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        String fullName = scanner.nextLine();

        int days = scanner.nextInt();

        int totalSolved = 0;
        for (int i = 0; i < days; i++) {
            totalSolved += scanner.nextInt();
        }

        // Calculate and display the progress summary
        double average = (double) totalSolved / days;
        String status;
        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
