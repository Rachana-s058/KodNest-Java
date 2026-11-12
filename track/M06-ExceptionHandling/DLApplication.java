
import java.util.Scanner;

class DLApplication {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();

        try {
            dl.verify();
        } catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }
}

class UnderAgeException extends Exception {

    UnderAgeException() {
        super("You're too young... still have time");
    }
}

class OverAgeException extends Exception {

    OverAgeException() {
        super("Your too old.... take rest");

    }
}

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException();
            throw uae;
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("Driving Licence will be issued");
        }
    }
}
