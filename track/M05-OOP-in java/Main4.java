class Parent{
    void display1(){
        System.out.println("Inside Parent display");
    }
    void display2(){
        System.out.println("Inside parent display2");
    }
}

class Child1 extends Parent{
    @Override
    void display2(){
        System.out.println("Inside child display");
    }

    void display3(){
        System.out.println("Inside Child1 display2");
    }

    void display3(){
        System.out.println("Inside Child1 display3");
    }
}

class Child2 extends Parent{
    @Override
    void display2(){
        System.out.println("Inside Child2 display2");
    }

    void display3(){
        System.out.println("Inside Child2 display3");
    }
}

public class mai