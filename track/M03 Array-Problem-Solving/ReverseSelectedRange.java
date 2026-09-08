
import java.util.Scanner;

public class ReverseSelectedRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int left = scan.nextInt();
        int right = scan.nextInt();

        if (left < 0 || right >= n || left > right) {
            System.out.println("-1");
            scan.close();
            return;
        }

        int i = left;
        int j = right;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
            if (k < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scan.close();
    }
}
