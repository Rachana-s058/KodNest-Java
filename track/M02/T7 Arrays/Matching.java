
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the target
        int target = scanner.nextInt();

        // Find and display the first matching index
        int foundIndex = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("First index: " + foundIndex);
    }
}
