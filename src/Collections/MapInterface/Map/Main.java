package Collections.MapInterface.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        // chen lien ket Key va Value vao map
        contacts.put("Vinh", "0985222xxx");
        contacts.put("Nam", "09852222122");
        contacts.put("Quoc", "0985222");
        contacts.put("Thien", "0922122");
        System.out.println(contacts);

        // putAll
        // contacts.putAll(contacts);

        // get Object by Key => return value else => null
        System.out.println(contacts.get("Thien"));

        // check contains
        System.out.println(contacts.containsKey("Vinh"));
        System.out.println(contacts.containsValue("0985222"));

        // replace
        contacts.replace("Nam", "");
        System.out.println(contacts);

        // remove
        contacts.remove("Nam");
        System.out.println(contacts);

        // return all key, value
        System.out.println(contacts.keySet());
        System.out.println(contacts.values());
        System.out.println(contacts.entrySet());

        // size
        System.out.println(contacts.size());

        // clear
        // contacts.clear();

        // check isEmpty
        System.out.println(contacts.isEmpty());

    }
}
