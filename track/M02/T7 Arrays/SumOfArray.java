
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Ente the elements : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum of array elements : " + sum);
    }
}
