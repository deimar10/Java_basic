package Week7;

import java.util.HashMap;
public class Dictionary {
    private HashMap<String, String> translations;
    public Dictionary() {
        translations = new HashMap<>();
    }
    public String translate(String word){
        return translations.get(word);
    }

    public void add(String word, String translation){
        translations.put(word, translation);
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
    }
}
