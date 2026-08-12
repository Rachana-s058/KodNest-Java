
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        // Return price multiplied by quantity
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal + deliveryCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator o1 = new OrderCalculator();
        // Call both methods
        int calculatedSubtotal = o1.calculateSubtotal(price, quantity);
        int finalTotal = o1.calculateFinalTotal(calculatedSubtotal, deliveryCharge);

        // Print the returned values
        System.out.println("Subtotal: " + calculatedSubtotal);
        System.out.println("Final Total: " + finalTotal);
    }
}
