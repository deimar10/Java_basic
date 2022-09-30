package week6;

public class Ex97 {
    public static void printElegantly(int[] array) {
        for (int number : array) {
            System.out.print( number + " , ");
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

}
