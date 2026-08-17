
public class Main {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};

        // Define required variables
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // Create snapshot with the same length as original
        int[] snapshot = new int[original.length];

        // Copy every element into snapshot manually
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // Live view reference (alias)
        int[] liveView = original;

        // Update through liveView if updateIndex is valid
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        System.out.print("Original: ");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int val : snapshot) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (liveView == original));

        System.out.print("Requested value: ");
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println(original[requestedIndex]);
        } else {
            System.out.println("Invalid index");
        }
    }
}
