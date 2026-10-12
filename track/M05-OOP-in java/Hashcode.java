
import java.util.Objects;

public class Hashcode {

    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Hashcode s = (Hashcode) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    Hashcode(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Hashcode h1 = new Hashcode(11, "Arjun");
        Hashcode h2 = new Hashcode(12, "Raju");
        Hashcode h3 = new Hashcode(11, "Arjun");

        Object h4 = new Hashcode(22, "Ravi");

        System.out.println(h1.getClass());
        System.out.println(h4.getClass());

    }
}
