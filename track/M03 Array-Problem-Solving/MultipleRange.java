
import java.util.Scanner;

public class MultipleRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[] prefix = new long[n];
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += scan.nextLong();
            prefix[i] = currentSum;
        }
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int left = scan.nextInt();
            int right = scan.nextInt();

            if (left == 0) {
                System.out.println(prefix[right]);
            } else {
                System.out.println(prefix[right] - prefix[left - 1]);
            }
        }
    }
}
