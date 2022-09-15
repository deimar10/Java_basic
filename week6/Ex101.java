package week6;

import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Library Library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }
        System.out.println("---");
        for (Book book: Library.searchByPublisher("Penguin Group")) {
            System.out.println(book);
        }
        System.out.println("---");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }

    }

}
