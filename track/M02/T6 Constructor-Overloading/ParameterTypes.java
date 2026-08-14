
public class ParameterTypes {

    String name;
    int age;
    double height;

    ParameterTypes() { // 0 Parameterized Constructor
        name = "Anu";
        age = 17;
        height = 4.6;
    }

    ParameterTypes(String name) { // Parameterized Constructor
        this.name = name;
    }

    ParameterTypes(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
        ParameterTypes s1 = new ParameterTypes("Raja", 18, 5.5);
        s1.display();

        ParameterTypes s2 = new ParameterTypes("Manu");
        s2.display();

        ParameterTypes s3 = new ParameterTypes("Raja", 18, 5.5);
        s3.display();
    }

}
