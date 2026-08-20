
import java.util.Scanner;

public class SeatAnalyzer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read matrix dimensions
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        // Create 2D array
        int[][] seats = new int[rows][columns];

        int availableCount = 0;

        // Read seat values and count available seats (0s)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = scan.nextInt();
                if (seats[i][j] == 0) {
                    availableCount++;
                }
            }
        }

        // Output result
        System.out.println("Available seats: " + availableCount);

        scan.close();
    }
}
