package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
// Time O(n)
public class Reverse_First_K_Items_In_Queue {
    public static void main(String[] args) {
        int k =4;
        Queue<Integer> firstK = new ArrayDeque<>();
        firstK.offer(10);
        firstK.offer(20);
        firstK.offer(30);
        firstK.offer(40);
        firstK.offer(50);
        System.out.println(reverseFirst_K_Items(firstK, k));

    }
    public static Queue<Integer> reverseFirst_K_Items(Queue<Integer> queue, int k) {
        if (queue.size() < k || k == 0) return queue;
        Deque<Integer> tempStack = new ArrayDeque<>();
        for(int i =0; i < k; i++) {
            tempStack.push(queue.poll());
            System.out.println(tempStack.peek() + " ");
        }
        int currentQueueSize = queue.size();
        while(tempStack.isEmpty() == false) {
            queue.offer(tempStack.pop());
        }
        for(int i =0; i < currentQueueSize; i++) {
            int data = queue.poll();
            queue.offer(data);
        }
        return  queue;



//==========================================================================
//        Stack<Integer> tempStack = new Stack<>();
//        for (int i =0; i < k; i++) {
//            tempStack.push(queue.poll());
//        }
//        int currentQueueSize =  queue.size();
//        for(int i =0; i < k; i++) {
//            queue.offer(tempStack.pop());
//        }
//        for(int i =0; i < currentQueueSize;i++) {
//            int data = queue.poll();
//            queue.offer(data);
//        }
//        return queue;


    }
}
