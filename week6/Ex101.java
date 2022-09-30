package week6;

import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Library Library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);

    }

}
