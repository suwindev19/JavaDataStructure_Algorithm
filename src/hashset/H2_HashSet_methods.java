package hashset;

import java.util.HashSet;
import java.util.Iterator;
/*
HashSet methods
add , remove, contains
add()
contains()
iterator()

size()
remove()
isEmpty()
clear()

 */
public class H2_HashSet_methods {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        // add() function ignores the item if it is already in the hashtable

        h.add("apple");
        h.add("orange");
        h.add("grape");
        System.out.println(h);
        // returns boolean value
        System.out.println(h.contains("apple"));
        h.remove("apple");
        System.out.println(h.size());

        Iterator<String> it = h.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        for (String s: h) {
            System.out.println(s);
        }
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.size());
    }
}
