
public class Frequency {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println(key + ": " + count);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 30};
        Frequency fs = new Frequency();
        fs.count(arr, 30);
    }
}
