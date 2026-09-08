
import java.util.Scanner;

public class MaxSubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long firstVal = scan.nextLong();
        long maxSoFar = firstVal;
        long currentSum = firstVal;

        for (int i = 1; i < n; i++) {
            long val = scan.nextLong();

            currentSum = Math.max(val, currentSum + val);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        System.out.println(maxSoFar);
    }
}
