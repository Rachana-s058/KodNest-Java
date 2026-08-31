
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long val = scanner.nextLong();
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        long difference = max - min;
        System.out.println(difference);

        scanner.close();
    }
}
