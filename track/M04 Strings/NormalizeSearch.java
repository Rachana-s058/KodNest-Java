
import java.util.Scanner;

public class Normalize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        String normalizedSentence = sentence.trim().toLowerCase();
        String normalizedKeyword = keyword.trim().toLowerCase();

        boolean found = normalizedSentence.contains(normalizedKeyword);

        System.out.println("Normalized text: " + normalizedSentence);
        System.out.println("Contains keyword: " + found);
    }
}
