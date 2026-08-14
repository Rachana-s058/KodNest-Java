
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        String title = scanner.nextLine();
        String author = scanner.nextLine();

        // Create one Book object
        Book b1 = new Book(title, author);

        // Call display()
        b1.display();
    }
}
