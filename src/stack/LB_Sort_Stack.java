package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LB_Sort_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(3);
        stack.add(10);
        stack.add(12);
        stack.add(2);

        Stack<Integer> sorted = sortStack(stack);
        while (!sorted.isEmpty()) {
            System.out.println(sorted.pop() + " ");
        }
    }

//    public static Deque<Integer> sortStack (Deque<Integer> stack) {
//        Deque<Integer> tempStack = new ArrayDeque<>();
//        while(!stack.isEmpty()) {
//            int temp = stack.pop();
//            while(!tempStack.isEmpty() && temp > tempStack.peek()) {
//                tempStack.push(temp);
//            }
//            stack.push(tempStack.pop());
//        }
//        return tempStack;
//    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int data = stack.pop();
            if (tempStack.isEmpty() || tempStack.peek() < data) {
                tempStack.push(data);
            } else {
                while(! (tempStack.peek() < data)) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(data);
            }
        }
        return tempStack;
    }

}
