package week1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Type the radius");

        int radius = myobj.nextInt();
        double pi = 3.14;
        double circumference = 2 * pi * radius;

        System.out.println(circumference);
    }
}
