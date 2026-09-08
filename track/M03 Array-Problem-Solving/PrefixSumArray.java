
import java.util.Scanner;

public class PrefixSumArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long currentSum = 0;
        long[] prefixSum = new long[n];
        for (int i = 0; i < n; i++) {
            currentSum += scan.nextInt();
            prefixSum[i] = currentSum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + (i < n - 1 ? " " : ""));
        }
        System.out.println();
    }
}
