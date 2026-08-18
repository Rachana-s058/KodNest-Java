
public class ReorderPlanner {

    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;

        int reorderCount = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= reorderLevel) {
                reorderCount++;
            }
        }

        System.out.println("Items to reorder: " + reorderCount);
    }
}
