
import java.util.Scanner;

public class Equilibrium {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[] arr = new long[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
            totalSum += arr[i];
        }

        long leftSum = 0;
        int equilibriumIndex = -1;
        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum += arr[i];
        }
        System.out.println(equilibriumIndex);
    }
}
