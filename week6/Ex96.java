package week6;

public class Ex96 {
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

}


