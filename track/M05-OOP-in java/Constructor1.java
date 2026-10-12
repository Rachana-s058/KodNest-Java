
class Parent {

    Parent(int a) {
        System.out.println("Parent Constructor");
    }

    class Child extends Parent {

        Child() {
            this(10);
            System.out.println("1st Child Constructor");
        }

        Child(int a) {
            this(10, 20);
            System.out.println("2nd child constructor");
        }

        Child(int a, int b) {
            System.out.println("3rd Child Constructor")
        }
    }

    public class Constructor {

        public static void main(String[] args) {
            Parent p = new Parent(10);
            Child c = new Child();
        }
    }
}
