
import java.util.Scanner;

public class Checkpoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Read array size and elements
        int arraySize = scan.nextInt();
        int[] arr = new int[arraySize];
        int arrayTotal = 0;

        for (int i = 0; i < arraySize; i++) {
            arr[i] = scan.nextInt();
            arrayTotal += arr[i];
        }

        // 2. Read matrix dimensions and elements
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        // 3. Output results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scan.close();
    }
}
