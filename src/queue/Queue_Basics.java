package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.peek()); // peek() - next item to be removed. It does not remove
        System.out.println(q.poll()); // remove the first item and return the removed item
        System.out.println(q.peek());
    }
}
