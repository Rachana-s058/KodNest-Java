
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        int current = start;
        while (current <= end) {
            if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddCount++;
            }
        }

        current++;
    }

    System.out.println (

    "Even sum: " + evenSum);
    System.out.println (

    "Odd count: " + oddCount);

    scanner.close ();
}
}
