
import java.util.Scanner;

public class LearnerProfile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read and display the profile
        String fname = scanner.next();
        int problemsSolved = scanner.nextInt();
        Double assessment = scanner.nextDouble();

        System.out.println("Learner: " + fname);
        System.out.println("Problems solved: " + problemsSolved);
        System.out.println("Assessment: " + assessment);

        scanner.close();
    }
}
