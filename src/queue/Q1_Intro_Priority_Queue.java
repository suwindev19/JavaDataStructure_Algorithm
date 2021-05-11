package queue;

import java.util.*;

/*
    Collection
        Queue (Interface
        /       \
 LinkedList     Priority Queue              Blocking Queue
                                              /         \
                                Priority Blocking         Linked Blocking
                                Queue                     Queue

  boolean add(E e)
  boolean offer(E e) // add elements at the tail of queue // or according to priority
  remove() // remove elements , return head of queue // throws no such exeception if
  poll() // if queue is empty, it returns null
  element() // returns head of queue without removing it
  peek()

Priority Queue - objects to be processed as per priority
default or custom sorting order


 */
public class Q1_Intro_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(20);
//        PriorityQueue pq2 = new PriorityQueue(int initialCapacity, Comparator c);
        SortedSet s = new TreeSet();
//        PriorityQueue pq3 = new PriorityQueue(SortedSet s);
        ArrayList l = new ArrayList();
        PriorityQueue pq4 = new PriorityQueue(l);


    }
}
