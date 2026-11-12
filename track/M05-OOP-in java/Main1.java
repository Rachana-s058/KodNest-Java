
interface Shape {

    public abstract void input();

    public abstract void disp();
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void disp() {
        System.out.println("Display");
    }
}

public class Main1 {

    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.disp();
    }
}
