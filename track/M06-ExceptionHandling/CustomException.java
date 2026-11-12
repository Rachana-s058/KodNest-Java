
import java.util.Scanner;

class CustomException {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();

        try {
            dl.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UnderAgeException extends Exception {

    UnderAgeException() {
        super("Your too young... still have a time");

    }
}

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException();
            throw uae;
        } else {
            System.out.println("Driving Licence will be issued");
        }
    }
}
