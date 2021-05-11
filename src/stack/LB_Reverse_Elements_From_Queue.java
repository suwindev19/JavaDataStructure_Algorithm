package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LB_Reverse_Elements_From_Queue {
    public static void main(String[] args) {
        int K = 2;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Queue<Integer> reversed = reverseElementsFromQueue(queue, K);

        while (!reversed.isEmpty()) {
            System.out.println(reversed.remove() + " ");
        }
    }

    public static Queue<Integer> reverseElementsFromQueue(Queue<Integer> queue, int K ) {

        Queue<Integer> input = new LinkedList<>();
        Stack<Integer> tempStack = new Stack<>();

        //Load K elements from Queue to Stack
        for (int i=0;i<K;i++) {
            tempStack.push(input.remove());
        }
        int currQueueLength =  input.size();

        //Enqueue elements from Stack to Queue
        for (int i=0;i<K;i++) {
            input.add(tempStack.pop());
        }

        //
        for (int i=0;i<currQueueLength;i++) {
            int data = tempStack.pop();
            input.add(data);
        }
        return input;

    }


}
/*
1. Deque k elements from given queue and push them into temporary stack
Queue<int> input = new Queue<int>();
Stack<int> temp = new Stack<int>();

//Load K elements from Queue to Stack
for (int i=0;i<K;i++)
{
	temp.Push(input.DeQueue())
}
int currentLengthOfQueue = input.Count();

//Enqueue elements from Stack to Queue
for (int i=0;i<K;i++)
{
	input.EnQueue(temp.Pop());
}

//
for (int i=0;i<currentLengthOfQueue;i++)
{
	input.EnQueue(input.DeQueue());
}

 */