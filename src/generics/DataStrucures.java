package generics;
/*
int size()
boolean contains(Object o)
Iterator<
List
---------------
An ordered collection of elements
- allows duplicates
- insertion order is always preserved
- List allows position access to elements


Implementation classes
----------------------
List a = new ArrayList<>();
List b = new LinkedList<>();
list c = new Vector<>();
list d = new Stack<>();

ArrayList
------------------
underlying data structure for ArrayList is array
- resizable or growable array
- insertion order is preserved.
- accepts heterougenous object


Objects should be serializable

Location 1 ---> location2

Cloneable
==========
Object1 ----> Object2

Random Access Interface
=======================
- marker interface
ArrayList Implements three interfaces
- serializable
- cloneable
- random access interface

Any random element can be accessed in same speed
- Insertion and Deletion O(n) , therefore, not recommended

LinkedList
=================
- duplicate objects are allowed
- insertion order is preserved
- null insertion is possible
- accepts heterogenous objects

 */


import LinkedListProblems.LinkedList;

import java.util.List;

public class DataStrucures {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

    }
}
