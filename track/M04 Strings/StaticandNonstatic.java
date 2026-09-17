
class StaticandNonstatic {

    static {
        System.out.println("1st static-Block executed.");
    }

    static {
        System.out.println("2nd static-Block executed.");
    }

    static {
        System.out.println("3rd static-Block executed.");
    }

    {
        System.out.println("1st non-static-Block executed.");
    }

    {
        System.out.println("2nd non-static-Block executed.");
    }

    {
        System.out.println("3rd non-static-Block executed.");
    }

    public static void main(String[] args) {
        StaticandNonstatic sn1 = new StaticandNonstatic();
        StaticandNonstatic sn2 = new StaticandNonstatic();
        StaticandNonstatic sn3 = new StaticandNonstatic();

    }

}
