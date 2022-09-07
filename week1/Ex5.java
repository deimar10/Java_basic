package week1;

public class Ex5 {
    public static void main(String[] args) {
        int Days = 365;
        int Hours = 24;
        int Minutes = 60;
        int Seconds = 60;

        int secondsInYear = Days * Hours * Minutes * Seconds;
        System.out.println("There are " + (secondsInYear) +  " seconds in a year");
    }
}
