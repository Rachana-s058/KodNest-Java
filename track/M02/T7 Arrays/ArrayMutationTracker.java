
public class ArrayMutationTracker {

    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // Create snapshot with the same length
        int[] snapshot = new int[readings.length];

        // Copy each value from readings into snapshot using a loop
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // Replace readings[updateIndex] with newValue
        readings[updateIndex] = newValue;

        // Print snapshot array
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + (i == snapshot.length - 1 ? "" : " "));
        }
        System.out.println();

        // Print updated readings array
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + (i == readings.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}
