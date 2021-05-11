package hashMap;

import java.util.HashMap;
import java.util.Map;
// put, contains, key, remove, get O(1)
// size(), isEmpty - O(1)
public class HM_2_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("Osaka", 10);
        m.put("Nagano", 15);
        m.put("Nagoya", 20);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey()+ " " + e.getValue());
        }
        if(m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");
        m.remove("Nagoya");
        System.out.println(m.size());
    }
    
}
