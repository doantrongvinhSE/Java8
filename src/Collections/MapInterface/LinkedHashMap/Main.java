package Collections.MapInterface.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<>();
        dictionary.put("Father", "Cha");
        dictionary.put("Mother", "Me");
        dictionary.put("Sister", "Chi, Em gai");
        dictionary.put("Brother", "Anh, Em trai");
        dictionary.put("Me", "Toi");
        dictionary.put(null, null);
        System.out.println(dictionary);
        

        // tuong tu HashMap chi khac la duy tri vi tri

    }
}
