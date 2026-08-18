
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];

        // Loop to read 5 integer values
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int total = 0;

        // Loop to calculate the total sum
        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }

        // Print the final result in the required format
        System.out.println("Total: " + total);
    }
}
