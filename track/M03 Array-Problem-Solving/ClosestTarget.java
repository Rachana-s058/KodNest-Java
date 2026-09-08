
import java.util.Scanner;

public class ClosestTarget {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }

        // ADD THIS LINE: Read target from input
        long target = scan.nextLong();

        long closestVal = arr[0];
        long minDiff = Math.abs(arr[0] - target);

        for (int i = 1; i < n; i++) {
            long currentDiff = Math.abs(arr[i] - target);

            if (currentDiff < minDiff || (currentDiff == minDiff && arr[i] < closestVal)) {
                minDiff = currentDiff;
                closestVal = arr[i];
            }
        }

        System.out.println(closestVal);
    }
}
