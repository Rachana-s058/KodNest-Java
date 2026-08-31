
import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextLong();
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
