
class StaticandVoid {

    static int count = 0;

    StaticandVoid() {
        count++;
    }

    public static void main(String[] args) {
        StaticandVoid d1 = new StaticandVoid();
        StaticandVoid d2 = new StaticandVoid();
        StaticandVoid d3 = new StaticandVoid();
        StaticandVoid d4 = new StaticandVoid();

        System.out.println("Num of Objects : " + count);

    }
}
