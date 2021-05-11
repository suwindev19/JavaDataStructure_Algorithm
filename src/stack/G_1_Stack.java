package stack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;

public class G_1_Stack {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        // Time O(1)
        // Dynamic
        // Amortised Time complexity - do n operations, average time O(1), one of the operations can be costly
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
