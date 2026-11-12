
import java.util.Scanner;

public class ExceptionRethrow {

    public static void main(String[] args) {
        System.out.println("Main method execution started...");
        divide();
        System.out.println("Main method execution completed");
    }

    static void divide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int result = a / b;
        System.out.println(result);

    }
