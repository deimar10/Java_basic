package week3;

public class Ex43 {
    public static double sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        double sumNumbers = sum(4, 3, 6, 1);
        System.out.println("Sum: " + sumNumbers);
    }
}
