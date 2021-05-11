package LinkedListProblems;

import java.beans.VetoableChangeListener;
import java.util.*;
import java.util.LinkedList;

/*
List Interface

ArrayList
----------
- worst for insertion and deletion
- Best for retrieving operations
- methods in ArrayList are synchronized
- performance is relatively high

LinkedList
----------
- best choice for insertion and deletion
- worst for retrieval operation (memory not consecutive)

Vector
------
- thread safe
- legacy class
- Underlying data structure is resizable or growable array
- insertion order is preserved.
- allows duplicate elements
- insertion order is preserved
- accepts heterogeneous objects
- Implements Serializable, Cloneable, Random Access Interfaces
- low performance

Stack
------------
- allows for duplications elements
- insertion ordre is preserved
- accepts heterogeneous objects
- LIFO
- only one constructor to create stack

Cursors (Access elements one by one)
------------------------------------
- indicator used to show the current position for respective object or element
- Enumeration - for legacy classes (vector / stack)
    - only for legacy classes
    - only read access, cannot remove any objects
- Iterator - for any classes, legacy or not
- ListIterator - for any List objects
    - sub interface of Iterator interface
- Spliterator


Enumeration
- legacy classes
- Directional flow - forward
- Only read access
- Object creation - elements() method of vector class
- Methods
    hasMoreELement()
    nextElement()

Iterator
- For any collection object
- forward direction
- read and write access
- iterator() method to create an object
- Methods
    hasNext()
    next()
    remove()

ListIterator
- for list class objects
- forward and backward
- read, remove, replace, and add
- ListIterator() method to create an object
- Methods
    hasNext()
    next()
    nextIndex()
    hasPrevious()
    previous()
    previousIndex()
    remove()
    add()
    set() // replace

- for each method - collection as well as stream
- for loops

List
    ArrayList
    LinkedList
    Vector (Legacy)
        Stack
Cursors
    Enumeration
    Iterator
    ListIterator

 */
public class LL_4_Practice {
    public static void main(String[] args){

        // ListIterator - sub interface of iterator interface
        // Bidirectional cursor
        //------------------------------------------------------
        ArrayList<String> food = new ArrayList<>();
        food.add("Soba");
        food.add("Curry");
        food.add("Ramen");
        System.out.println(food);

        // create a listiterator object
        // First create the object of the Cursor
        ListIterator li = food.listIterator();
        while (li.hasNext()){
            String item = (String) li.next();
            if (item.equals("Ramen")){
                li.add("Oishii");
            }
            if(item.equals("Soba")){
                li.remove();
            }
            if (item.equals("Curry")){
                li.set("Fried Onion");
            }
        }
        System.out.println(food);


        // Iterator (Unidirectional Cursor) - forward direction
        //------------------------------------------------------
//        ArrayList<Integer>  nums = new ArrayList<>();
//        nums.add(12);
//        nums.add(24);
//        nums.add(36);
//
//        Iterator itr = nums.iterator();
//        while (itr.hasNext()){
//            Integer i = (Integer) itr.next();
//            if ( i % 3 == 0){
//                System.out.println(i);
//            }
//        }

        //=============================================================
        // Cursor - Enumeration
        //-------------------------------------
//        Vector v = new Vector();
//        System.out.println("Enter the element : ");
//        for(int i =1 ; i <= 9; i++){
//            Scanner sc = new Scanner(System.in);
//            Integer n = sc.nextInt();
//            v.add(n);
//        }
//        System.out.println( "Vector : " + v);
//        Enumeration e = v.elements();
//        while (e.hasMoreElements()){
//            Integer element = (Integer) e.nextElement();
//            if (element % 3 == 0){
//                System.out.println(element);
//            }
//        }

        //=============================================================
        // Stack Class
        // underlying data structure is stack - LIFO
//        Stack s = new Stack<>();
//        s.add("Leetcode");
//        s.add("Code Forces");
//        s.push("Code Chef");
//        s.push(23);
//        System.out.println(s.search("Code Chef"));


        //=============================================================
        // Vector
//        Vector v = new Vector(); // resizable automatically
//        Vector v1 = new Vector(60);
//        Vector v2 = new Vector(50, 20);
//        v.add("Zukini");
//        v.add("Gyoza");
//        v.addElement("Hello");
//        v.add("Yum Cha");
//        v.add("Nacho");
//        v.add("Chips");
//        v.remove(1);
//        System.out.println(v.elementAt(3));
//        System.out.println(v.firstElement());
//        System.out.println(v.lastElement());
//        System.out.println(v.capacity());
//        System.out.println(v.size());
//
        //============================================================
//        LinkedList l = new LinkedList();
//        // Parameterized constructor
//       //  linkedList ll = new LinkedList<Collection c>();
//        l.add("Apple");
//        l.add("Dragon Fruit");
//        l.add(null);
//        l.set(2, "Terrace House");
//        l.add(1,"Yum Cha");
//        l.removeLast();
//        l.removeFirst();
//        l.addFirst("A rock can be a star");
//        System.out.println(l);
    }
}
