package week6;

import java.util.Arrays;

public class Ex98 {

    public static void main(String[] args) {
        int [] original = {1, 2, 3, 4};
        int copied[] = copy(original);

        copied[0] = 99;

        System.out.println( Arrays.toString(original));
        System.out.println( Arrays.toString(copied));
    }
    public static int[] copy(int[] original) {
        int[] array = new int[original.length];
        for (int i = 0 ; i < original.length ; i++) {
            array[i] = original[i];
        }
        return array;
    }
}


