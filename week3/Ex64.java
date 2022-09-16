package week3;

import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> arrlist) {
        int sum = 0;
        for (Integer number : arrlist){
            sum += number;
        }
        return (double)sum / 4;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        arrlist.add(3);
        arrlist.add(2);
        arrlist.add(7);
        arrlist.add(2);

        System.out.println("The average is: " + average(arrlist));
    }
}

