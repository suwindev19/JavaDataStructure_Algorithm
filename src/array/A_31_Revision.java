package array;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Advantages
Index   : 0 1   2   3   4   5
elements: 1 5  -10  300 0   46
Random access feature
- therefore O(1)
- Random Access Memory (RAM)
        3       12       -2       9       5
                0x116    0x132    0x148   0x164
        ^
        |
        If you know the memory address of 3, you can calculate the memory address of other items
        memory address = array's address + index * data size (4 byte)
 Indexes
 Array Types
 ---------
 - static
 - dynamic - change dynamically at run time
 Applications
 ---------------------
 - due to random index access - O(1)

Array Operations
------------------
1. Adding items - to end of the array O(1)
2. if becomes full, allocate a larger chunk of memory in the RAM
    (usually 2 x the size of the actual array)
3. Copy the existing items one by one into the new array
    Due to this, resize is O(n)
    Trade off between memory and run-time trade off
4. Add numbers to arbitrary positions , therefore O(n) , items must be shifted
5. Remove last item from the end of array - O(1)
6. Remove item from arbitrary position
    O(1) , shift the elements

Advantages
-----------------
1. Random access O(1) - if we know the index
2. Fast data structure
3. O(1) manipulate from end of array
4. Not dynamic data structure
    Therefore resize O(n)
5. Cannot store items with different types - must be same data types

Linear search in array O(n)
Binary Search (Log n)
Hashtable O(1)

Collections
------------------------
Grow-able in Nature
Can store both homogenous or heterogenous

Array
- fixed in fize                 growable
- can hold only same data type  can hold both same or different data
- Memory point of view, you should not use arrays
- no underlying data structures - array itself is a data structure
- Can hold both primitive and object types
Collection
-----------
- build on some standard data structures and algorithms
- Can hold both object types


Collection Framework
--------------------
Collection is a group of discrete objects

Interface
Implementation : classes
Algorithms
- To put all classes, and algorithms in one place

Collection - a group of discrete objects in a single unit
------------
List
    - Group of objects at
    - Duplicates are allowed.
    - insertion order is preserved.
    - ArrayList
    - LinkedList
    - Vector
        - Stack
Set
    - Insertion order is not preserved. Duplicates are NOT allowed.
    - HashSet
    - LinkedHashSet
   - Sorted Set (Interface)
    - Navigable Set
        - previous, next
       - TreeSet class
Queue
    - FIFO order
    - PriorityQueue
    - Blocking Queue
        - Priority Blocking Queue
        - Linked Blocking Queue

Map
    - Key, Value pair
    - HashMap
        - LinkedHashMap
    - WeakHashMap
    - Identity HashMap
    - Hashtable extends abstract Dictionary
        - Properties
    - SortedMap
        - Navigable Map
            TreeMap

Collection Hierarchy
---------------------
Collection : A group of discrete objects
There is no concrete class which implements Collection directly
Collection
- boolean add(Object o)
- boolean addAll(Collection c)
- boolean remove(Object o)
- boolean removeAll(Collection c)
- boolean retainAll(Collection c)
- void clear() - remove all elements
- boolean contains(Object o)
- boolean containsAll(Collection c)
- boolean isEmpty()
- int size()
- Iterator iterator()
- Object[ ] toArray() - converts invoking collection to Array

Collection vs Collections
-----------------------------
Collection (Utility Class) - root level interface of framework
- List
- Set
- Queue

Collections
- sort()
- reverse()
- shuffle()
- binarySearch()
- disjoint()

Generics
------------
Purpose
- to provide type safety
What is type safety?
A group of elements is type safe if it is bound to have a single type of member.
e.g. Array - can hold only one data type.
- To solve the problem related to type-casting in collection
- To enable developer to write less redundant code
Java is a statically typed language


 */
public class A_31_Revision
{
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        for(int i : findDuplicates_InPlace(nums)){
            System.out.println(i);
        }
    }

    // O(n)
    // Space O(1)
    // 1, 2, 2, 3, 3, 3, 4
    // -1
    //
    public static List<Integer> findDuplicates_InPlace(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            if (nums[Math.abs(nums[i])] > 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else{
                list.add(Math.abs(nums[i]));
            }
        }
        return list;
    }

    public static List<Integer> findDuplicates_HashMap(int[] nums){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            if (set.contains(nums[i]) == false){
                set.add(nums[i]);
            } else{
                list.add(nums[i]);
            }
        }
        return list;
    }

    //------------------------------------------------------------------
//    // Anagram : Check whether two words (phrases) are anagrams or not!
//    // An anagram is a word or phrase formed by arranging the letters
//    public static void main(String[] args) {
//        String s1 = "restful";
//        String s2 = "fluster";
//        System.out.println(isAnagram(s1, s2));
//
//    }
//    public static final int CHAR = 256;
//
//    public static boolean isAnagram(String s1, String s2){
//
//        int[] alphabet = new int[CHAR];
//
//        if (s1.length() != s2.length()){
//            return false;
//        }
//        for(int i =0; i < s1.length();i++){
//            alphabet[s1.charAt(i) -'a']--;
//            alphabet[s2.charAt(i) - 'a']++;
//        }
//
//        for(int i =0; i < alphabet.length; i++){
//            if (alphabet[i] > 0)
//                return false;
//        }
//        return true;
//    }

    //---------------------------------------------------
    // ArrayList use standard arrays under the hood
    // Good programming practice to use interface
//    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Apple"); // O(1)
//        names.add("Orange");
//        names.add("Strawberry");
//        names.add("Dragon Fruit");
////        System.out.println(names.get(0));
////        System.out.println(names.remove(2)); // O(n)
////        System.out.println(names.get(2));
//        System.out.println(names.size());
//        for (String name: names){
//            System.out.println(name);
//        }
//    }

    //------------------------------------------------------
//    public static void main(String[] args) {
//        int[] nums = new int[10];
//        for(int i = 0; i < 10; i++){
//            nums[i] = i;
//        }
//        for(int i =0; i < 10; i++){
//            if (nums[i] == 6){
//                System.out.println("We have found the item!");
//            }
//        }
//    }
}
