
import java.util.Scanner;

public class MaxSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        int k = scan.nextInt();

        long currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += arr[i];
        }
        long maxWindowSum = currentWindowSum;
        for (int i = k; i < n; i++) {
            currentWindowSum += arr[i] - arr[i - k];
            if (currentWindowSum > maxWindowSum) {
                maxWindowSum = currentWindowSum;
            }
        }
        System.out.println(maxWindowSum);
    }
}
