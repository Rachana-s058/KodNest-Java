
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));

        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("Kod"));
        System.out.println(str.indexOf("K"));
        System.out.println(str.length());
        System.out.println(str.replace("e", "A"));
        System.out.println(str.replace("e", "i"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));

    }
}
