
class Array {

    void search(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 9};
        Array as = new Array();
        as.search(a, 1);
    }
}
