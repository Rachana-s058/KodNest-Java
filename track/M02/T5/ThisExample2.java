
import java.util.Scanner;

class ThisExample2 {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();

        ThisExample2 student = new ThisExample2();
        student.setName(nameInput);
        student.displayName();
    }
}
