package hashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
// predictable ordering

/*
O(1)
-----
get
put
containsKey
Even in worst case, it is O(1)
size
isEmtpy

O(n)
-----
containsValue

LRU cache
 */

public class HM_3_LinkedHashMap {
    public static void main(String[] args) {
        // special Least Recently Used cache
        // special constructor
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();// type inference
        LinkedHashMap<Integer, String> lru = new LinkedHashMap<>(3,0.6f, true); // load factor means when you should start re-hashing , means bigger table will be created.
        // accessOrder -
        m.put(1, "Osaka");
        m.put(2, "Nagoya");
        m.put(3, "Sapporo");

        System.out.println(m.get(1));
        System.out.println(m);
        m.put(2, "Okinawa");
        System.out.println(m);
        m.put(4, "Hyogo");
    }


}
