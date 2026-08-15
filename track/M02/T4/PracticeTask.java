
import java.util.Scanner;

class PracticeTask {

    // Declare id
    int id;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three different PracticeTask objects and read their IDs
        PracticeTask first = new PracticeTask();
        PracticeTask second = new PracticeTask();
        PracticeTask third = new PracticeTask();

        first.id = scanner.nextInt();
        second.id = scanner.nextInt();
        third.id = scanner.nextInt();

        // Preserve the first ID as a primitive int
        int unreachableId = first.id;

        // Create relay and perform the five reference assignments in order
        PracticeTask relay = first;
        first = second;
        second = third;
        relay = second;
        third = first;

        // Print the final IDs reached by all four references
        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);
    }
}
