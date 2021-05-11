package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
// Generic cannot be used for primitive data types, only for non-primitives
public class HM_1_Intro {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(1, "Japan"); // takes a key and value and add association of key and value in the map. If there is already an association, the key value will be updated.
        m.put(2, "Osaka");
        m.put(3, "Karuizawa");
        m.get(1);
        m.isEmpty();
        m.remove(1);
//================================================
        m.containsKey(1);
        m.containsValue("Osaka");
        m.replace(2, "Osaka", "Kansai");
        m.size();
//================================================
        m.keySet(); // set view of given keys
        m.values(); // return a collection view of values
        m.entrySet(); // return a set view of the mappings. Set map.entry(), nested interface
        m.entrySet();
        m.getOrDefault(1, "Tokyo");
        System.out.println(m);

    }
}
