
import java.util.Scanner;

public class SubarrayTarget {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        long target = scan.nextLong();

        int left = 0;
        long currentSum = 0;
        boolean found = false;

        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == target && left <= right) {
                System.out.println(left + " " + right);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}
