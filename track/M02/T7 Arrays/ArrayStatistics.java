
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the array size
        int size = sc.nextInt();

        // 2. Create an integer array using runtime size
        int[] arr = new int[size];

        // 3. Read and store all array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 4. Initialize minimum and maximum with the first element
        int min = arr[0];
        int max = arr[0];

        // 5-7. Traverse the remaining elements and update min/max
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 8. Display the final minimum and maximum values
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
