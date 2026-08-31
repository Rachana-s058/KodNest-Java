
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long firstVal = scanner.nextLong();
        long min = firstVal;
        long max = firstVal;

        for (int i = 1; i < n; i++) {
            long val = scanner.nextLong();
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }

        System.out.println(min + " " + max);

        scanner.close();
    }
}
