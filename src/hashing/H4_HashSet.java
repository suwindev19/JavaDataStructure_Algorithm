package hashing;

import java.util.HashSet;
import java.util.Iterator;
/*
add() - ignores if the item has been added to the list. Set is unique.
Order is not guaranteed in HashSet

contains()
iterator()
size()
remove()
isEmpty()
clear() - clear the contents of the HashSet

Time Complexity
O(1) on average, since it uses Hashing
--------------------------------------
add()
remove()
contains() searching item

size()
isEmpty()
 */
public class H4_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        System.out.println(hs);
        System.out.println(hs.contains("Banana"));
        // for each loop
        for(String s : hs){
            if (s == "Banana"){
                hs.remove(s);
            }
        }
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        // using Iterator
        Iterator<String> i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+ " ");
        }
    }
}
