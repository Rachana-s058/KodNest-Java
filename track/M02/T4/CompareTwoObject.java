
import java.util.Scanner;

class CompareTwoObjects {

    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        CompareTwoObjects s1 = new CompareTwoObjects();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        CompareTwoObjects s2 = new CompareTwoObjects();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        // Compare both scores and print one result
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        } else if (s2.javaScore > s1.javaScore) {
            System.out.println(s2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}
