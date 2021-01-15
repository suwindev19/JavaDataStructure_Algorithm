package hashing;
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> treeMap = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C",3, "D"));
        treeMap.put(4, "E");
        treeMap.put(6, "G");

//        Entry<Integer, String> e = treeMap.firstEntry();
//        System.out.println(treeMap.ceilingEntry(5).getValue());
//        System.out.println(treeMap.containsKey(4));
//        System.out.println(treeMap);
//        System.out.println(e.getKey() + " " + e.getValue());
    }
}
