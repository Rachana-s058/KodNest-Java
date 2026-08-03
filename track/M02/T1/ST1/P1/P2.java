
public class P2 {

    public static void main(String[] args) {
        // write your code here
        int completedtopics = 17;
        int totaltopics = 20;
        int dailylearninghours = 3;
        int learningdays = 5;

        int remainingtopics = totaltopics - completedtopics;
        int weeklylearn = dailylearninghours * learningdays;
        double progressPercentage = (double) completedtopics * 100 / totaltopics;

        System.out.println("Completed Topics: " + completedtopics);
        System.out.println("Remaining Topics: " + remainingtopics);
        System.out.println("Weekly Learning Hours: " + weeklylearn);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
