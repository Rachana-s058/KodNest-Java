
class StringOverrideEqual {

    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        StringOverrideEqual s = (StringOverrideEqual) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    StringOverrideEqual(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StringOverrideEqual s1 = new StringOverrideEqual(11, "Arjun");
        StringOverrideEqual s2 = new StringOverrideEqual(12, "Raju");
        StringOverrideEqual s3 = new StringOverrideEqual(11, "Arjun");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
