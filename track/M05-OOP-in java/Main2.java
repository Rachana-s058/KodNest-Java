
class Parent {

    void disp1() {
        System.out.println("Inside Parent display");
    }

    void disp2() {
        System.out.println("Inside Child display");
    }
}

 class Child extends Parent {

    @Override
    void disp2() {
        System.out.println("Inside Child Display2");
    }

    void disp3() {
        System.out.println("Inside Child Disp3");
    }
}

public class Main2 {

    public static void main(String[] args) {
        Child c = new Child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}
