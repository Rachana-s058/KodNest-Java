
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return (distance * 5) + expressFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        // Create one DeliveryCalculator object
        DeliveryCalculator d1 = new DeliveryCalculator();

        int standardChargeValue = d1.calculateCharge(distance);
        int expressChargeValue = d1.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + standardChargeValue);
        System.out.println("Express Charge: " + expressChargeValue);

        scanner.close();
    }
}
