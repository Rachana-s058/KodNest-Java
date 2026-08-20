
import java.util.Scanner;

class WaterTank {

    int capacity;
    int currentLevel;

    // Constructor using 'this' keyword
    public WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    // Method 1: Fill Water
    public int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int actualAdded = 0;

        if (amount <= availableSpace) {
            actualAdded = amount;
        } else {
            actualAdded = availableSpace;
        }

        currentLevel += actualAdded;
        return actualAdded;
    }

    // Method 2: Drain Water
    public int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int actualRemoved = 0;

        if (amount <= currentLevel) {
            actualRemoved = amount;
        } else {
            actualRemoved = currentLevel;
        }

        currentLevel -= actualRemoved;
        return actualRemoved;
    }

    // Method 3: Get Tank Status
    public String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }
        if (currentLevel == capacity) {
            return "Full";
        }

        double fillPercentage = (currentLevel * 100.0) / capacity;

        if (fillPercentage > 0 && fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage > 25 && fillPercentage <= 75) {
            return "Medium";
        } else if (fillPercentage > 75 && fillPercentage < 100) {
            return "High";
        }

        return "";
    }

    // Method 4: Display Tank Details
    public void displayTank() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + (capacity - currentLevel));
        System.out.println("Status: " + getStatus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read capacity, initial level, and total operations count
        int capacity = scanner.nextInt();
        int initialLevel = scanner.nextInt();
        int operationsCount = scanner.nextInt();

        WaterTank tank = new WaterTank(capacity, initialLevel);

        // Process operations
        for (int i = 1; i <= operationsCount; i++) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int fillAmount = scanner.nextInt();
                    int added = tank.fillWater(fillAmount);
                    System.out.println("Operation " + i + " - Filled: " + added);
                    break;

                case 2:
                    int drainAmount = scanner.nextInt();
                    int drained = tank.drainWater(drainAmount);
                    System.out.println("Operation " + i + " - Drained: " + drained);
                    break;

                case 3:
                    System.out.println("Operation " + i + " - Tank Status");
                    tank.displayTank();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

        // Display final tank status after all operations
        System.out.println("Final Tank Status");
        tank.displayTank();

        scanner.close();
    }
}
