package hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/*
Quick search, insert, delete
Collection
Must have distinct elements
Cannot have duplicates in all TreeSet, HashSet, LinkedHashSet
Implements Hashing and hash data structure.
Therefore order does not matter

TreeSet maintains order -> Red black - self balancing tree
When can we use, HashSet, or Tree
some collections of keys, insert, search, delete -> O(1)
TreeSet -> Maintain a queue doubly ended priority queue
Linked Hashset maintains the insertion order. Therefore use LinkedHashSet
SortedSet
NavigableSet - float, ceiling, higher, lower
Search, insert, delete => HashSet

 */

public class H1_Set_Interface {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);

        s2.add(30);
        s2.add(20);
        s2.add(40);
        // Union
        s.addAll(s2);
        System.out.println(s);
        // Intersection
        s.retainAll(s2);

        // Difference
        s.removeAll(s2);
        int[] arr =  new int[]{2, 2, 3, 4, 5};
        // remove all duplicates from the array Arrays.asList(pass in the array));
//        Set<Integer> s3 = new HashSet<Integer>(Arrays.asList(arr));




    }
}
