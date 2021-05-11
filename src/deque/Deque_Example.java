package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
offerFirst
pollFirst() - remove the first item ,
pollLast()
addFirst
getFirst

 */
public class Deque_Example {
    public static void main(String[] args) {
        // Deque traversal
        //======================
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(12);
        d.addLast(18);

//        Iterator it = d.iterator();
        Iterator it = d.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println();
        for (int x : d) {
            System.out.println(x + " ");
        }
//        Deque<Integer> d = new ArrayDeque<>();
//        d.offerFirst(10);
//        d.offerLast(20);
//        d.offerFirst(5);
//        d.offerLast(15);
//
//        d.addFirst(23);
//
//        System.out.println(d.peekFirst());
//        System.out.println(d.getFirst());
//        System.out.println(d.peekLast());
//        d.pollFirst(); // if deque is empty , returns null, do not throw an exception . if deque itself contains null
//        d.pollLast();
//        d.removeFirst();
//        System.out.println(d.peekFirst());
//        System.out.println(d.getFirst());
    }
}
