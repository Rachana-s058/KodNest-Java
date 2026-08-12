
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integer marks from input
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create the ResultCalculator object
        ResultCalculator r1 = new ResultCalculator();

        // Calculate totals using overloaded methods
        int totalTwo = r1.getTotal(first, second);
        int totalThree = r1.getTotal(first, second, third);

        // Print outputs with required formatting
        System.out.println("Two-Mark Total: " + totalTwo);
        System.out.println("Three-Mark Total: " + totalThree);
    }
}
