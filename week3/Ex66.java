package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex66 {
    public static int greatest(ArrayList<Integer> arrlist) {
        return Collections.max(arrlist);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(3);
        arrlist.add(6);
        arrlist.add(21);
        arrlist.add(15);

        System.out.println(greatest(arrlist));

    }
}
