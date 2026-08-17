
public class ArrayTraceChanges {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        // 1. Create independent snapshot of the original data
        int[] snapshot = new int[original.length];
        for (int index = 0; index < original.length; index++) {
            snapshot[index] = original[index];
        }

        // 2. Create a live-view alias pointing to original
        int[] liveView = original;

        // 3. Update one element through the alias safely
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updateValue;
        }

        // Print Original array
        System.out.print("Original: ");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Print Snapshot array
        System.out.print("Snapshot: ");
        for (int val : snapshot) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Print reference comparison
        System.out.println("Same object: " + (liveView == original));

        // Safely handle requestedIndex
        System.out.print("Requested value: ");
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println(original[requestedIndex]);
        } else {
            System.out.println("Invalid index");
        }
    }
}
