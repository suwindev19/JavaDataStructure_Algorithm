package hashing;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5, 0.75f, true){
//            protected boolean removedEldestEntry(Map.Entry e){
//                return size()>5;
//            }
        };

        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3, "C");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(5, "E");


        String s1 = linkedHashMap.get(2);
        s1 = linkedHashMap.get(2);
        s1 = linkedHashMap.get(1);


        linkedHashMap.put(6, "F");

        linkedHashMap.forEach((k,v)->System.out.println(k + " " + v));

    }
}
