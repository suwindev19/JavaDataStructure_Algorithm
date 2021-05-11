package stack;

import java.util.LinkedList;
import java.util.Queue;

public class LB_Sort_Queue_Using_Stack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(9);
        queue.add(5);
        queue.add(10);
        queue.add(2);
    }

//    public static Queue<Integer> sortQueue_Using_Stack(Queue<Integer> queue) {
//
//    }
}

/*
Queue<int> input = new Queue<int>();
Stack<int> output = new Stack<int>();

While (!input.IsEmpty())
{
    int data = input.DeQueue();
    if (output.IsEmpty() || data > output.Peek())
	{
		output.Push(data);
	}
     else
	{
		while(output.Peek() > data)
		{
			input.EnQueue(output.Pop());
		}
		output.Push(data);
	}
}

 */