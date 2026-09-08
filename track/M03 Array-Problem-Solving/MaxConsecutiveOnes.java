
import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();

            if (val == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                // Reset streak when an element is 0
                currentCount = 0;
            }
        }

        System.out.println(maxCount);
    }
}
