package Collections.MapInterface.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Father", "Cha");
        dictionary.put("Mother", "Me");
        dictionary.put("Sister", "Chi, Em gai");
        dictionary.put("Brother", "Anh, Em trai");
        dictionary.put("Me", "Toi");
        dictionary.put(null, null);
        System.out.println(dictionary);

        // vi implement Map nen có 1 so pthuc co san tai Map interface

    }
}
