
import java.util.Scanner;

public class MatrixTotal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read matrix dimensions
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // Calculate and print total for each row
        for (int i = 0; i < rows; i++) {
            int rowTotal = 0; // Reset rowTotal for every row
            for (int j = 0; j < columns; j++) {
                rowTotal += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + rowTotal);
        }

        scan.close();
    }
}
