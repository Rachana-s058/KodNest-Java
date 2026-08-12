
class EmpApplication {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }

    public static void main(String[] args) {
        EmpApplication e1 = new EmpApplication();
        e1.id = 11;
        e1.name = "Rachana";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        EmpApplication e2;
        e2 = e1;
        e2.id = 13;
        e2.name = "Raju";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }

}
