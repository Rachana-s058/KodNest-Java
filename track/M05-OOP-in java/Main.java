
class Parent {

    int a = 10;
}

class Child extends Parent {

    int a = 20;

    void disp2() {
        System.out.println("Parents a:" + super.a);
        System.out.println("Childs a:" + a);
    }
}

public class Main {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.disp2();
    }
}
