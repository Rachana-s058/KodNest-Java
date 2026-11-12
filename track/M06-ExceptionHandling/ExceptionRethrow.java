
import java.util.Scanner;

public class ExceptionRethrow {

    public static void main(String[] args) {
        System.out.println("Main method execution started...");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in main method");
        }
        System.out.println("Main method execution completed");
    }

    static void divide() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception handled in divide method");
            throw e;
        } finally {
            System.out.println("Division Completed");
        }
    }
}

