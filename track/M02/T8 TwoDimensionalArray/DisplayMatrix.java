
import java.util.Scanner;

public class DisplayMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read matrix dimensions
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Read matrix elements using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // Print matrix elements using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
