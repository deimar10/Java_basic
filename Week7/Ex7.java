package Week7;

import java.util.ArrayList;
public class Ex7 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        int wordCount = dictionary.amountOfWords();
        System.out.println("Word count: " + wordCount); // prints "Word count: 2"

        ArrayList<String> list = dictionary.translationList();
        System.out.println("Translation list: " + list); // prints "Translation list: [hello = hola, goodbye = adios]"
    }
}
