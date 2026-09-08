
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if (n < 2) {
            System.out.println("No second largest distinct value");
            return;
        }

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long current = scan.nextLong();

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
