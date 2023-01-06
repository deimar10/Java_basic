package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        translations = new HashMap<>();
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public int amountOfWords() {
        return translations.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        Set<String> keys = translations.keySet();
        for (String key : keys) {
            String value = translations.get(key);
            list.add(key + " = " + value);
        }
        return list;
    }
}
