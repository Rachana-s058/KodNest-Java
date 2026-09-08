
import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += scan.nextInt();
        }
        long missingNumber = expectedSum - actualSum;

        System.out.println(missingNumber);
    }
}
