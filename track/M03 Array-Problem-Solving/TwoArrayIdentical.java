
import java.util.Scanner;

public class TwoArrayIdentical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] arr1 = new long[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextLong();
        }

        int m = scanner.nextInt();
        long[] arr2 = new long[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextLong();
        }

        if (n != m) {
            System.out.println(0);
            scanner.close();
            return;
        }

        boolean isIdentical = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                isIdentical = false;
                break;
            }
        }

        if (isIdentical) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
