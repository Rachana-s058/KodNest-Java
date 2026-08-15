
import java.util.Scanner;

class CabBooking {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    // Constructor for Quick Booking (1 parameter)
    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    // Constructor for Custom Booking (3 parameters)
    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    // Method to display the booking receipt
    void displayBooking() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read choice
        int choice = scanner.nextInt();
        // Read passenger name
        String passengerName = scanner.next();

        CabBooking booking;

        if (choice == 1) {
            // Create object using single-parameter constructor
            booking = new CabBooking(passengerName);
        } else {
            // Read additional inputs for custom booking
            String cabType = scanner.next();
            int distance = scanner.nextInt();
            // Create object using three-parameter constructor
            booking = new CabBooking(passengerName, cabType, distance);
        }

        // Display booking details
        booking.displayBooking();
    }
}
