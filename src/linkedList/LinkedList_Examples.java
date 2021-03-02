package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
implements List interface
        Collection
            |
           List
            ^
            |
            |
 Queue<---- LinkedLIst ---->Deque
 Deque = allow for insertion and deletion at O(1)
 Head and Tail references


 ArrayDeque also implements Queue and Deque.
 ArrayList is more common.
LinkedList
   - doubly linked list
   - near time environment , in any case, use LinkedList
   - insert at the beginning
ArrayDeque use resizable array.
Not wasting space


Methods of LinkedList
---------------------
1. add(x)                   Theta(1)
2. add(index, x)            Theta(index)
3. contains(x)              O(n)
4. remove(index)            Theta(n)
5. get(index)               Theta(n)
6. set(index, x)            Theta(index)
7. indexOf(x)               O(n)
8. lastIndexOf(x)           O(n)
9. isEmpty()                O(1)

LinkedList also implements Queue and Deque

Queue

First ->    Queue  Last
remove()           add()

Queue
-----
        add(), remove(), element() gives you the element for moving
        offer() returns false if you cannot add item, true if you can add item.
        poll(), peek()

Deque
-----
        Add and remove elements at first and end at the same time

        Throws an exception
        addFirst(x), removeFirst(), getFirst(),
        addLast(x), removeLast(), getLast(),

        returns boolean values
        offerFirst(x)
        offerLast(x)

        returns null
        pollFirst(), pollLast()

Do not need to pre-allocate the space, no extra nodes , randomly link the nodes

 */
public class LinkedList_Examples {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
        int n  = 7, k = 3;
        System.out.println(josephus(n, k));
    }

    // Josephus Problem
    // Use circular Linked List
    /*
    input n = 7, k = 3

     */

    public static int josephus(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        while(list.size()>1)
        {
            int count= 0;

            while(count<k)
            {
                while(it.hasNext() && count<k)
                {
                    it.next();
                    count++;
                }

                if(count<k)
                {
                    it= list.iterator();
                    it.next();

                    count++;
                }
            }
            it.remove();


        }

        return list.getFirst();
    }
}
