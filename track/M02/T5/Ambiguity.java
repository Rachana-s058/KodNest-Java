
public class A {

    void method(short a, short b) {
        return a + b;
    }

    void method(int a, int c) {
        return a + b;
    }

    public static void main(String[] args) {

        A a = new A();
        a.method(10, 10);
    }
}
