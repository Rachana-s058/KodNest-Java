
import java.util.Scanner;

public class Perfix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] perfix = new int[n];
        int sum = arr[0];
        perfix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = arr[i] + sum;
            perfix[i] = sum;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(perfix[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
