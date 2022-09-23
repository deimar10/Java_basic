package week8;

public class Ex10_2 {
    public static void main(String[] args) {
        MilitaryService day1 = new MilitaryService(362);
        day1.work();
        System.out.println("Days left after working: " + day1.getDaysLeft());
    }
}
