
class EqualsIgnore {

    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "jaVa";

        if (str1 == str2) {
            System.out.println("Ref are same");
        } else {
            System.out.println("ref are not same");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}
