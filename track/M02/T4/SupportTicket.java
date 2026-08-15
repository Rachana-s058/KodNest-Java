
import java.util.Scanner;

class SupportTicket {

    // Declare id, priority and waitingMinutes
    int id;
    int priority;
    int waitingMinutes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket t1 = new SupportTicket();
        t1.id = scanner.nextInt();
        t1.priority = scanner.nextInt();
        t1.waitingMinutes = scanner.nextInt();

        // Create and fill the second ticket
        SupportTicket t2 = new SupportTicket();
        t2.id = scanner.nextInt();
        t2.priority = scanner.nextInt();
        t2.waitingMinutes = scanner.nextInt();

        // Create and fill the third ticket
        SupportTicket t3 = new SupportTicket();
        t3.id = scanner.nextInt();
        t3.priority = scanner.nextInt();
        t3.waitingMinutes = scanner.nextInt();

        // Initially select the first ticket
        SupportTicket selected = t1;

        // Compare the second ticket using the ordered rules
        if (isBetter(t2, selected)) {
            selected = t2;
        }

        // Compare the third ticket with the current selection
        if (isBetter(t3, selected)) {
            selected = t3;
        }

        // Print the selected object's fields
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }

    private static boolean isBetter(SupportTicket candidate, SupportTicket current) {
        if (candidate.priority != current.priority) {
            return candidate.priority > current.priority;
        }
        if (candidate.waitingMinutes != current.waitingMinutes) {
            return candidate.waitingMinutes > current.waitingMinutes;
        }
        return candidate.id < current.id;
    }
}
