
public class P4 {

    public static void main(String[] args) {

        double principle = 10000.0;

        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;

        int a = 78;
        int b = 84;
        int c = 69;
        int d = 91;
        int e = 88;

        double simpleInterest = principle * rate * time / 100.0;
        double totalAmount = principle + simpleInterest;
        double bmi = weight / (height * height);
        int totalMarks = a + b + c + d + e;
        double percentage = totalMarks * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
