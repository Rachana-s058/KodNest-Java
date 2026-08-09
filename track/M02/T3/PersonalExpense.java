
import java.util.Scanner;

public class PersonalExpense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montlyIncome = scanner.nextDouble();
        double rontExponse = scanner.nextDouble();
        double foodExponse = scanner.nextDouble();
        double travelExponse = scanner.nextDouble();

        double totalExpense = rontExponse + foodExponse + travelExponse;
        double remainingAmount = montlyIncome - totalExpense;

        String status;
        if (remainingAmount >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
