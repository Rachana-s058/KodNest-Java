
import java.util.Scanner;

public class CountRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        long lower = scanner.nextLong();
        long upper = scanner.nextLong();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
