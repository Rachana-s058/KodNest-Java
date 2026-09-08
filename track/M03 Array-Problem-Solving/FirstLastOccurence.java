
import java.util.Scanner;

public class FirstLastOccurence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        scanner.close();

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }
}
