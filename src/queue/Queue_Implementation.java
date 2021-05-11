package queue;

import java.util.ArrayList;
import java.util.List;

class MyQueue{
    // Store elements
    private List<Integer> data;
    // Pointer to indicate the starting point
    private int p_start;
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start =0;
    }

   // Insert the element into the queue. Returns true if the
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    // Delete the element from the queue. Returns true if the operation is
    // successful
    public boolean dequeue() {
        if (data.isEmpty() == true){
            return false;
        }
        p_start++;
        return true;
    }

    // Get the front item from the queue
    public int getItemFront(){
        return data.get(p_start);
    }

    // Check if the queue is empty
    public boolean isQueueEmpty(){
        return p_start >= data.size();
    }
}

public class Queue_Implementation {
    public static void main(String[] args) {

    }
}
