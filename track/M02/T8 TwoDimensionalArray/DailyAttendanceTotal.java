
import java.util.Scanner;

public class DailyAttendanceTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        // Read the matrix (row-wise: each row is a class)
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display total attendance for every day (column-wise traversal)
        for (int j = 0; j < days; j++) {
            int total = 0; // Reset the total for every day
            for (int i = 0; i < classes; i++) {
                total += attendance[i][j];
            }
            System.out.println("Day " + (j + 1) + " total: " + total);
        }

        scanner.close();
    }
}
