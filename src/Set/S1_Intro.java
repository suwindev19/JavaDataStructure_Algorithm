package Set;

import java.text.CompactNumberFormat;
import java.util.*;

/*
Set Interface API
- Insertion order is not preserved
- duplicates are not allowed.
- accept heterogeneous objects
- 8, 2, 3, "hello", true, 4.5;
- use all methods present in Collections interface
- HashSet implements set interface.
    LinkedHashSet - child class of HashSet
- SortedSet - implements Set interface
    NavigableSet
    TreeSet

HashSet
    - Search are frequency operation, therefore, it is fastest.
    - Hashing for managing search
    - HashTable - underlying data structure
    - duplicates is not allowed
    - insertion order is not preserved
    - can add heterogeneous elements
    - add null value
    - implement Serializable and cloneable interface

What is HashTable?
Internally, use hashtable concept to add.
Generate hashcode for the passed object.


NavigableSet
------------------
- sub interface of SortedSet
- contains methods related to navigation functionality
- Both SortedSet and NavigableSet has same class : TreeSet to implement them
 */
public class S1_Intro {
    public static void main(String[] args) {
        // Constructors
//        HashSet hs1 = new HashSet(); // initial capacity is 16
//        HashSet hs2 = new HashSet(30);
//        HashSet hs3 = new HashSet(30, 0.80f);
//------------------------------------------------------------------------
        // LinkedHashSet
        // insertion order should be maintained, while duplicates are not allowed
        // undelying data structure is Combination of linkedlist and hashtable
//        LinkedHashSet lhs1 = new LinkedHashSet();
//        LinkedHashSet lhs2 = new LinkedHashSet(30);
//        LinkedHashSet lhs3 = new LinkedHashSet(30, 0.80f);
//-------------------------------------------------------------------------
        // SortedSet - sub interface of Set
        // Properties - Insertion order maintain, insertion should be done in some sort of insertion order
        // NavigableSet
        // TreeSet is the implementation class
        // Collection -> Set -> SortedSet -> Navigable Set -> TreeSet
//        SortedSet ss1 = new TreeSet();
        // Methods - first(), last(), headSet(), tailSet(), subSet(Object o, Object p), comparator()
        // sorting order - methods to find the position
        // natural sorting order, ascending order
//        ss1.add(5);
//        ss1.add(45);
//        ss1.add(-2);
//        ss1.add(12);
//        ss1.add(10);
//        System.out.println(ss1.first());
//        System.out.println(ss1.last());
//        System.out.println(ss1.headSet(45));
//        System.out.println(ss1.tailSet(12));
//---------------------------------------------------------------------------
//          // NavigableSet
//            NavigableSet ns = new TreeSet();
//            ns.add(10);
//            ns.add(20);
//            ns.add(30);
//            ns.add(40);
//        System.out.println(ns.floor(15));
//        System.out.println(ns.lower(15));
//        System.out.println(ns.ceiling(15));
//        System.out.println(ns.higher(15));
////        System.out.println(ns.pollFirst());
////        System.out.println(ns.pollLast());
//        // returns the navigable set in reverse order
//        System.out.println(ns.descendingSet());
//---------------------------------------------------------------------------
        // TreeSet - allows only homogeneous elements
        // Therefore it is better to use generic syntax
        // anyobject you pass into TreeSet must implement comparable interface
        // Root - balanced tree
        // root, less than root (left) , more than root (right)
        // insert null value to tree only when the treeSet is empty
        // you won't be able to add anything after that
        TreeSet ts = new TreeSet<Integer>(); // Homogeneous and comparable
        TreeSet ts1 = new TreeSet<Comparator>(); // customised sorting
        SortedSet s = new TreeSet();
        TreeSet ts2 = new TreeSet(s);
        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);


    }
}
