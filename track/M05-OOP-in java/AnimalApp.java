punlic class Monkey extends Animal{
    @Override
    void eat(){
        System.out.println("Monkey steals and eats");
    }
}

public class Tiger extends Animal{
    @Override
    void eat(){
        System.out.println("Tiger hunts nd eats");
    }
}

public class AnimalApp{
    public static void main(String[] args){
        m.eat();
        m.sleep();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
    }
}