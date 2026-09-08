
import java.util.Scanner;

public class NonRepeatingValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long val = scan.nextLong();

            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val > smallest && val < secondSmallest) {
                secondSmallest = val;
            }
        }
        if (secondSmallest == Long.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondSmallest);
        }
        scan.close();
    }
}
