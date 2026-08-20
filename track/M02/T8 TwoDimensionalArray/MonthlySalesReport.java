
import java.util.Scanner;

public class MonthlySalesReport {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read matrix dimensions: products and months
        int products = scan.nextInt();
        int months = scan.nextInt();

        // Create 2D sales array
        int[][] sales = new int[products][months];

        // Read sales data into matrix
        for (int i = 0; i < products; i++) {
            for (int j = 0; j < months; j++) {
                sales[i][j] = scan.nextInt();
            }
        }

        // Calculate and print total sales for each product
        for (int i = 0; i < products; i++) {
            int productTotal = 0; // Reset productTotal for every product row
            for (int j = 0; j < months; j++) {
                productTotal += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + productTotal);
        }

        scan.close();
    }
}
