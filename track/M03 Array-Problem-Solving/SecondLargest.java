
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            return;
        }

        int n = sc.nextInt();

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long current = sc.nextLong();

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current < largest && current > secondLargest) {
                secondLargest = current;
            }
        }

        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
    }
}
