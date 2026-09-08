
import java.util.Scanner;

public class Repeatjava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] count = new int[n + 1];
        int repeating = -1;

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            count[val]++;
            if (count[val] == 2) {
                repeating = val;
            }
        }
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
                break;
            }
        }
        System.out.println(repeating + " " + missing);
    }
}
